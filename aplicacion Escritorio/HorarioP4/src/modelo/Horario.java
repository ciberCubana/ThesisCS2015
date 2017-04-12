/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.impl.*;
import horariop4.Visual;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapeo.*;

public class Horario implements Serializable, Cloneable {

    private String[] dia;
    private ArrayList<String>[] p1;
    private ArrayList<String>[] p1Aux;
    private int cantWeek;
    private String[][] p4;
    private String[][] p4Aux;
    private int ano;
    private String carrera;
    private int numero;
    private int week;
    private int[] aulas;
    private boolean secM;
    private boolean secT;
    private ArrayList<String>[] p1Desb;

    @Override
    public Object clone() {
        Horario obj = null;
        try {
            obj = (Horario) (super.clone());
            obj.ano = this.ano;
            obj.numero = this.numero;
            obj.week = this.week;
            obj.cantWeek = this.cantWeek;
            obj.secM = this.secM;
            obj.secT = this.secT;
            for (int i = 0; i < dia.length; i++) {
                obj.dia[i] = this.dia[i];
            }
            for (int i = 0; i < aulas.length; i++) {
                obj.aulas[i] = this.aulas[i];
            }
            if (this.p1 != null) {
                obj.p1 = new ArrayList[this.p1.length];
                obj.p1Aux = new ArrayList[this.p1Aux.length];
                obj.p1Desb = new ArrayList[this.p1Desb.length];
                for (int i = 0; i < this.p1.length; i++) {
                    obj.p1[i] = new ArrayList<>();
                    for (int j = 0; j < this.p1[i].size(); j++) {
                        obj.p1[i].add(this.p1[i].get(j));
                    }
                }
                for (int i = 0; i < this.p1Aux.length; i++) {
                    obj.p1Aux[i] = new ArrayList<>();
                    for (int j = 0; j < this.p1Aux[i].size(); j++) {
                        obj.p1Aux[i].add(this.p1Aux[i].get(j));
                    }
                }
                for (int i = 0; i < this.p1Desb.length; i++) {
                    obj.p1Desb[i] = new ArrayList<>();
                    for (int j = 0; j < this.p1Desb[i].size(); j++) {
                        obj.p1Desb[i].add(this.p1Desb[i].get(j));
                    }
                }
            }
            obj.p4 = new String[this.p4.length][6];
            obj.p4Aux = new String[this.p4Aux.length][6];
            for (int i = 0; i < this.p4.length; i++) {
                for (int j = 0; j < this.p4[i].length; j++) {
                    obj.p4[i][j] = this.p4[i][j];
                    obj.p4Aux[i][j] = this.p4Aux[i][j];
                }
            }
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Horario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public Horario(String inic, int cantWeek, String carrera, int ano, int numero, boolean secM, boolean secT) {
        this.cantWeek = cantWeek;
        this.secM = secM;
        this.secT = secT;
        this.carrera = carrera;
        this.ano = ano;
        this.aulas = new int[2];
        this.numero = numero;
        this.dia = new String[cantWeek * 7];
        this.p4 = new String[cantWeek * 7][6];
        this.p4Aux = new String[cantWeek * 7][6];
        llenarP4();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = sdf.parse(inic);
        } catch (ParseException ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(fecha);
        String[] aux;
        for (int i = 0; i < cantWeek * 7; i++) {
            aux = c.getTime().toString().split(" ");
            dia[i] = aux[2] + "/" + (c.getTime().getMonth() + 1) + "/" + aux[5];
            c.add(Calendar.DAY_OF_YEAR, 1);
        }
    }

    public ArrayList<String>[] getP1() {
        return p1;
    }

    public ArrayList<String>[] getP1Desb() {
        return p1Desb;
    }

    public boolean isSecM() {
        return secM;
    }

    public boolean isSecT() {
        return secT;
    }

    public void setSecM(boolean secM) {
        this.secM = secM;
    }

    public void setP1Desb(ArrayList<String>[] p1Desb) {
        this.p1Desb = new ArrayList[p1Desb.length];
        for (int j = 0; j < p1Desb.length; j++) {
            this.p1Desb[j] = new ArrayList<>();
            for (int k = 0; k < p1Desb[j].size(); k++) {
                this.p1Desb[j].add(p1Desb[j].get(k));
            }
        }
    }

    public ArrayList<String>[] getP1Aux() {
        return p1Aux;
    }

    public void setSecT(boolean secT) {
        this.secT = secT;
    }

    public void turnoPG(int dia, int turno) {
        for (int i = dia; i < p4.length; i += 7) {
            if (secM) {
                p4[i][turno] = "PG";
                p4Aux[i][turno] = "PG";
            }
            if (secT) {
                p4[i][turno + 3] = "PG";
                p4Aux[i][turno + 3] = "PG";
            }
        }
    }

    public void semanaTSU(int w) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = sdf.parse(dia[dia.length - 1]);
        } catch (ParseException ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(fecha);
        for (int i = 0; i < 7; i++) {
            dia[(w - 1) * 7 + i] = "TSU";
        }
        String[] aux = new String[dia.length + 7];
        System.arraycopy(dia, 0, aux, 0, dia.length);
        dia = aux;
        String[] datos;
        for (int i = 7; i > 0; i--) {
            c.add(Calendar.DAY_OF_YEAR, 1);
            datos = c.getTime().toString().split(" ");
            dia[dia.length - i] = datos[2] + "/" + (c.getTime().getMonth() + 1) + "/" + datos[5];
        }
    }

    public void diasFeriados(String fecha, String motivo) {
        int index = searchDay(fecha);
        int cantT = 0;
        int se = 0;
        if (secM && secT) {
            cantT = 6;
        } else {
            cantT = 3;
            if (secT) {
                se = 2;
            }
        }
        if (index != -1) {
            for (int i = se; i < cantT + se; i++) {
                p4[index][i] = motivo;
                p4Aux[index][i] = motivo;
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getAno() {
        return ano;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCantWeek() {
        return cantWeek;
    }

    public String[] getDia() {
        return dia;
    }

    public String[][] getP4() {
        return p4;
    }

    public String[][] getP4Aux() {
        return p4Aux;
    }

    public int getWeek() {
        return week;
    }

    public int[] getAulas() {
        GrupoDAOImpl group = new GrupoDAOImpl();
        Grupo g = group.getAll(carrera, numero, ano).get(0);
        aulas[0] = g.getAulaConf();
        aulas[1] = g.getAulaCp();
        return aulas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCantWeek(int cantWeek) {
        this.cantWeek = cantWeek;
    }

    public void setDia(String[] dia) {
        this.dia = dia;
    }

    public void setP4(String[][] p4) {
        this.p4 = new String[p4.length][6];
        for (int i = 0; i < p4.length; i++) {
            for (int j = 0; j < 6; j++) {
                this.p4[i][j] = p4[i][j];
            }
        }
    }

    public void setP1(ArrayList<String>[] p1) {
        this.p1 = new ArrayList[p1.length];
        for (int i = 0; i < p1.length; i++) {
            this.p1[i] = new ArrayList<>();
            for (int j = 0; j < p1[i].size(); j++) {
                this.p1[i].add(p1[i].get(j));
            }
        }
    }

    public void setP1Aux(ArrayList<String>[] p1) {
        this.p1Aux = new ArrayList[p1.length];
        for (int i = 0; i < p1.length; i++) {
            this.p1Aux[i] = new ArrayList<>();
            for (int j = 0; j < p1[i].size(); j++) {
                this.p1Aux[i].add(p1[i].get(j));
            }
        }
    }

    public void setP4Aux(String[][] p4Aux) {
        this.p4Aux = new String[p4Aux.length][6];
        for (int i = 0; i < p4Aux.length; i++) {
            for (int j = 0; j < 6; j++) {
                this.p4Aux[i][j] = p4Aux[i][j];
            }
        }
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int searchDay(String day) {
        int resp = -1, i = 0;
        while (i < dia.length) {
            if (dia[i].equals(day)) {
                resp = i;
                i = dia.length;
            }
            i++;
        }
        return resp;
    }

    private void llenarP4() {
        for (int i = 0; i < p4.length; i++) {
            for (int j = 0; j < p4[i].length; j++) {
                p4[i][j] = "";
                p4Aux[i][j] = "";
            }
        }
    }

    public void almacenarP1(int week) {
        AsignaturaDAOImpl as = new AsignaturaDAOImpl();
        ArrayList<Asignatura> asig = as.getAllAsignatura(ano, carrera);
        if (p1Desb == null) {
            p1Desb = new ArrayList[asig.size()];
            for (int i = 0; i < p1Desb.length; i++) {
                p1Desb[i] = new ArrayList<>();
            }
        }
        p1 = new ArrayList[asig.size()];
        for (int i = 0; i < p1.length; i++) {
            p1[i] = new ArrayList<>();
            for (int j = 0; j < p1[i].size(); j++) {
                p1[i].add(p1Desb[i].get(j));
                System.out.println("" + p1Desb[i].get(j));
            }
        }
        for (int i = 0; i < asig.size(); i++) {
            Asignatura asignatura = asig.get(i);
            switch (week) {
                case 1:
                    p1[i].add(asignatura.getPrimera1());
                    p1[i].add(asignatura.getSegunda1());
                    p1[i].add(asignatura.getTercera1());
                    p1[i].add(asignatura.getCuarta1());
                    break;
                case 2:
                    p1[i].add(asignatura.getPrimera2());
                    p1[i].add(asignatura.getSegunda2());
                    p1[i].add(asignatura.getTercera2());
                    p1[i].add(asignatura.getCuarta2());
                    break;
                case 3:
                    p1[i].add(asignatura.getPrimera3());
                    p1[i].add(asignatura.getSegunda3());
                    p1[i].add(asignatura.getTercera3());
                    p1[i].add(asignatura.getCuarta3());
                    break;
                case 4:
                    p1[i].add(asignatura.getPrimera4());
                    p1[i].add(asignatura.getSegunda4());
                    p1[i].add(asignatura.getTercera4());
                    p1[i].add(asignatura.getCuarta4());
                    break;
                case 5:
                    p1[i].add(asignatura.getPrimera5());
                    p1[i].add(asignatura.getSegunda5());
                    p1[i].add(asignatura.getTercera5());
                    p1[i].add(asignatura.getCuarta5());
                    break;
                case 6:
                    p1[i].add(asignatura.getPrimera6());
                    p1[i].add(asignatura.getSegunda6());
                    p1[i].add(asignatura.getTercera6());
                    p1[i].add(asignatura.getCuarta6());
                    break;
                case 7:
                    p1[i].add(asignatura.getPrimera7());
                    p1[i].add(asignatura.getSegunda7());
                    p1[i].add(asignatura.getTercera7());
                    p1[i].add(asignatura.getCuarta7());
                    break;
                case 8:
                    p1[i].add(asignatura.getPrimera8());
                    p1[i].add(asignatura.getSegunda8());
                    p1[i].add(asignatura.getTercera8());
                    p1[i].add(asignatura.getCuarta8());
                    break;
                case 9:
                    p1[i].add(asignatura.getPrimera9());
                    p1[i].add(asignatura.getSegunda9());
                    p1[i].add(asignatura.getTercera9());
                    p1[i].add(asignatura.getCuarta9());
                    break;
                case 10:
                    p1[i].add(asignatura.getPrimera10());
                    p1[i].add(asignatura.getSegunda10());
                    p1[i].add(asignatura.getTercera10());
                    p1[i].add(asignatura.getCuarta10());
                    break;
                case 11:
                    p1[i].add(asignatura.getPrimera11());
                    p1[i].add(asignatura.getSegunda11());
                    p1[i].add(asignatura.getTercera11());
                    p1[i].add(asignatura.getCuarta11());
                    break;
                case 12:
                    p1[i].add(asignatura.getPrimera12());
                    p1[i].add(asignatura.getSegunda12());
                    p1[i].add(asignatura.getTercera12());
                    p1[i].add(asignatura.getCuarta12());
                    break;
                case 13:
                    p1[i].add(asignatura.getPrimera13());
                    p1[i].add(asignatura.getSegunda13());
                    p1[i].add(asignatura.getTercera13());
                    p1[i].add(asignatura.getCuarta13());
                    break;
                case 14:
                    p1[i].add(asignatura.getPrimera14());
                    p1[i].add(asignatura.getSegunda14());
                    p1[i].add(asignatura.getTercera14());
                    p1[i].add(asignatura.getCuarta14());
                    break;
                case 15:
                    p1[i].add(asignatura.getPrimera15());
                    p1[i].add(asignatura.getSegunda15());
                    p1[i].add(asignatura.getTercera15());
                    p1[i].add(asignatura.getCuarta15());
                    break;
                case 16:
                    p1[i].add(asignatura.getPrimera16());
                    p1[i].add(asignatura.getSegunda16());
                    p1[i].add(asignatura.getTercera16());
                    p1[i].add(asignatura.getCuarta16());
                    break;
                case 17:
                    p1[i].add(asignatura.getPrimera17());
                    p1[i].add(asignatura.getSegunda17());
                    p1[i].add(asignatura.getTercera17());
                    p1[i].add(asignatura.getCuarta17());
                    break;
            }
        }
        vaciar();
    }

    private void vaciar() {
        for (int i = 0; i < p1.length; i++) {
            for (int j = p1[i].size() - 1; j >= 0; j--) {
                if (p1[i].get(j).equals("")) {
                    p1[i].remove(j);
                }
            }
        }
        p1Aux = new ArrayList[p1.length];
        for (int i = 0; i < p1.length; i++) {
            p1Aux[i] = new ArrayList<>();
            for (int j = p1[i].size() - 1; j >= 0; j--) {
                p1Aux[i].add(p1[i].get(j));
            }
        }
    }

    public void ponerP4(String[][] p4Opc, int we) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                p4[we * 7 + i][j] = p4Opc[i][j];
            }
        }
    }

    public void finDeAno(String ini, String fin) {
        int in = searchDay(ini);
        int out = searchDay(fin);
        if (in != -1) {
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = null;
            try {
                if (out == -1) {
                    out = dia.length - 1;
                    fecha = sdf.parse(fin);
                } else {
                    fecha = sdf.parse(dia[dia.length - 1]);
                }
            } catch (ParseException ex) {
                Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.setTime(fecha);
            String[] aux = new String[dia.length];
            System.arraycopy(dia, 0, aux, 0, in);
            System.arraycopy(dia, out + 1, aux, in, dia.length - out - 1);
            dia = aux;
            String[] datos;
            for (int i = out - in + 1; i > 0; i--) {
                c.add(Calendar.DAY_OF_YEAR, 1);
                datos = c.getTime().toString().split(" ");
                dia[dia.length - i] = datos[2] + "/" + (c.getTime().getMonth() + 1) + "/" + datos[5];
            }
        }
    }

    public void cleanDays() {
        String[] aux;
        for (int i = dia.length - 1; i >= 0; i--) {
            if (dia[i].equals("TSU")) {
                aux = new String[dia.length - 1];
                System.arraycopy(dia, 0, aux, 0, i);
                System.arraycopy(dia, i + 1, aux, i, dia.length - i - 1);
                dia = aux;
            }
        }
    }

    public String[][] semanaX(int we) {
        String[][] resp = new String[7][6];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                resp[i][j] = p4Aux[we * 7 + i][j];
            }
        }
        return resp;
    }

    public String[] fechaSemanaX(int we) {
        String[] resp = new String[7];
        for (int i = 0; i < 7; i++) {
            resp[i] = dia[we * 7 + i];
        }
        return resp;
    }

    public void setTurno(int d, int t, String asig) {
        p4[d][t] = asig;
    }

    public int verif(int wee) {
        int sum = 0;
        int cantT = 0;
        int se = 0;
        if (secM && secT) {
            cantT = 6;
        } else {
            cantT = 3;
            if (secT) {
                se = 2;
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = se; j < cantT + se; j++) {
                if (!p4[wee * 7 + i][j].isEmpty()) {
                    sum++;
                }
            }
        }
        for (int i = 0; i < p1.length; i++) {
            sum += p1[i].size();
        }
        if (sum > cantT * 5) {
            sum = sum - (cantT * 5);
        } else {
            sum = 0;
        }
        return sum;
    }
}
