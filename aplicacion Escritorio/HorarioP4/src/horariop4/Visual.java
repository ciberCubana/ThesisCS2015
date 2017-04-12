package horariop4;

import dao.impl.GrupoDAOImpl;
import dao.impl.ProfesorDAOImpl;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mapeo.Asignatura;
import mapeo.Grupo;
import modelo.Desarrollo;
import modelo.Horario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 *
 * @author Neysi
 */
public class Visual extends javax.swing.JFrame implements Serializable {
    
    private static int[][] group = new int[4][5];
    private static int sem = 0;
    private static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<String> listFamily = new ArrayList<>();
    private static ArrayList<String> listFamily1 = new ArrayList<>();
    private static ArrayList<String> listDiasFer = new ArrayList<>();
    private static ArrayList<String> listPL = new ArrayList<>();
    private static ArrayList<String> listInicioC = new ArrayList<>();
    private static Grupo grupo = new Grupo();
    private static GrupoDAOImpl grupos = new GrupoDAOImpl();
    private static ArrayList<Grupo> delete = new ArrayList<>();
    private static ProfesorDAOImpl asig = new ProfesorDAOImpl();
    private static Horario h;
    private static ArrayList<Horario> horar = new ArrayList<>();
    private static ArrayList<Object> ses = new ArrayList<>();
    private static ArrayList<Object> ses1 = new ArrayList<>();
    private static int[][] aulasCCp;
    private static Date fecha = null;
    private static String path = "";
    public static boolean band = true;
    private static Media media = new Media();    
    public static Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    public static int w = (int) (pantalla.getWidth());
    public static int hh = (int) (pantalla.getHeight());
    
    private boolean validar(int fila, int columna, JTable jt) {
        
        if (jt.getValueAt(fila, columna) == null || jt.getValueAt(fila, columna) == "") {
            
            return false;
            
        } else {
            
            return true;
            
        }
        
    }
    
    private boolean validar1(int fila, int columna, JTable jt) {
        
        if (Integer.parseInt("" + jt.getValueAt(fila, columna)) <= 0) {
            
            return false;
            
        } else {
            
            return true;
            
        }
        
    }
    
  
    
    public   void exportar(JTable[] table, Horario ho) {
         File file = null;
        try {
            if (path.isEmpty()) {
                 JFileChooser find = new JFileChooser();
                find.setFileSelectionMode(JFileChooser.FILES_ONLY);
                FileNameExtensionFilter f = new FileNameExtensionFilter("*.xls", "xls");
                find.setFileFilter(f);
                if (JFileChooser.APPROVE_OPTION == find.showSaveDialog(this) || !path.isEmpty()) {
                    if (path.isEmpty()) {
                        file = find.getSelectedFile();
                        if (!f.accept(file)) {
                            if (file.exists()) {
                                file.delete();
                            }
                            path = file.getAbsolutePath();
                            file = new File(path + "_" + ho.getAno() + "-" + ho.getCarrera() + "-Grupo-" + ho.getNumero() + ".xls");  //file.getAbsolutePath()+"_"+ho.getAno()+"-"+ho.getCarrera()+"-Grupo-"+ ho.getNumero()
                            file.createNewFile();
                        } else if (!(find.getSelectedFile()).exists()) {
                            file.createNewFile();
                        }
                    } else {
                        file = new File(path + "_" + ho.getAno() + "-" + ho.getCarrera() + "-Grupo-" + ho.getNumero() + ".xls");  //file.getAbsolutePath()+"_"+ho.getAno()+"-"+ho.getCarrera()+"-Grupo-"+ ho.getNumero()
                        file.createNewFile();
                    }
                    
                    CC_Table.exportToEXEL(table, file, "Tabla", ho);
                }
            } else {
                file = new File(path + "_" + ho.getAno() + "-" + ho.getCarrera() + "-Grupo-" + ho.getNumero() + ".xls");  //file.getAbsolutePath()+"_"+ho.getAno()+"-"+ho.getCarrera()+"-Grupo-"+ ho.getNumero()
                file.createNewFile();
                CC_Table.exportToEXEL(table, file, "Tabla", ho);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo crear el archivo " + file.getAbsolutePath());
            
        }
    }
    
    private int mesesNumber(String mes) {
        int resp = 0;
        switch (mes) {
            case "Enero":
                resp = 1;
                break;
            case "Febrero":
                resp = 2;
                break;
            case "Marzo":
                resp = 3;
                break;
            case "Abril":
                resp = 4;
                break;
            case "Mayo":
                resp = 5;
                break;
            case "Junio":
                resp = 6;
                break;
            case "Julio":
                resp = 7;
                break;
            case "Agosto":
                resp = 8;
                break;
            case "Septiembre":
                resp = 9;
                break;
            case "Octubre":
                resp = 10;
                break;
            case "Noviembre":
                resp = 11;
                break;
            case "Diciembre":
                resp = 12;
                break;
        }
        return resp;
    }
    
    public Visual() {
        initComponents();
        this.setLocation((w - 450) / 2, (hh - 450) / 2);
        this.setIconImage(media.cIcon("iconoSoftware.png").getImage());
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                group[i][j] = 0;
            }
        }
        grupos.deleteAll();
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(2015, 2015, 2080, 1);
        
        jSpinner1.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(2015, 2015, 2080, 1);
        
        jSpinner9.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(2015, 2015, 2080, 1);
        
        jSpinner2.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(16, 1, 20, 1);
        
        jSpinner4.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(1, 1, 5, 1);
        
        jSpinner43.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(1, 1, 4, 1);
        
        jsGrupos.setModel(spinnerNumberModel);
        
        jsGrupos1.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(16, 1, 31, 1);
        
        jSpinner37.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(1, 1, 15, 1);
        
        jSpinner38.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(1, 1, 31, 1);
        
        jSpinner48.setModel(spinnerNumberModel);
        
        spinnerNumberModel = new SpinnerNumberModel(16, 1, 20, 1);
        
        jSpinnersemanas.setModel(spinnerNumberModel);
        spinnerNumberModel = new SpinnerNumberModel(2015, 2015, 2080, 1);
        
        jSpinnerAño.setModel(spinnerNumberModel);
//        String date = new java.util.Date().toString();
        Calendar c = Calendar.getInstance();
        fecha = c.getTime();
        c.setTime(fecha);
//        c.add(Calendar.DAY_OF_YEAR, 1);
//        System.out.println("" + c.getTime());
//        c.add(Calendar.DAY_OF_YEAR, 1);
//        System.out.println("" + c.getTime());
        String[] datos = fecha.toString().split(" ");
        
        jLabel121.setText(jLabel121.getText() + " " + datos[5]);
        int ano = Integer.parseInt(datos[5]);
        
        jLabel126.setText(jLabel126.getText() + " " + (ano + 1));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_PS_InicioCurso = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jcboxDiaInicio = new javax.swing.JComboBox();
        jcboxMesesInicio = new javax.swing.JComboBox();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jD_PS_CantGruposXCarreraAño = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jcboxCarr = new javax.swing.JComboBox();
        jcboxAno = new javax.swing.JComboBox();
        jsGrupos = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTcantAulas = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jD_PS_AulaSegunGrupo = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAulas = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTConfCp = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jD_PS_SesionClases = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jButton27 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jD_PS_SemFamil_FinAño = new javax.swing.JDialog();
        jLabel117 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jButton36 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton38 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox();
        jComboBox21 = new javax.swing.JComboBox();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jSpinner38 = new javax.swing.JSpinner();
        jLabel126 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jD_PS_TSU = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jD_PS_Carnaval_PLab = new javax.swing.JDialog();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSpinner42 = new javax.swing.JSpinner();
        jSpinner43 = new javax.swing.JSpinner();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        jSpinner44 = new javax.swing.JSpinner();
        jLabel67 = new javax.swing.JLabel();
        jSpinner48 = new javax.swing.JSpinner();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton11 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jD_PS_OtrosDiasFeriados = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListDiasFeriados = new javax.swing.JList();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jDejecutarAlgoritmo = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jD_SS_InicioCurso = new javax.swing.JDialog();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jSpinnersemanas = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jcboxDiaInicio1 = new javax.swing.JComboBox();
        jcboxMesesInicio1 = new javax.swing.JComboBox();
        jSpinnerAño = new javax.swing.JSpinner();
        jLabel95 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jComboBox22 = new javax.swing.JComboBox();
        jComboBox23 = new javax.swing.JComboBox();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jD_SS_CantGruposXCarreraAño = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jcboxCarr1 = new javax.swing.JComboBox();
        jcboxAno1 = new javax.swing.JComboBox();
        jsGrupos1 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTcantAulas1 = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jD_SS_AulaSegunGrupo = new javax.swing.JDialog();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTAulas1 = new javax.swing.JTable();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTConfCp1 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jD_SS_SesionClases = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jButton49 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jD_SS_TSU = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jComboBox27 = new javax.swing.JComboBox();
        jComboBox28 = new javax.swing.JComboBox();
        jComboBox29 = new javax.swing.JComboBox();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jD_SS_Carnaval_PLab = new javax.swing.JDialog();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jSpinner5 = new javax.swing.JSpinner();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel73 = new javax.swing.JLabel();
        jSpinner50 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jSpinner45 = new javax.swing.JSpinner();
        jSpinner46 = new javax.swing.JSpinner();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel76 = new javax.swing.JLabel();
        jSpinner51 = new javax.swing.JSpinner();
        jLabel77 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jD_SS_ViernesSanto = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        jSpinner31 = new javax.swing.JSpinner();
        jSpinner32 = new javax.swing.JSpinner();
        jSpinner33 = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jSpinner40 = new javax.swing.JSpinner();
        jSpinner41 = new javax.swing.JSpinner();
        jSpinner53 = new javax.swing.JSpinner();
        jButton24 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jD_SS_OtrosDiasFeriados = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListDiasFeriados1 = new javax.swing.JList();
        jButton25 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        acercade = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jD_PS_InicioCurso.setModal(true);
        jD_PS_InicioCurso.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jD_PS_InicioCursoWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de inicio del curso escolar:");

