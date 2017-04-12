/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.impl.ProfesorDAOImpl;
import horariop4.Visual;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapeo.Profesor;

public class Entorno implements Serializable {

    private int aulas[];                     //  aulas cada una tiene el tio que es 0-conf 1-cp
    private ArrayList<Estados> asig;
    private String[][] p4;
    private double[] recomp;
    private ArrayList<AulaRest> restAula;
    private ArrayList<ProfesoRest> restProf;
    private ArrayList<ProfesoresRB> restProfRB;
    private ArrayList<Integer> posibles;
    private ArrayList<String>[] p1;
    private int cp = 123;
    private ArrayList<Estados> est;
    private String name;
    private int falseRestCount = 0;

    public Entorno(int[] aulas, String[][] p4) {
        this.aulas = aulas;
        asig = new ArrayList<>();
        restAula = new ArrayList<>();
        restProf = new ArrayList<>();
        this.p4 = p4;
        posibles = new ArrayList<>();
        est = new ArrayList<>();
    }

    public ArrayList<Estados> getAsig() {
        return asig;
    }

    public int[] getAulas() {
        return aulas;
    }

    public double[] getRecomp() {
        return recomp;
    }

    public int getFalseRestCount() {
        return falseRestCount;
    }

    public void setFalseRestCount(int falseRestCount) {
        this.falseRestCount = falseRestCount;
    }

    public ArrayList<Integer> getPosibles() {
        return posibles;
    }

    public ArrayList<AulaRest> getRestAula() {
        return restAula;
    }

    public ArrayList<ProfesoRest> getRestProf() {
        return restProf;
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

    public String[][] getP4() {
        return p4;
    }

    public void setP4(String[][] p4) {
        this.p4 = new String[7][6];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                this.p4[i][j] = p4[i][j];
            }
        }
    }

    public boolean local(int n) {
        for (int i = 0; i < aulas.length; i++) {
            if (aulas[i] == n) {
                return true;
            }
        }
        return false;
    }

    private void clases() {
        posibles = new ArrayList<>();
        for (int i = 0; i < recomp.length; i++) {
            if (recomp[i] != 0) {
                posibles.add(i);
            }
        }
    }

//    public void actualizarAcc(int stataA, Asignatura[] as){   // esto no va todavia aqui
//        for (int i = 0; i < as.length; i++) {
//            if(!as[i].isOcupado())
//                aux[stataA].add(i);
//        }
//    }
    public void searchR(ArrayList<Asignat> as, String dia, int y) {
        recomp = new double[as.size()];
        int tipo;
        int inic = (cp++) % as.size();
        for (int i = 0; i < recomp.length; i++) {
            tipo = 0;
            if (inic == as.size()) {
                inic = 0;
            }
            if (!p1[inic].isEmpty()) {
                switch (p1[inic].get(0)) {
                    case "C":
                        tipo = 1;
                        break;
                    case "E":
                        tipo = 2;
                        break;
                }
                if (hardRestriction(as.get(inic), y, dia, tipo)) { //Casi esta terminado lo de las hardRestriction
                    recomp[inic] = cumpleRB(as.get(inic), y, dia);
                } else {
                    recomp[inic] = 0;
                }
            } else {
                recomp[inic] = 0;
            }
            inic++;
        }
        clases();
    }

    public ArrayList<Horario> searchCP(ArrayList<Horario> list, Asignat as, int wee, int elec, int sec, int cantTurn) {
        ProfesorDAOImpl pdi = new ProfesorDAOImpl();
        ArrayList<Profesor> lp;
        int cantT = cantTurn, se = sec;
        int dt = -1, td = -1;
        String[][] p4ClaseP;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        for (int i = 0; i < list.size(); i++) {
            p4ClaseP = new String[7][6];
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 6; k++) {
                    p4ClaseP[j][k] = p4[j][k];
                }
            }
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 6; k++) {
                    p4[j][k] = list.get(i).getP4()[wee * 7 + j][k];
                }
            }
            for (int j = searchDay(as.getDay()); j < 5; j++) {
                for (int k = se; k < cantT + se; k++) {
                    if (hardRestriction(as, k, as.getDay(), 0)) {
                        lp = pdi.getAllProfesorTipo(as.getAno(), as.getCarrera(), as.getNombre(), "P");
                        for (int l = 0; l < lp.size(); l++) {
                            est.add(new Estados(-1, j, k, "P"));
                            if (lp.get(l).getCorreo().equals(name)) {
                                addRest(lp.get(l), as.getDay(), k, as.getNombre());
                            }
                            p4[j][k] = "P-" + as.getAbrev();
//                            list.get(i).getP1Aux()[elec].remove(0);
                            list.get(i).ponerP4(p4, wee);
                        }
                        dt = j;
                        td = k;
                        k = 8;
                        j = 6;
                    }
                }
                try {
                    fecha = sdf.parse(as.getDay());
                } catch (ParseException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (j < 5) {
                    c.setTime(fecha);
                    c.add(Calendar.DAY_OF_YEAR, 1);
                    String d = c.getTime().toString().split(" ")[2] + "/" + (c.getTime().getMonth() + 1) + "/" + c.getTime().toString().split(" ")[5];
                    as.setDay(d);
                }
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (td != -1 && list.get(j).getP4()[dt][td].equals("")) {
                    list.get(j).setTurno(wee * 7 + dt, td, "--");
                }
            }
            p4 = new String[7][6];
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 6; k++) {
                    p4[j][k] = p4ClaseP[j][k];
                }
            }
            if (td != -1 && p4[dt][td].equals("")) {
                p4[dt][td] = "--";
            }
        }
        return list;
    }

    /**
     * ******************************************************************************************************************************
     ********************************************************************************************************************************
     *****************METODOS PARA LAS RESTRICCIONES YA SEAN DURAS O
     * BLANDAS*********************************************************
     * *******************************************************************************************************************************
     * ******************************************************************************************************************************
     */   // y- turno en que se dara la clase  tipo- tipo de clase por si es Conf o CP
    // controlar la cantidad de grupos
    public boolean hardRestriction(Asignat as, int y, String dia, int tipo) {   // metodo para todas las restricciones duras
        int i = 0, day = searchDay(dia), j;

        if ((y == 3 && !p4[day][y - 1].isEmpty()) || (y == 2 && !p4[day][y + 1].isEmpty())) {
            return false;
        }

        //condiciones para que los turnos no se repitan en el mismo dia
        for (i = 0; i < p4[day].length; i++) {
            if (p4[day][i].equals("P-" + as.getAbrev()) || p4[day][i].equals("C-" + as.getAbrev()) || p4[day][i].equals("E-" + as.getAbrev()) || p4[day][i].equals("Lab-" + as.getAbrev())) {
                return false;
            }
        }

        //verificar si ese dia hay examen para no ubicar otro mas
        for (i = 0; i < p4[day].length; i++) {
            if (p4[day][i].contains("E-") && tipo == 2) {
                return false;
            }
        }

        // condiciones del aula terminada
        while (i < restAula.size()) {
            if (local(restAula.get(i).getNumero()) && restAula.get(i).getTipo() <= tipo) {
                if (searchDayAulas(dia, restAula.get(i).getDia()) != -1) {
                    if (!restAula.get(i).setTurno(y, day)) {
                        return false;
                    } else {
                        i = restAula.size();
                    }
                } else {
                    restAula.get(i).setTurno(y, dia);
                    i = restAula.size();
                }
            }
            i++;
        }

        i = 0;
        boolean pro = true;
        while (i < restProf.size()) {
            j = 0;
            while (j < as.getProfesor().size()) {
                if (restProf.get(i).getProfesor().getCorreo().equals(as.getProfesor().get(j).getCorreo()) && ((tipo == 0 && restProf.get(i).getProfesor().getCp().equals("on"))
                        || (tipo == 1 && restProf.get(i).getProfesor().getConf().equals("on")) || tipo == 2)) {
                    if (!restProf.get(i).getTurno(y, dia)) {
                        pro &= false;
                    } else {
                        pro &= true;
                        name = restProf.get(i).getProfesor().getCorreo();
                    }
                }
                j++;
            }
            i++;
        }
        if (!pro) {
            return false;
        }

        // condiciones para los turnos puestos en el horario como PG y Lab
        if (!p4[day][y].equals("")) {
            if (!(p4[day][y].equals("--") && tipo == 0)) {
//                System.out.println("Dia ocupado: " + p4[day][y] + "  -> " + day + " " + y + " tipo:" + tipo + " asig:" + as.getAbrev());
                return false;
            }
        }
        return true;
    }
