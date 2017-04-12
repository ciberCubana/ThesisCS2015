package horariop4;

import dao.impl.AsignaturaDAOImpl;
import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import mapeo.Asignatura;
import modelo.Horario;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Administrador
 */
public class CC_Table implements  Serializable {

    public static Object[][] datos(CachedRowSet crs, int row, int column) throws SQLException {
        Object[][] datos = new Object[row][column];
        for (int i = 0; i < datos.length; i++) {
            crs.next();
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = crs.getString(j + 1);
            }
        }
        return datos;
    }

    public static void table(CachedRowSet crs, String[] ti, JTable jt) throws SQLException {
        int CantRows = crs.size();
        int CantColumn = ti.length;
        Object[][] datos = CC_Table.datos(crs, CantRows, CantColumn);
        final boolean[] canEdit2 = new boolean[ti.length];
        for (int i = 0; i < canEdit2.length; i++) {
            canEdit2[i] = false;
        }
        jt.setModel(new DefaultTableModel(datos, ti) {

            boolean[] canEdit = canEdit2;

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    public static boolean exportToEXEL(JTable[] table, File file, String nombreTab, Horario h) {
        Calendar c = Calendar.getInstance();
        AsignaturaDAOImpl adi = new AsignaturaDAOImpl();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(out);
            WritableSheet s = w.createSheet(nombreTab, 0);
            for (int k = 0; k < table.length; k++) {
                for (int i = 0; i < table[k].getColumnCount(); i++) {
                    String colName = table[k].getColumnName(i).toUpperCase();
        try {
            fecha = sdf.parse(colName);
        } catch (ParseException ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(fecha);
                    s.addCell(new jxl.write.Label(i+k*6, 0, c.getTime().toString().split(" ")[0]));
                    for (int j = 0; j < table[k].getRowCount(); j++) {
                        Object objeto = table[k].getValueAt(i, j);
                        if (objeto != null) {
                            if (objeto instanceof java.math.BigDecimal || objeto instanceof java.lang.Integer) {
                                s.addCell(new jxl.write.Number(i+k*6, j + 1, Double.parseDouble(objeto.toString())));
                            } else {
                                s.addCell(new jxl.write.Label(i+k*6, j + 1, objeto.toString()));
                                
                            }
                        }
                        s.addCell(new jxl.write.Label((k+1)*6, j + 1, ""));
                        s.addCell(new jxl.write.Label((k+1)*6-5, 8, "Sem_"+(k+1)));
                        s.addCell(new jxl.write.Label((k+1)*6-4, 8, "De:"+table[k].getColumnName(0)));
                        s.addCell(new jxl.write.Label((k+1)*6-4, 9, "A:"+table[k].getColumnName(4)));
                        
                    }   
                    
                }
                s.addCell(new jxl.write.Label(0, 11, "Codificación de Asignaturas:"));
                ArrayList<Asignatura> sem = adi.getAllAsignatura(h.getAno(), h.getCarrera());
            for (int i = 0; i < sem.size(); i++) {
                String aux = ""+ sem.get(i).getAbrev() + "-" + sem.get(i).getNombre()+ " HT: " + sem.get(i).getCantHC();
                s.addCell(new jxl.write.Label(0, 12 + i, aux));
            }
            s.addCell(new jxl.write.Label(9, 11, "Estructura del Horario:"));
            s.addCell(new jxl.write.Label(9, 12, "C: Conferencia"));
            s.addCell(new jxl.write.Label(9, 13, "P: ClasePractica"));
            s.addCell(new jxl.write.Label(9, 14, "E: Examen"));
            if (h.isSecM()){
                s.addCell(new jxl.write.Label(0, 10, "Sesion de la Mañana"));
            }
            if (h.isSecT()){
                s.addCell(new jxl.write.Label(0, 10, "Sesion de la Tarde"));
            }
                
            }
            //addcell(columna ,fila,kjsk)
            w.write();
            w.close();
            out.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (WriteException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean exportToEXEL1(String[] columnas, String[][] datos, File file, String nombreTab) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(out);
            WritableSheet s = w.createSheet(nombreTab, 0);
            for (int i = 0; i < columnas.length; i++) {
                String colName = columnas[i].toUpperCase();
                s.addCell(new jxl.write.Label(i, 0, colName));
                for (int j = 0; j < datos.length; j++) {
                    Object objeto = datos[j][i];
                    if (objeto != null) {
                        if (objeto instanceof java.math.BigDecimal || objeto instanceof java.lang.Integer) {
                            s.addCell(new jxl.write.Number(i, j + 1, Double.parseDouble(objeto.toString())));
                        } else {
                            s.addCell(new jxl.write.Label(i, j + 1, objeto.toString()));
                        }
                    }
                }
            }
            //addcell(columna ,fila,kjsk)
            w.write();
            w.close();
            out.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (WriteException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