        jLabel3.setText("Día");

        jLabel4.setText("Mes");

        jLabel5.setText("Año");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad de semanas lectivas:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jcboxDiaInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jcboxMesesInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Septiembre", "Octubre" }));
        jcboxMesesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxMesesInicioActionPerformed(evt);
            }
        });

        jLabel36.setText("(excluyendo las semanas libres)");

        javax.swing.GroupLayout jD_PS_InicioCursoLayout = new javax.swing.GroupLayout(jD_PS_InicioCurso.getContentPane());
        jD_PS_InicioCurso.getContentPane().setLayout(jD_PS_InicioCursoLayout);
        jD_PS_InicioCursoLayout.setHorizontalGroup(
            jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                        .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addComponent(jLabel27))
                                    .addComponent(jLabel36)
                                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcboxDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcboxMesesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_InicioCursoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_InicioCursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jD_PS_InicioCursoLayout.setVerticalGroup(
            jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel27))
                    .addGroup(jD_PS_InicioCursoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcboxDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboxMesesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jD_PS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jD_PS_CantGruposXCarreraAño.setAlwaysOnTop(true);
        jD_PS_CantGruposXCarreraAño.setModal(true);

        jcboxCarr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "II", "M", "F", "CI" }));

        jcboxAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel18.setText("Carrera:");

        jLabel19.setText("Año:");

        jLabel20.setText("Grupos:");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton1.setText(" Añadir");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTcantAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTcantAulas);

        jLabel50.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel50.setText("Cantidad de grupos por carrera y año docente:");

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton6.setText("  Borrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel50)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcboxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboxCarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jsGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jcboxCarr))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jsGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcboxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jD_PS_CantGruposXCarreraAñoLayout = new javax.swing.GroupLayout(jD_PS_CantGruposXCarreraAño.getContentPane());
        jD_PS_CantGruposXCarreraAño.getContentPane().setLayout(jD_PS_CantGruposXCarreraAñoLayout);
        jD_PS_CantGruposXCarreraAñoLayout.setHorizontalGroup(
            jD_PS_CantGruposXCarreraAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_PS_CantGruposXCarreraAñoLayout.setVerticalGroup(
            jD_PS_CantGruposXCarreraAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jD_PS_AulaSegunGrupo.setAlwaysOnTop(true);
        jD_PS_AulaSegunGrupo.setModal(true);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Para cada grupo, diga el aula que le corresponde,");

        jTAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAulas.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTAulas);
        jTAulas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTConfCp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "AulaConf", "AulaCP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTConfCp.setToolTipText("");
        jTConfCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTConfCpKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTConfCp);

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel34.setText(" según la forma de docencia: ");

        javax.swing.GroupLayout jD_PS_AulaSegunGrupoLayout = new javax.swing.GroupLayout(jD_PS_AulaSegunGrupo.getContentPane());
        jD_PS_AulaSegunGrupo.getContentPane().setLayout(jD_PS_AulaSegunGrupoLayout);
        jD_PS_AulaSegunGrupoLayout.setHorizontalGroup(
            jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                        .addGroup(jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
            .addGroup(jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jD_PS_AulaSegunGrupoLayout.setVerticalGroup(
            jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_AulaSegunGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_PS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jD_PS_SesionClases.setAlwaysOnTop(true);

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1-CC", "2-CC", "3-CC", "4-CC", "5-CC", "1-F", "2-F", "3-F", "4-F", "5-F", "1-M", "2-M", "3-M", "4-M", "2-II", "3-II", "4-II", "5-II", "1-CI", "2-CI", "3-CI", "4-CI", "5-CI" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList4.setToolTipText("");
        jScrollPane13.setViewportView(jList4);

        jScrollPane14.setViewportView(jList5);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derechaflecha.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel7.setText("Mañana");

        jLabel10.setText("Tarde");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Sesión de Clases");

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierdaflecha.png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel11)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jD_PS_SesionClasesLayout = new javax.swing.GroupLayout(jD_PS_SesionClases.getContentPane());
        jD_PS_SesionClases.getContentPane().setLayout(jD_PS_SesionClasesLayout);
        jD_PS_SesionClasesLayout.setHorizontalGroup(
            jD_PS_SesionClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_PS_SesionClasesLayout.setVerticalGroup(
            jD_PS_SesionClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jD_PS_SemFamil_FinAño.setAlwaysOnTop(true);
        jD_PS_SemFamil_FinAño.setModal(true);

        jLabel117.setText("desde");

        jLabel118.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel118.setText("Semana de familiarización para primer año:");

        jLabel119.setText("Carrera");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "M", "F" }));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel120.setText("Fecha de vacaciones de Fin de Año:");

        jLabel121.setText("de diciembre de ");

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jScrollPane11.setViewportView(jList1);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel122.setText("Turnos de Profesor Guía:");

        jLabel123.setText("Día");

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" }));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        jLabel124.setText("Turno");

        jLabel125.setText("hasta");

        jLabel126.setText("de enero de ");

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jD_PS_SemFamil_FinAñoLayout = new javax.swing.GroupLayout(jD_PS_SemFamil_FinAño.getContentPane());
        jD_PS_SemFamil_FinAño.getContentPane().setLayout(jD_PS_SemFamil_FinAñoLayout);
        jD_PS_SemFamil_FinAñoLayout.setHorizontalGroup(
            jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                        .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel119))
                                .addGap(29, 29, 29)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                        .addComponent(jLabel125)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner38, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel126)
                                        .addGap(58, 58, 58))
                                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                        .addComponent(jLabel117)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner37, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel121)
                                        .addGap(39, 39, 39)))
                                .addComponent(jLabel122)
                                .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel123))
                                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56)
                                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel124)))
                                .addComponent(jLabel120)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jD_PS_SemFamil_FinAñoLayout.setVerticalGroup(
            jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_SemFamil_FinAñoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton38))
                            .addComponent(jButton37)))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(jLabel124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel120)
                .addGap(18, 18, 18)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jSpinner37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121))
                .addGap(18, 18, 18)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(jSpinner38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jD_PS_SemFamil_FinAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jD_PS_TSU.setAlwaysOnTop(true);
        jD_PS_TSU.setModal(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Semana"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(0).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox4));
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(1).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox5));
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(2).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox10));
        }

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel37.setText("Semanas de Trabajo Social:");

        jLabel41.setText("(solo los años q tengan TSU)");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox10.setSelectedItem("");
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5" }));
        jComboBox5.setSelectedItem("");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "CC", "II", "M", "F", "CI" }));
        jComboBox4.setSelectedItem("");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel37)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jD_PS_TSULayout = new javax.swing.GroupLayout(jD_PS_TSU.getContentPane());
        jD_PS_TSU.getContentPane().setLayout(jD_PS_TSULayout);
        jD_PS_TSULayout.setHorizontalGroup(
            jD_PS_TSULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_PS_TSULayout.setVerticalGroup(
            jD_PS_TSULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jD_PS_Carnaval_PLab.setAlwaysOnTop(true);

        jLabel57.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel57.setText("Semanas de Práctica Laboral:");

        jLabel58.setText("(solo los años que tengan PL)");

        jLabel59.setText("Año");

        jLabel60.setText("Carrera");

        jLabel61.setText("Semana inicio");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "II", "M", "F", "CI" }));

        jLabel62.setText("Semana fin");

        jLabel67.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel67.setText("Carnaval Universitario:");

        jLabel68.setText("Día");

        jLabel69.setText("Mes");

        jLabel70.setText("Docencia Afectada");

        jCheckBox14.setText("manana");

        jCheckBox15.setText("tarde");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jScrollPane12.setViewportView(jList2);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton11.setText(" Añadir");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton23.setText("  Borrar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel15.setText("Año");

        javax.swing.GroupLayout jD_PS_Carnaval_PLabLayout = new javax.swing.GroupLayout(jD_PS_Carnaval_PLab.getContentPane());
        jD_PS_Carnaval_PLab.getContentPane().setLayout(jD_PS_Carnaval_PLabLayout);
        jD_PS_Carnaval_PLabLayout.setHorizontalGroup(
            jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60)
                                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel59))
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner42)))
                            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jButton23)))
                        .addGap(48, 48, 48)
                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinner44)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel67)
                            .addComponent(jLabel57)
                            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel68)))
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel69))
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox15)
                                            .addComponent(jCheckBox14)))
                                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel70))))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton11)))
                .addContainerGap())
        );
        jD_PS_Carnaval_PLabLayout.setVerticalGroup(
            jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58)
                        .addGap(13, 13, 13))
                    .addGroup(jD_PS_Carnaval_PLabLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox15)
                        .addGap(34, 34, 34)))
                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel61))
                .addGap(7, 7, 7)
                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jD_PS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jD_PS_OtrosDiasFeriados.setAlwaysOnTop(true);
        jD_PS_OtrosDiasFeriados.setModal(true);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero", "Febrero" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel78.setText("Otras Afectaciones:");

        jLabel79.setText("Día");

        jLabel80.setText("Mes");

        jLabel81.setText("Año");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel82.setText("Motivo:");

        jScrollPane5.setViewportView(jListDiasFeriados);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel81)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addComponent(jTextField1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel78)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jD_PS_OtrosDiasFeriadosLayout = new javax.swing.GroupLayout(jD_PS_OtrosDiasFeriados.getContentPane());
        jD_PS_OtrosDiasFeriados.getContentPane().setLayout(jD_PS_OtrosDiasFeriadosLayout);
        jD_PS_OtrosDiasFeriadosLayout.setHorizontalGroup(
            jD_PS_OtrosDiasFeriadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_PS_OtrosDiasFeriadosLayout.setVerticalGroup(
            jD_PS_OtrosDiasFeriadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_PS_OtrosDiasFeriadosLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton29.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ejecAlg.png"))); // NOI18N
        jButton29.setText("Generar Horarios");
        jButton29.setToolTipText("");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton29)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDejecutarAlgoritmoLayout = new javax.swing.GroupLayout(jDejecutarAlgoritmo.getContentPane());
        jDejecutarAlgoritmo.getContentPane().setLayout(jDejecutarAlgoritmoLayout);
        jDejecutarAlgoritmoLayout.setHorizontalGroup(
            jDejecutarAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDejecutarAlgoritmoLayout.setVerticalGroup(
            jDejecutarAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDejecutarAlgoritmoLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jD_SS_InicioCurso.setAlwaysOnTop(true);
        jD_SS_InicioCurso.setModal(true);

        jLabel89.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel89.setText("Fecha de inicio del curso escolar:");

        jLabel90.setText("Día");

        jLabel91.setText("Mes");

        jLabel92.setText("Año");

        jLabel93.setText("Cantidad de semanas lectivas:");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jcboxDiaInicio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));

        jcboxMesesInicio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo" }));
        jcboxMesesInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxMesesInicio1ActionPerformed(evt);
            }
        });

        jLabel95.setText("(incluyendo las semanas de vacaciones)");

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "II", "M", "F" }));

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jScrollPane10.setViewportView(jList3);

        jLabel8.setText("Carrera");

        jLabel9.setText("Año");

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jD_SS_InicioCursoLayout = new javax.swing.GroupLayout(jD_SS_InicioCurso.getContentPane());
        jD_SS_InicioCurso.getContentPane().setLayout(jD_SS_InicioCursoLayout);
        jD_SS_InicioCursoLayout.setHorizontalGroup(
            jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89)
                    .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addComponent(jcboxDiaInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcboxMesesInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel90)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel91)
                                .addGap(55, 55, 55)))
                        .addGap(31, 31, 31)
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerAño, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel92))))
                    .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel93)))
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel94))
                            .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnersemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jD_SS_InicioCursoLayout.setVerticalGroup(
            jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboxDiaInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboxMesesInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel94)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_SS_InicioCursoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel93)
                            .addComponent(jSpinnersemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel95))
                                .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton32)
                                        .addGap(184, 184, 184))
                                    .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                        .addGroup(jD_SS_InicioCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jD_SS_InicioCursoLayout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(jButton33)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_SS_InicioCursoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        jD_SS_CantGruposXCarreraAño.setAlwaysOnTop(true);
        jD_SS_CantGruposXCarreraAño.setModal(true);

        jcboxCarr1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "II", "M", "F" }));
        jcboxCarr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxCarr1ActionPerformed(evt);
            }
        });

        jcboxAno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel21.setText("Carrera:");

        jLabel22.setText("Año:");

        jLabel30.setText("Grupos:");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton5.setText(" Añadir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTcantAulas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTcantAulas1);

        jLabel66.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel66.setText("Cantidad de grupos por carrera y año docente:");

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton10.setText(" Borrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel66)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcboxAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel30)
                                                .addGap(18, 18, 18)
                                                .addComponent(jsGrupos1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcboxCarr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jcboxCarr1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboxAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel30)
                    .addComponent(jsGrupos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jD_SS_CantGruposXCarreraAñoLayout = new javax.swing.GroupLayout(jD_SS_CantGruposXCarreraAño.getContentPane());
        jD_SS_CantGruposXCarreraAño.getContentPane().setLayout(jD_SS_CantGruposXCarreraAñoLayout);
        jD_SS_CantGruposXCarreraAñoLayout.setHorizontalGroup(
            jD_SS_CantGruposXCarreraAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_SS_CantGruposXCarreraAñoLayout.setVerticalGroup(
            jD_SS_CantGruposXCarreraAñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jD_SS_AulaSegunGrupo.setAlwaysOnTop(true);
        jD_SS_AulaSegunGrupo.setModal(true);

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel42.setText("Para cada grupo, diga el aula que le corresponde, ");

        jTAulas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAulas1.setCellSelectionEnabled(true);
        jScrollPane8.setViewportView(jTAulas1);
        jTAulas1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jTConfCp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "AulaConf", "AulaCP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTConfCp1);

        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel35.setText("segun la forma de docencia: ");

        javax.swing.GroupLayout jD_SS_AulaSegunGrupoLayout = new javax.swing.GroupLayout(jD_SS_AulaSegunGrupo.getContentPane());
        jD_SS_AulaSegunGrupo.getContentPane().setLayout(jD_SS_AulaSegunGrupoLayout);
        jD_SS_AulaSegunGrupoLayout.setHorizontalGroup(
            jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_AulaSegunGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_SS_AulaSegunGrupoLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jD_SS_AulaSegunGrupoLayout.createSequentialGroup()
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jD_SS_AulaSegunGrupoLayout.createSequentialGroup()
                        .addGroup(jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel35))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jD_SS_AulaSegunGrupoLayout.setVerticalGroup(
            jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_AulaSegunGrupoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(1, 1, 1)
                .addComponent(jLabel35)
                .addGap(3, 3, 3)
                .addGroup(jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jD_SS_AulaSegunGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jD_SS_SesionClases.setAlwaysOnTop(true);

        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1-CC", "2-CC", "3-CC", "4-CC", "5-CC", "1-F", "2-F", "3-F", "4-F", "5-F", "1-M", "2-M", "3-M", "4-M", "2-II", "3-II", "4-II", "5-II" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.setToolTipText("");
        jScrollPane16.setViewportView(jList6);

        jScrollPane17.setViewportView(jList7);

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierdaflecha.png"))); // NOI18N
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jLabel12.setText("Mañana");

        jLabel13.setText("Tarde");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Sesión de Clases");

        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derechaflecha.png"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel12)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel13))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jD_SS_SesionClasesLayout = new javax.swing.GroupLayout(jD_SS_SesionClases.getContentPane());
        jD_SS_SesionClases.getContentPane().setLayout(jD_SS_SesionClasesLayout);
        jD_SS_SesionClasesLayout.setHorizontalGroup(
            jD_SS_SesionClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_SS_SesionClasesLayout.setVerticalGroup(
            jD_SS_SesionClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jD_SS_TSU.setAlwaysOnTop(true);
        jD_SS_TSU.setModal(true);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carrera", "Año", "Semana"
            }
        ));
        jScrollPane15.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(0).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox4));
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(1).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox5));
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(2).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox10));
        }

        jLabel139.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel139.setText("Semanas de Trabajo Social:");

        jLabel140.setText("(solo los años q tengan TSU)");

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5" }));

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "CC", "II", "M", "F", "CI" }));

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140)
                    .addComponent(jLabel139)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel140)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jD_SS_TSULayout = new javax.swing.GroupLayout(jD_SS_TSU.getContentPane());
        jD_SS_TSU.getContentPane().setLayout(jD_SS_TSULayout);
        jD_SS_TSULayout.setHorizontalGroup(
            jD_SS_TSULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jD_SS_TSULayout.setVerticalGroup(
            jD_SS_TSULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_TSULayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jD_SS_Carnaval_PLab.setAlwaysOnTop(true);

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel71.setText("Mes");

        jLabel72.setText("Docencia Afectada");

        jLabel16.setText("Año");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "II", "M", "F", "CI" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel73.setText("Día");

        jLabel63.setText("Año");

        jLabel64.setText("Carrera");

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton41.setText(" Borrar");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel65.setText("Semanas de Práctica Laboral:");

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton19.setText(" Añadir");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel74.setText("(solo los años que tengan PL)");

        jLabel75.setText("Semana inicio");

        jScrollPane18.setViewportView(jList8);

        jCheckBox16.setText("tarde");

        jLabel76.setText("Semana fin");

        jLabel77.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel77.setText("Carnaval Universitario:");

        jCheckBox17.setText("manana");

        javax.swing.GroupLayout jD_SS_Carnaval_PLabLayout = new javax.swing.GroupLayout(jD_SS_Carnaval_PLab.getContentPane());
        jD_SS_Carnaval_PLab.getContentPane().setLayout(jD_SS_Carnaval_PLabLayout);
        jD_SS_Carnaval_PLabLayout.setHorizontalGroup(
            jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                        .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton41)
                                .addGap(106, 106, 106)))
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel64)
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel63))
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner51))
                            .addGap(48, 48, 48)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpinner45)
                                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel74)
                        .addComponent(jLabel77)
                        .addComponent(jLabel65)
                        .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSpinner50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel73)))
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel71))
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox16)
                                        .addComponent(jCheckBox17)))
                                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel72)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jD_SS_Carnaval_PLabLayout.setVerticalGroup(
            jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41))
                    .addComponent(jButton35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                            .addComponent(jLabel77)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel73)
                                .addComponent(jLabel71)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinner50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel65)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel74)
                            .addGap(13, 13, 13))
                        .addGroup(jD_SS_Carnaval_PLabLayout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox16)
                            .addGap(34, 34, 34)))
                    .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(jLabel64)
                        .addComponent(jLabel63)
                        .addComponent(jLabel75))
                    .addGap(7, 7, 7)
                    .addGroup(jD_SS_Carnaval_PLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(190, Short.MAX_VALUE)))
        );

        jD_SS_ViernesSanto.setAlwaysOnTop(true);

        jLabel32.setText("hasta");

        jLabel51.setText("desde ");

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setText("Semana de vacaciones de abril:");

        jLabel24.setText("Día");

        jLabel25.setText("Mes");

        jLabel26.setText("Año");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel28.setText("Turno de Profesor Guía:");

        jLabel29.setText("Día");

        jLabel31.setText("Turno");

        javax.swing.GroupLayout jD_SS_ViernesSantoLayout = new javax.swing.GroupLayout(jD_SS_ViernesSanto.getContentPane());
        jD_SS_ViernesSanto.getContentPane().setLayout(jD_SS_ViernesSantoLayout);
        jD_SS_ViernesSantoLayout.setHorizontalGroup(
            jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner31, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSpinner41, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(jSpinner32))
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner33, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jSpinner53))
                .addGap(19, 19, 19))
            .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel29)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                        .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel28)))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jD_SS_ViernesSantoLayout.setVerticalGroup(
            jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jD_SS_ViernesSantoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jD_SS_ViernesSantoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jD_SS_OtrosDiasFeriados.setAlwaysOnTop(true);

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", " " }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel84.setText("Otras afectciones:");

        jLabel85.setText("Día");

        jLabel86.setText("Mes");

        jLabel87.setText("Año");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel88.setText("Motivo:");

        jScrollPane7.setViewportView(jListDiasFeriados1);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_1.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FLECHA_2.png"))); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel87)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel88))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                .addGap(32, 32, 32))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jButton42))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jD_SS_OtrosDiasFeriadosLayout = new javax.swing.GroupLayout(jD_SS_OtrosDiasFeriados.getContentPane());
        jD_SS_OtrosDiasFeriados.getContentPane().setLayout(jD_SS_OtrosDiasFeriadosLayout);
        jD_SS_OtrosDiasFeriadosLayout.setHorizontalGroup(
            jD_SS_OtrosDiasFeriadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_SS_OtrosDiasFeriadosLayout.setVerticalGroup(
            jD_SS_OtrosDiasFeriadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        acercade.setAlwaysOnTop(true);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/about.png"))); // NOI18N

        jLabel38.setText("<html>Aplicación basada en aprendizaje reforzado </html>");

        jLabel39.setText("para generar horarios automáticamente ");

        jLabel40.setText("teniendo en cuenta  un conjunto de restricciones.");

        jLabel43.setText("Neysi Parada Gamboa");

        jLabel44.setText("Luis Angel Medina Castillo");

        jLabel45.setText("2014 - 2015");

        javax.swing.GroupLayout acercadeLayout = new javax.swing.GroupLayout(acercade.getContentPane());
        acercade.getContentPane().setLayout(acercadeLayout);
        acercadeLayout.setHorizontalGroup(
            acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acercadeLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGroup(acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acercadeLayout.createSequentialGroup()
                        .addGroup(acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(acercadeLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)))
                            .addGroup(acercadeLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel43))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(acercadeLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel45)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        acercadeLayout.setVerticalGroup(
            acercadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acercadeLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(acercadeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(41, 41, 41)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema generador de horarios MFC");
        setLocationByPlatform(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        jMenu1.setText("Restricciones");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenuItem1.setText("Primer Semestre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenuItem2.setText("Segundo Semestre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 153));
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenu2.setLabel("Base de Datos");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem3.setText("Eliminar Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 0, 0));
        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem4.setText("Ayuda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem5.setText("Acerca de Cronos v1.0");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jD_PS_AulaSegunGrupo.pack();
        jD_PS_CantGruposXCarreraAño.dispose();
        String day = "" + jcboxDiaInicio.getSelectedItem() + "/" + mesesNumber("" + jcboxMesesInicio.getSelectedItem()) + "/" + jSpinner9.getValue();
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model1 = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupo"});
        model1.setColumnIdentifiers(new String[]{"AulaConf", "AulaCP"});
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                model1.addRow(new Object[]{0, 0});
                filas++;
                h = new Horario(day, Integer.parseInt("" + jSpinner4.getValue()), grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero(), false, false);
                horar.add(h);
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                model1.addRow(new Object[]{0, 0});
                h = new Horario(day, Integer.parseInt("" + jSpinner4.getValue()), grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero(), false, false);
                horar.add(h);
            }
        }
        jTAulas.setModel(model);
        jTAulas.setEnabled(false);
        jTConfCp.setModel(model1);
        jD_PS_AulaSegunGrupo.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_AulaSegunGrupo.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int c = jcboxCarr.getSelectedIndex();
        int f = jcboxAno.getSelectedIndex();
        String ano = "";
        switch (f) {
            case 0:
                ano = "1er";
                break;
            case 1:
                ano = "2do";
                break;
            case 2:
                ano = "3er";
                break;
            case 3:
                ano = "4to";
                break;
            case 4:
                ano = "5to";
                break;
        }
        if (group[c][f] < Integer.parseInt("" + jsGrupos.getValue())) {
            for (int i = group[c][f]; i < Integer.parseInt("" + jsGrupos.getValue()); i++) {
                grupo.setNumero(i + 1);
                grupo.setAno(f + 1);
                grupo.setCarrera("" + jcboxCarr.getSelectedItem());
                grupo.setAulaConf(0);
                grupo.setAulaCp(0);
                grupos.insert(grupo);
            }
            group[c][f] = Integer.parseInt("" + jsGrupos.getValue());
        } else {
            group[c][f] = Integer.parseInt("" + jsGrupos.getValue());
            for (int i = 0; i < group[c][f]; i++) {
                grupo.setNumero(i + 1);
                grupo.setAno(f + 1);
                grupo.setCarrera("" + jcboxCarr.getSelectedItem());
                grupo.setAulaConf(0);
                grupo.setAulaCp(0);
                grupos.insert(grupo);
            }
        }
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupos"});
        
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                filas++;
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
            }
        }
        
        jTcantAulas.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Planificará el segundo semestre" + "\n" + "¿Desea continuar?") == 0) {
            jD_SS_InicioCurso.pack();
            sem = 2;
            jD_SS_InicioCurso.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_SS_InicioCurso.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jD_PS_CantGruposXCarreraAño.pack();
        jD_PS_InicioCurso.dispose();
        jD_PS_CantGruposXCarreraAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_CantGruposXCarreraAño.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcboxMesesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxMesesInicioActionPerformed
        int ano = Integer.parseInt("" + jSpinner9.getValue());
        if (jcboxMesesInicio.getSelectedIndex() == 1) {
            jcboxDiaInicio.addItem(31);
        }
    }//GEN-LAST:event_jcboxMesesInicioActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        aulasCCp = new int[grupos.getAll().size()][2];
        int i;
        for (i = 0; i < grupos.getAll().size(); i++) {
            if (validar1(i, 0, jTConfCp) && validar1(i, 1, jTConfCp)) {
                aulasCCp[i][0] = Integer.parseInt("" + jTConfCp.getValueAt(i, 0));
                aulasCCp[i][1] = Integer.parseInt("" + jTConfCp.getValueAt(i, 1));
            } else {
                i = grupos.getAll().size() * 2 - 1;
                JOptionPane.showMessageDialog(jD_PS_AulaSegunGrupo, "Revise bien los datos de las aulas\n que no pueden ser 0\n ni números negativos");
            }
        }
        if (i != grupos.getAll().size() * 2 || i == 0) {
            jD_PS_SesionClases.pack();
            jD_PS_AulaSegunGrupo.dispose();
            jD_PS_SesionClases.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_PS_SesionClases.setVisible(true);
            for (i = 0; i < grupos.getAll().size(); i++) {
                grupos.getAll().get(i).setAulaConf(aulasCCp[i][0]);
                grupos.getAll().get(i).setAulaCp(aulasCCp[i][1]);
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String fec = "" + jSpinner48.getValue() + "/" + (jComboBox6.getSelectedIndex() + 1) + "/" + jSpinner2.getValue();
        if (Integer.parseInt("" + jSpinner48.getValue()) < 10) {
            fec = "0" + fec;
        }
        boolean docM = jCheckBox14.isSelected();
        boolean docT = jCheckBox15.isSelected();
        for (int i = 0; i < horar.size(); i++) {
            if (docM && !docT) {
                if (horar.get(i).isSecM()) {
                    horar.get(i).diasFeriados(fec, "Car_Univ");
                }
            } else if (docT && !docM) {
                if (horar.get(i).isSecT()) {
                    horar.get(i).diasFeriados(fec, "Car_Univ");
                }
            } else {
                horar.get(i).diasFeriados(fec, "Car_Univ");
            }
            
        }
        String[] spl;
        for (int i = 0; i < listPL.size(); i++) {
            spl = listPL.get(i).split("-");
            for (int j = 0; j < horar.size(); j++) {
                if (horar.get(j).getCarrera().equals(spl[0]) && spl[1].equals("" + horar.get(j).getAno())) {
                    for (int k = Integer.parseInt(spl[3]); k >= Integer.parseInt(spl[2]); k--) {
                        horar.get(j).semanaTSU(k);
                    }
                }
            }
            
        }
        jD_PS_OtrosDiasFeriados.pack();
        jD_PS_Carnaval_PLab.setVisible(false);
        jD_PS_OtrosDiasFeriados.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_OtrosDiasFeriados.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        int value = (int) jSpinner1.getValue();
        if (jComboBox12.getSelectedIndex() == 5 && value % 4 == 0) {
            jComboBox9.removeItem(31);
            jComboBox9.removeItem(30);
            jComboBox9.removeItem(29);
            jComboBox9.addItem(29);
        } else if (jComboBox12.getSelectedIndex() == 5) {
            jComboBox9.removeItem(31);
            jComboBox9.removeItem(30);
            jComboBox9.removeItem(29);
        } else if (jComboBox12.getSelectedIndex() == 0 || jComboBox12.getSelectedIndex() == 2) {
            jComboBox9.removeItem(31);
            jComboBox9.removeItem(30);
            jComboBox9.removeItem(29);
            jComboBox9.addItem(29);
            jComboBox9.addItem(30);
        } else {
            jComboBox9.removeItem(31);
            jComboBox9.removeItem(30);
            jComboBox9.removeItem(29);
            jComboBox9.addItem(29);
            jComboBox9.addItem(30);
            jComboBox9.addItem(31);
        }
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jTextField1.getText().isEmpty()) {
            int m = mesesNumber("" + jComboBox12.getSelectedItem());
            listDiasFer.add("" + jComboBox9.getSelectedItem() + "/" + m + "/" + jSpinner1.getValue() + "-" + jTextField1.getText());
            Object[] resp = new Object[listDiasFer.size()];
            for (int i = 0; i < resp.length; i++) {
                resp[i] = listDiasFer.get(i);
            }
            jListDiasFeriados.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_PS_OtrosDiasFeriados, "Hay que poner el motivo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Planificará el primer semestre" + "\n" + "¿Desea continuar?") == 0) {
            this.setVisible(false);
            jD_PS_InicioCurso.pack();
            sem = 1;
            jD_PS_InicioCurso.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_PS_InicioCurso.setVisible(true);
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jD_PS_OtrosDiasFeriados.dispose();
        if (JOptionPane.showConfirmDialog(this, "Ya está todo listo para generar el horario del primer semestre" + "\n" + "¿Desea continuar?") == 0) {
            jDejecutarAlgoritmo.pack();
            jDejecutarAlgoritmo.setLocation((w - 450) / 2, (hh - 450) / 2);
            jDejecutarAlgoritmo.setVisible(true);
            
        } else {
            jD_PS_OtrosDiasFeriados.setVisible(true);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jD_PS_CantGruposXCarreraAño.pack();
        jD_PS_AulaSegunGrupo.dispose();
        jD_PS_CantGruposXCarreraAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_CantGruposXCarreraAño.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (JOptionPane.showConfirmDialog(jD_PS_SemFamil_FinAño, "Esta seguro de los datos anteriores") == 0) {
            Calendar c = Calendar.getInstance();
            int ano;
            int dia_prof_guia = jComboBox1.getSelectedIndex();
            int turno_prof_guia = jComboBox2.getSelectedIndex();
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).turnoPG(dia_prof_guia, turno_prof_guia);  // falta la semana de familiarizacion
            }
            int inicfinano = Integer.parseInt("" + jSpinner31.getValue());
            int finfinano = Integer.parseInt("" + jSpinner40.getValue());
            String inicF = "" + inicfinano + "/" + jSpinner32.getValue() + "/" + jSpinner33.getValue();
            String finF = "" + finfinano + "/" + jSpinner41.getValue() + "/" + jSpinner53.getValue();
            if (inicfinano < 10) {
                inicF = "0" + inicF;
            }
            if (finfinano < 10) {
                finF = "0" + finF;
            }
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).finDeAno(inicF, finF);  // falta la semana de familiarizacion
            }
            jD_SS_OtrosDiasFeriados.pack();
            jD_SS_ViernesSanto.dispose();
            jD_SS_OtrosDiasFeriados.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_SS_OtrosDiasFeriados.setVisible(true);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!jTextField2.getText().isEmpty()) {
            int m = mesesNumber("" + jComboBox14.getSelectedItem());
            listDiasFer.add("" + jComboBox13.getSelectedItem() + "/" + m + "/" + jSpinner3.getValue() + "-" + jTextField2.getText());
            Object[] resp = new Object[listDiasFer.size()];
            for (int i = 0; i < resp.length; i++) {
                resp[i] = listDiasFer.get(i);
                
            }
            jListDiasFeriados1.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_SS_OtrosDiasFeriados, "Hay que poner el motivo");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        String[] datos;
        for (int j = 0; j < listDiasFer.size(); j++) {
            datos = listDiasFer.get(j).split("-");
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).diasFeriados(datos[0], datos[1]);
            }
        }
        jD_SS_OtrosDiasFeriados.dispose();
        if (JOptionPane.showConfirmDialog(this, "Ya está todo listo para generar el horario del segundo semestre" + "\n" + "¿Desea continuar?") == 0) {
            jDejecutarAlgoritmo.pack();
            jDejecutarAlgoritmo.setLocation((w - 450) / 2, (hh - 450) / 2);
            jDejecutarAlgoritmo.setVisible(true);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int row = jTcantAulas.getSelectedRow();
        delete = grupos.getAll();
        Grupo g = delete.get(row);
        String carr = g.getCarrera();
        int c = 0, f = g.getAno();
        grupos.delete(g);
        switch (carr) {
            case "CC":
                c = 0;
                break;
            case "II":
                c = 1;
                break;
            case "M":
                c = 2;
                break;
            case "F":
                c = 3;
                break;
        }
        group[c][f - 1] = group[c][f - 1] - 1;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupos"});
        
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                filas++;
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
            }
        }
        
        jTcantAulas.setModel(model);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jD_SS_CantGruposXCarreraAño.pack();
        jD_SS_InicioCurso.dispose();
        jD_SS_CantGruposXCarreraAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_CantGruposXCarreraAño.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jcboxMesesInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxMesesInicio1ActionPerformed
        int value = (int) jSpinnerAño.getValue();
        if (jcboxMesesInicio1.getSelectedIndex() == 1 && value % 4 == 0) {
            jcboxDiaInicio1.removeItem(31);
            jcboxDiaInicio1.removeItem(30);
            jcboxDiaInicio1.removeItem(29);
            jcboxDiaInicio1.addItem(29);
        } else if (jcboxMesesInicio1.getSelectedIndex() == 1) {
            jcboxDiaInicio1.removeItem(31);
            jcboxDiaInicio1.removeItem(30);
            jcboxDiaInicio1.removeItem(29);
        } else {
            jcboxDiaInicio1.removeItem(31);
            jcboxDiaInicio1.removeItem(30);
            jcboxDiaInicio1.removeItem(29);
            jcboxDiaInicio1.addItem(29);
            jcboxDiaInicio1.addItem(30);
            jcboxDiaInicio1.addItem(31);
        }
    }//GEN-LAST:event_jcboxMesesInicio1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jD_PS_InicioCurso.pack();
        jD_PS_CantGruposXCarreraAño.setVisible(false);
        jD_PS_InicioCurso.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_InicioCurso.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        boolean temp = true, resp = true;
        int cont = 1, cant = 0;
        int i = 0;
        while (cont > 0 && i < jTable2.getRowCount() && resp) {
            cont = 0;
            for (int j = 0; j < jTable2.getColumnCount(); j++) {
                if (validar(i, j, jTable2)) {
                    cont++;
                } else {
                    temp = false;
                }
            }
            if (!temp && cont != 0) {
                JOptionPane.showMessageDialog(jD_PS_TSU, "Debe llenar todos los elementos de la fila");
                resp = false;
            } else if (!temp && cont == 0) {
                temp = true;
            }
            i++;
            cant++;
        }
        cant--;
        String[][] table = new String[cant][3];
        if (cont == 0 && temp) {
            for (int j = 0; j < cant; j++) {
                table[j][0] = "" + jTable2.getValueAt(j, 0);
                table[j][1] = "" + jTable2.getValueAt(j, 1);
                table[j][2] = "" + jTable2.getValueAt(j, 2);
                for (i = 0; i < horar.size(); i++) {
                    if (horar.get(i).getCarrera().equals(table[j][0]) && table[j][1].equals("" + horar.get(i).getAno())) {
                        horar.get(i).semanaTSU(Integer.parseInt(table[j][2]));
                    }
                }
            }
            jCheckBox15.setSelected(true);
            jD_PS_Carnaval_PLab.pack();
            jD_PS_TSU.dispose();
            jD_PS_Carnaval_PLab.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_PS_Carnaval_PLab.setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jD_PS_SemFamil_FinAño.pack();
        jD_PS_TSU.setVisible(false);
        jD_PS_SemFamil_FinAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_SemFamil_FinAño.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jD_PS_TSU.pack();
        jD_PS_Carnaval_PLab.setVisible(false);
        jD_PS_TSU.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_TSU.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jcboxCarr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxCarr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboxCarr1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int c = jcboxCarr1.getSelectedIndex();
        int f = jcboxAno1.getSelectedIndex();
        String ano = "";
        switch (f) {
            case 0:
                ano = "1er";
                break;
            case 1:
                ano = "2do";
                break;
            case 2:
                ano = "3er";
                break;
            case 3:
                ano = "4to";
                break;
            case 4:
                ano = "5to";
                break;
        }
        if (group[c][f] < Integer.parseInt("" + jsGrupos1.getValue())) {
            for (int i = group[c][f]; i < Integer.parseInt("" + jsGrupos1.getValue()); i++) {
                grupo.setNumero(i + 1);
                grupo.setAno(f + 1);
                grupo.setCarrera("" + jcboxCarr1.getSelectedItem());
                grupo.setAulaConf(0);
                grupo.setAulaCp(0);
                grupos.insert(grupo);
            }
            group[c][f] = Integer.parseInt("" + jsGrupos1.getValue());
        } else {
            group[c][f] = Integer.parseInt("" + jsGrupos1.getValue());
            for (int i = 0; i < group[c][f]; i++) {
                grupo.setNumero(i + 1);
                grupo.setAno(f + 1);
                grupo.setCarrera("" + jcboxCarr1.getSelectedItem());
                grupo.setAulaConf(0);
                grupo.setAulaCp(0);
                grupos.insert(grupo);
            }
        }
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupos"});
        
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                filas++;
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
            }
        }
        
        jTcantAulas1.setModel(model);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jD_SS_AulaSegunGrupo.pack();
        jD_SS_CantGruposXCarreraAño.dispose();
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model1 = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupo"});
        model1.setColumnIdentifiers(new String[]{"AulaConf", "AulaCP"});
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                model1.addRow(new Object[]{0, 0});
                filas++;
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                model1.addRow(new Object[]{0, 0});
            }
        }
        String[] spl;
        ArrayList<Grupo> gr = grupos.getAll();
        for (int i = 0; i < listInicioC.size(); i++) {
            spl = listInicioC.get(i).split("-");
            for (int j = 0; j < gr.size(); j++) {
                if (spl[0].split("/")[1].equals(gr.get(j).getCarrera()) && spl[0].split("/")[0].equals("" + gr.get(j).getAno())) {
                    Horario h = new Horario(spl[1], Integer.parseInt(spl[2]), gr.get(j).getCarrera(), gr.get(j).getAno(), gr.get(j).getNumero(), false, false);
                    horar.add(h);
                }
            }
        }
        jTAulas1.setModel(model);
        jTAulas1.setEnabled(false);
        jTConfCp1.setModel(model1);
        jD_SS_AulaSegunGrupo.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_AulaSegunGrupo.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jD_SS_InicioCurso.pack();
        jD_SS_CantGruposXCarreraAño.setVisible(false);
        jD_SS_InicioCurso.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_InicioCurso.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int row = jTcantAulas1.getSelectedRow();
        delete = grupos.getAll();
        Grupo g = delete.get(row);
        String carr = g.getCarrera();
        int c = 0, f = g.getAno();
        grupos.delete(g);
        switch (carr) {
            case "Computación":
                c = 0;
                break;
            case "Informática":
                c = 1;
                break;
            case "Matemática":
                c = 2;
                break;
            case "Física":
                c = 3;
                break;
        }
        group[c][f - 1] = group[c][f - 1] - 1;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Carrera", "Año", "Grupos"});
        
        int filas = 0;
        if (model.getRowCount() != 0) {
            while (model.getRowCount() != 0) {
                model.removeRow(0);
            }
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
                filas++;
            }
        } else {
            for (int j = 0; j < grupos.getAll().size(); j++) {
                model.addRow(new Object[]{grupos.getAll().get(j).getCarrera(), grupos.getAll().get(j).getAno(), grupos.getAll().get(j).getNumero()});
            }
        }
        
        jTcantAulas1.setModel(model);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jD_SS_CantGruposXCarreraAño.pack();
        jD_SS_AulaSegunGrupo.dispose();
        jD_SS_CantGruposXCarreraAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_CantGruposXCarreraAño.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        aulasCCp = new int[grupos.getAll().size()][2];
        int i;
        for (i = 0; i < grupos.getAll().size(); i++) {
            if (validar1(i, 0, jTConfCp1) && validar1(i, 1, jTConfCp1)) {
                aulasCCp[i][0] = Integer.parseInt("" + jTConfCp1.getValueAt(i, 0));
                aulasCCp[i][1] = Integer.parseInt("" + jTConfCp1.getValueAt(i, 1));
            } else {
                i = grupos.getAll().size() * 2 - 1;
                JOptionPane.showMessageDialog(jD_SS_AulaSegunGrupo, "Revise bien los datos de las aulas\n que no pueden ser 0\n ni números negativos");
            }
        }
        if (i != grupos.getAll().size() * 2 || i == 0) {
            String[] spl;
            delete = grupos.getAll();
            for (int j = 0; j < listInicioC.size(); j++) {
                spl = listInicioC.get(j).split("-");
                for (i = 0; i < delete.size(); i++) {
                    if (spl[0].split("/")[0].equals(delete.get(j).getCarrera()) && spl[0].split("/")[1].equals("" + delete.get(j).getAno())) {
                        delete.get(i).setAulaConf(aulasCCp[i][0]);
                        delete.get(i).setAulaCp(aulasCCp[i][1]);
                    }
                }
            }
            for (int j = 0; j < delete.size(); j++) {
                Grupo grupo1 = delete.get(j);
                grupos.update(grupo1);
            }
            jD_SS_SesionClases.pack();
            jD_SS_AulaSegunGrupo.dispose();
            jD_SS_SesionClases.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_SS_SesionClases.setVisible(true);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jD_SS_TSU.pack();
        jD_SS_Carnaval_PLab.dispose();
        jD_SS_TSU.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_TSU.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String fec = "" + jSpinner50.getValue() + "/" + (jComboBox6.getSelectedIndex() + 1) + "/" + jSpinner5.getValue();
        if (Integer.parseInt("" + jSpinner50.getValue()) < 10) {
            fec = "0" + fec;
        }
        System.out.println("+-*" + fec);
        boolean docM = jCheckBox17.isSelected();
        boolean docT = jCheckBox16.isSelected();
        for (int i = 0; i < horar.size(); i++) {
            if (docM && !docT) {
                if (horar.get(i).isSecM()) {
                    horar.get(i).diasFeriados(fec, "Car_Univ");
                }
            } else if (docT && !docM) {
                if (horar.get(i).isSecT()) {
                    horar.get(i).diasFeriados(fec, "Car_Univ");
                }
            } else {
                horar.get(i).diasFeriados(fec, "Car_Univ");
            }
            
        }
        String[] spl;
        for (int i = 0; i < listPL.size(); i++) {
            spl = listPL.get(i).split("-");
            for (int j = 0; j < horar.size(); j++) {
                if (horar.get(j).getCarrera().equals(spl[0]) && spl[1].equals("" + horar.get(j).getAno())) {
                    for (int k = Integer.parseInt(spl[3]); k >= Integer.parseInt(spl[2]); k--) {
                        horar.get(j).semanaTSU(k);
                    }
                }
            }
            
        }
        jD_SS_ViernesSanto.pack();
        jD_SS_Carnaval_PLab.dispose();
        jD_SS_ViernesSanto.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_ViernesSanto.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (JOptionPane.showConfirmDialog(jD_PS_SemFamil_FinAño, "Esta seguro de los datos anteriores") == 0) {
            Calendar c = Calendar.getInstance();
            int ano;
            int dia_prof_guia = jComboBox20.getSelectedIndex();
            int turno_prof_guia = jComboBox21.getSelectedIndex();
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).turnoPG(dia_prof_guia, turno_prof_guia);
            }
            for (int i = 0; i < listFamily.size(); i++) {
                for (int j = 0; j < horar.size(); j++) {
                    if (horar.get(j).getCarrera().equals(listFamily.get(i)) && horar.get(j).getAno() == 1) {
                        horar.get(j).semanaTSU(1);
                    }
                }
            }
            int inicfinano = Integer.parseInt("" + jSpinner37.getValue());
            int finfinano = Integer.parseInt("" + jSpinner38.getValue());
            ano = Integer.parseInt(c.getTime().toString().split(" ")[5]);
            String inicF = "" + inicfinano + "/12/" + ano;
            String finF = "" + finfinano + "/1/" + (ano + 1);
            if (inicfinano < 10) {
                inicF = "0" + inicF;
            }
            if (finfinano < 10) {
                finF = "0" + finF;
            }
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).finDeAno(inicF, finF);  // falta la semana de familiarizacion
            }
            jD_PS_TSU.pack();
            jD_PS_SemFamil_FinAño.dispose();
            jD_PS_TSU.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_PS_TSU.setVisible(true);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        listFamily.add("" + jComboBox19.getSelectedItem());
        Object[] resp = new Object[listFamily.size()];
        for (int i = 0; i < resp.length; i++) {
            resp[i] = listFamily.get(i);
            
        }
        jList1.setListData(resp);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        listFamily.remove(jList1.getSelectedIndex());
        if (listFamily.isEmpty()) {
            jList1.setListData(new Object[8]);
        } else {
            Object[] resp = new Object[listFamily.size()];
            for (int i = 0; i < resp.length; i++) {
                resp[i] = listFamily.get(i);
                
            }
            jList1.setListData(resp);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jD_PS_SesionClases.pack();
        jD_PS_SemFamil_FinAño.dispose();
        jD_PS_SesionClases.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_SesionClases.setVisible(true);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jD_PS_Carnaval_PLab.pack();
        jD_PS_OtrosDiasFeriados.dispose();
        jD_PS_Carnaval_PLab.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_Carnaval_PLab.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (Integer.parseInt("" + jSpinner42.getValue()) < Integer.parseInt("" + jSpinner44.getValue())) {
            listPL.add("" + jComboBox11.getSelectedItem() + "-" + jSpinner43.getValue() + "-" + jSpinner42.getValue() + "-" + jSpinner44.getValue());
            Object[] resp = new Object[listPL.size()];
            for (int i = 0; i < listPL.size(); i++) {
                resp[i] = listPL.get(i);
            }
            jList2.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_PS_Carnaval_PLab, "La semana de fin de práctica debe ser después de la de inicio");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (jList2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(jD_PS_Carnaval_PLab, "Debe seleccionar para poder borrar");
        } else {
            listPL.remove(jList2.getSelectedIndex());
            Object[] resp = new Object[listPL.size()];
            for (int i = 0; i < listPL.size(); i++) {
                resp[i] = listPL.get(i);
            }
            jList2.setListData(resp);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        jD_SS_SesionClases.pack();
        jD_SS_TSU.dispose();
        jD_SS_SesionClases.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_SesionClases.setVisible(true);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        boolean temp = true, resp = true;
        int cont = 1, cant = 0;
        int i = 0;
        while (cont > 0 && i < jTable4.getRowCount() && resp) {
            cont = 0;
            for (int j = 0; j < jTable4.getColumnCount(); j++) {
                if (validar(i, j, jTable4)) {
                    cont++;
                } else {
                    temp = false;
                }
            }
            if (!temp && cont != 0) {
                JOptionPane.showMessageDialog(jD_SS_TSU, "Debe llenar todos los elementos de la fila");
                resp = false;
            } else if (!temp && cont == 0) {
                temp = true;
            }
            i++;
            cant++;
        }
        cant--;
        String[][] table = new String[cant][3];
        if (cont == 0 && temp) {
            for (int j = 0; j < cant; j++) {
                table[j][0] = "" + jTable4.getValueAt(j, 0);
                table[j][1] = "" + jTable4.getValueAt(j, 1);
                table[j][2] = "" + jTable4.getValueAt(j, 2);
                for (i = 0; i < horar.size(); i++) {
                    if (horar.get(i).getCarrera().equals(table[j][0]) && table[j][1].equals("" + horar.get(i).getAno())) {
                        horar.get(i).semanaTSU(Integer.parseInt(table[j][2]));
                    }
                }
            }
            jD_SS_Carnaval_PLab.pack();
            jD_SS_TSU.dispose();
            jD_SS_Carnaval_PLab.setLocation((w - 450) / 2, (hh - 450) / 2);
            jD_SS_Carnaval_PLab.setVisible(true);
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        jD_SS_Carnaval_PLab.pack();
        jD_SS_ViernesSanto.dispose();
        jD_SS_Carnaval_PLab.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_Carnaval_PLab.setVisible(true);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jD_SS_ViernesSanto.pack();
        jD_SS_OtrosDiasFeriados.dispose();
        jD_SS_ViernesSanto.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_ViernesSanto.setVisible(true);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        String dia = "" + jcboxDiaInicio1.getSelectedItem();
        listInicioC.add("" + jComboBox23.getSelectedItem() + "/" + jComboBox22.getSelectedItem() + "-" + dia + "/" + (jcboxMesesInicio1.getSelectedIndex() + 1) + "/" + jSpinnerAño.getValue() + "-" + jSpinnersemanas.getValue());
        Object[] resp = new Object[listInicioC.size()];
        for (int i = 0; i < listInicioC.size(); i++) {
            resp[i] = listInicioC.get(i);
        }
        jList3.setListData(resp);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if (jList3.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(jD_SS_InicioCurso, "Debe seleccionar un elemento antes de eliminarlo");
        } else {
            listInicioC.remove(jList3.getSelectedIndex());
            Object[] resp = new Object[listInicioC.size()];
            for (int i = 0; i < listInicioC.size(); i++) {
                resp[i] = listInicioC.get(i);
            }
            jList3.setListData(resp);
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jTConfCpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTConfCpKeyPressed
    }//GEN-LAST:event_jTConfCpKeyPressed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        jD_PS_AulaSegunGrupo.pack();
        jD_PS_SesionClases.dispose();
        jD_PS_AulaSegunGrupo.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_AulaSegunGrupo.setVisible(true);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        for (int i = 0; i < jList4.getModel().getSize(); i++) {
            ses1.add(jList4.getModel().getElementAt(i));
        }
        for (int i = 0; i < jList5.getModel().getSize(); i++) {
            ses.add(jList5.getModel().getElementAt(i));
        }
        String[][] sec = new String[ses.size()][2];
        for (int i = 0; i < ses.size(); i++) {
            sec[i][0] = ("" + ses.get(i)).split("-")[0];
            sec[i][1] = ("" + ses.get(i)).split("-")[1];
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = 0; j < horar.size(); j++) {
                if (sec[i][0].equals("" + horar.get(j).getAno()) && sec[i][1].equals(horar.get(j).getCarrera())) {
                    horar.get(j).setSecT(true);
                }
                
            }
        }
        sec = new String[ses1.size()][2];
        for (int i = 0; i < ses1.size(); i++) {
            sec[i][0] = ("" + ses1.get(i)).split("-")[0];
            sec[i][1] = ("" + ses1.get(i)).split("-")[1];
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = 0; j < horar.size(); j++) {
                if (sec[i][0].equals("" + horar.get(j).getAno()) && sec[i][1].equals(horar.get(j).getCarrera())) {
                    horar.get(j).setSecM(true);
                }
                
            }
        }
        jD_PS_SemFamil_FinAño.pack();
        jD_PS_SesionClases.dispose();
        jD_PS_SemFamil_FinAño.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_PS_SemFamil_FinAño.setVisible(true);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if (ses1.isEmpty()) {
            for (int i = 0; i < jList4.getModel().getSize(); i++) {
                ses1.add(jList4.getModel().getElementAt(i));
            }
        }
        Object[] lis = jList4.getSelectedValues();
        for (int i = 0; i < lis.length; i++) {
            ses.add(lis[i]);
            ses1.remove(lis[i]);
        }
        lis = new Object[ses.size()];
        for (int i = 0; i < ses.size(); i++) {
            lis[i] = ses.get(i);
        }
        jList5.setListData(lis);
        lis = new Object[ses1.size()];
        for (int i = 0; i < ses1.size(); i++) {
            lis[i] = ses1.get(i);
        }
        jList4.setListData(lis);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        if (ses1.isEmpty()) {
            for (int i = 0; i < jList6.getModel().getSize(); i++) {
                ses1.add(jList6.getModel().getElementAt(i));
            }
        }
        Object[] lis = jList6.getSelectedValues();
        for (int i = 0; i < lis.length; i++) {
            ses.add(lis[i]);
            ses1.remove(lis[i]);
        }
        lis = new Object[ses.size()];
        for (int i = 0; i < ses.size(); i++) {
            lis[i] = ses.get(i);
        }
        jList7.setListData(lis);
        lis = new Object[ses1.size()];
        for (int i = 0; i < ses1.size(); i++) {
            lis[i] = ses1.get(i);
        }
        jList6.setListData(lis);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        jD_SS_AulaSegunGrupo.pack();
        jD_SS_SesionClases.dispose();
        jD_SS_AulaSegunGrupo.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_AulaSegunGrupo.setVisible(true);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        for (int i = 0; i < jList6.getModel().getSize(); i++) {
            ses1.add(jList6.getModel().getElementAt(i));
        }
        for (int i = 0; i < jList7.getModel().getSize(); i++) {
            ses.add(jList7.getModel().getElementAt(i));
        }
        String[][] sec = new String[ses.size()][2];
        for (int i = 0; i < ses.size(); i++) {
            sec[i][0] = ("" + ses.get(i)).split("-")[0];
            sec[i][1] = ("" + ses.get(i)).split("-")[1];
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = 0; j < horar.size(); j++) {
                if (sec[i][0].equals("" + horar.get(j).getAno()) && sec[i][1].equals(horar.get(j).getCarrera())) {
                    horar.get(j).setSecT(true);
                }
                
            }
        }
        sec = new String[ses1.size()][2];
        for (int i = 0; i < ses1.size(); i++) {
            sec[i][0] = ("" + ses1.get(i)).split("-")[0];
            sec[i][1] = ("" + ses1.get(i)).split("-")[1];
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = 0; j < horar.size(); j++) {
                if (sec[i][0].equals("" + horar.get(j).getAno()) && sec[i][1].equals(horar.get(j).getCarrera())) {
                    horar.get(j).setSecM(true);
                }
                
            }
        }
        jD_SS_TSU.pack();
        jD_SS_SesionClases.dispose();
        jD_SS_TSU.setLocation((w - 450) / 2, (hh - 450) / 2);
        jD_SS_TSU.setVisible(true);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        try {
            for (int i = 0; i < horar.size(); i++) {
                horar.get(i).cleanDays();
            }
            String[] datos;
            for (int j = 0; j < listDiasFer.size(); j++) {
                datos = listDiasFer.get(j).split("-");
                for (int i = 0; i < horar.size(); i++) {
                    horar.get(i).diasFeriados(datos[0], datos[1]);
                    horar.get(i).setWeek(0);
                }
            }
            int prog = 0;
            
            Desarrollo d = new Desarrollo();
            d.setListHorarios(horar);
    //        Job<Void,Void> job = new Job<>(d);
            //        job.execute();
            band = false;
            
            d.horario();
            band = true;
            horar = d.getListH();
            
            for (int k = 0; k < horar.size(); k++) {
                JTable[] j = new JTable[horar.get(k).getCantWeek()];
                for (int l = 0; l < horar.get(k).getCantWeek(); l++) {
                    String[][] s = horar.get(k).semanaX(l);
                    String[] colum = horar.get(k).fechaSemanaX(l);
                    TableModel t = new DefaultTableModel(s, colum);
                    j[l] = new JTable();
                    j[l].setModel(t);
                }
                exportar(j, horar.get(k));
                
            }

//            jDejecutarAlgoritmo.dispose();
           
            
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            this.setVisible(true);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }

      
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if (ses1.isEmpty()) {
            for (int i = 0; i < jList4.getModel().getSize(); i++) {
                ses1.add(jList4.getModel().getElementAt(i));
            }
        }
        Object[] lis = jList5.getSelectedValues();
        for (int i = 0; i < lis.length; i++) {
            ses1.add(lis[i]);
            ses.remove(lis[i]);
        }
        lis = new Object[ses1.size()];
        for (int i = 0; i < ses1.size(); i++) {
            lis[i] = ses1.get(i);
        }
        jList4.setListData(lis);
        lis = new Object[ses.size()];
        for (int i = 0; i < ses.size(); i++) {
            lis[i] = ses.get(i);
        }
        jList5.setListData(lis);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if (ses1.isEmpty()) {
            for (int i = 0; i < jList6.getModel().getSize(); i++) {
                ses1.add(jList6.getModel().getElementAt(i));
            }
        }
        Object[] lis = jList7.getSelectedValues();
        for (int i = 0; i < lis.length; i++) {
            ses1.add(lis[i]);
            ses.remove(lis[i]);
        }
        lis = new Object[ses1.size()];
        for (int i = 0; i < ses1.size(); i++) {
            lis[i] = ses1.get(i);
        }
        jList6.setListData(lis);
        lis = new Object[ses.size()];
        for (int i = 0; i < ses.size(); i++) {
            lis[i] = ses.get(i);
        }
        jList7.setListData(lis);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        if (jList8.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(jD_SS_Carnaval_PLab, "Debe seleccionar para poder borrar");
        } else {
            listPL.remove(jList8.getSelectedIndex());
            Object[] resp = new Object[listPL.size()];
            for (int i = 0; i < listPL.size(); i++) {
                resp[i] = listPL.get(i);
            }
            jList8.setListData(resp);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (Integer.parseInt("" + jSpinner51.getValue()) < Integer.parseInt("" + jSpinner45.getValue())) {
            listPL.add("" + jComboBox15.getSelectedItem() + "-" + jSpinner46.getValue() + "-" + jSpinner51.getValue() + "-" + jSpinner45.getValue());
            Object[] resp = new Object[listPL.size()];
            for (int i = 0; i < listPL.size(); i++) {
                resp[i] = listPL.get(i);
            }
            jList8.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_SS_Carnaval_PLab, "La semana de fin de práctica debe ser después de la de inicio");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Desarrollo d = new Desarrollo();
        d.delet();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int m;
        if ((m = jListDiasFeriados.getSelectedIndex()) != -1) {
            listDiasFer.remove(m);
            Object[] resp = new Object[listDiasFer.size()];
            for (int i = 0; i < resp.length; i++) {
                resp[i] = listDiasFer.get(i);
            }
            jListDiasFeriados.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_PS_OtrosDiasFeriados, "Hay que seleccionar primero una fecha");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int m;
        if ((m = jListDiasFeriados1.getSelectedIndex()) != -1) {
            listDiasFer.remove(m);
            Object[] resp = new Object[listDiasFer.size()];
            for (int i = 0; i < resp.length; i++) {
                resp[i] = listDiasFer.get(i);
            }
            jListDiasFeriados1.setListData(resp);
        } else {
            JOptionPane.showMessageDialog(jD_SS_OtrosDiasFeriados, "Hay que seleccionar primero una fecha");
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        acercade.setLocation((w - 450) / 2, (hh - 450) / 2);
        acercade.pack();
        acercade.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            String[] arr = new String[]{"ayuda.exe"};
            Runtime.getRuntime().exec(arr);
        } catch (IOException ex) {
            System.out.println("Error en la ayuda");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jD_PS_InicioCursoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jD_PS_InicioCursoWindowOpened
     
    }//GEN-LAST:event_jD_PS_InicioCursoWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Visual().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog acercade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox23;
    private javax.swing.JComboBox jComboBox27;
    private javax.swing.JComboBox jComboBox28;
    private javax.swing.JComboBox jComboBox29;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JDialog jD_PS_AulaSegunGrupo;
    private javax.swing.JDialog jD_PS_CantGruposXCarreraAño;
    private javax.swing.JDialog jD_PS_Carnaval_PLab;
    private javax.swing.JDialog jD_PS_InicioCurso;
    private javax.swing.JDialog jD_PS_OtrosDiasFeriados;
    private javax.swing.JDialog jD_PS_SemFamil_FinAño;
    private javax.swing.JDialog jD_PS_SesionClases;
    private javax.swing.JDialog jD_PS_TSU;
    private javax.swing.JDialog jD_SS_AulaSegunGrupo;
    private javax.swing.JDialog jD_SS_CantGruposXCarreraAño;
    private javax.swing.JDialog jD_SS_Carnaval_PLab;
    private javax.swing.JDialog jD_SS_InicioCurso;
    private javax.swing.JDialog jD_SS_OtrosDiasFeriados;
    private javax.swing.JDialog jD_SS_SesionClases;
    private javax.swing.JDialog jD_SS_TSU;
    private javax.swing.JDialog jD_SS_ViernesSanto;
    private javax.swing.JDialog jDejecutarAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JList jListDiasFeriados;
    private javax.swing.JList jListDiasFeriados1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JSpinner jSpinner42;
    private javax.swing.JSpinner jSpinner43;
    private javax.swing.JSpinner jSpinner44;
    private javax.swing.JSpinner jSpinner45;
    private javax.swing.JSpinner jSpinner46;
    private javax.swing.JSpinner jSpinner48;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner50;
    private javax.swing.JSpinner jSpinner51;
    private javax.swing.JSpinner jSpinner53;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JSpinner jSpinnerAño;
    private javax.swing.JSpinner jSpinnersemanas;
    private javax.swing.JTable jTAulas;
    private javax.swing.JTable jTAulas1;
    private javax.swing.JTable jTConfCp;
    private javax.swing.JTable jTConfCp1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTcantAulas;
    private javax.swing.JTable jTcantAulas1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox jcboxAno;
    private javax.swing.JComboBox jcboxAno1;
    private javax.swing.JComboBox jcboxCarr;
    private javax.swing.JComboBox jcboxCarr1;
    private javax.swing.JComboBox jcboxDiaInicio;
    private javax.swing.JComboBox jcboxDiaInicio1;
    private javax.swing.JComboBox jcboxMesesInicio;
    private javax.swing.JComboBox jcboxMesesInicio1;
    private javax.swing.JSpinner jsGrupos;
    private javax.swing.JSpinner jsGrupos1;
    // End of variables declaration//GEN-END:variables
}