//*************************************************************************************************************

    public double cumpleRB(Asignat as, int j, String dia) {           //metodo para restricciones blandas
        double trueRestCount = 1;
        //restricciones de los profesores
        for (int i = 0; i < restProfRB.size(); i++) {
            for (int k = 0; k < as.getProfesor().size(); k++) {
                if (as.getProfesor().get(k).getCorreo().equals(restProfRB.get(i).getProf().getCorreo())) {
                    if (restProfRB.get(i).getDia().contains(dia)) {
                        if (!restProfRB.get(i).getTurno()[restProfRB.get(i).searchDay(dia)][j]) {
                            trueRestCount++;
                        }
                        if (restProfRB.get(i).getTurno()[restProfRB.get(i).searchDay(dia)][j]) {
                            falseRestCount++;
                        }
                    }
                }
            }
        }
        return trueRestCount * 12;
    }
    // Dentro de este metodo se comprueban todas las restricciones blandas y se saca
    // un r el cual va ha ser la cantidad que se cumplan entre el total y esta r 
    // sera utilizada en la formula de Q-Learning.....

    public int searchDay(String dia) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = sdf.parse(dia);
        } catch (ParseException ex) {
            Logger.getLogger(Entorno.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        String[] datos = c.getTime().toString().split(" ");
        int day = 0;
        switch (datos[0]) {
            case "Tue":
                day = 1;
                break;
            case "Wed":
                day = 2;
                break;
            case "Thu":
                day = 3;
                break;
            case "Fri":
                day = 4;
                break;
        }
        return day;
    }

    public int searchDayAulas(String day, ArrayList<String> roomClass) {
        int index = -1;
        int i = 0;
        while (i < roomClass.size()) {
            if (roomClass.get(i).equals(day)) {
                index = i;
                i = roomClass.size();
            }
        }
        return index;
    }

    public void setRestAula(ArrayList<AulaRest> restAula) {
        this.restAula = restAula;
    }

    public void setRestProf(ArrayList<ProfesoRest> restProf) {
        this.restProf = restProf;
    }

    public void setRestProfRB(ArrayList<ProfesoresRB> restProfRB) {
        this.restProfRB = restProfRB;
    }

    public void addRest(Profesor p, String dia, int t, String asig) {
        boolean verif = false;
        for (int i = 0; i < restProf.size(); i++) {
            if (restProf.get(i).getProfesor().getCorreo().equals(p.getCorreo())) {
                if (restProf.get(i).setTurno(t, dia)) {
                    verif = true;
                }
            }
        }
        if (!verif) {
            ProfesoRest prest = new ProfesoRest(p, dia, t);
            restProf.add(prest);
        }
    }

    public ArrayList<Estados> getEst() {
        return est;
    }
}
