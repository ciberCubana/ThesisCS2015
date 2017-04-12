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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapeo.*;

public class Desarrollo implements Serializable {

    private ArrayList<Horario> listHorarios;
    private ArrayList<Horario> listH;
    private ArrayList<Integer> semanas;
    private String[] dias;
    private String[][] p4Semanal;
    private String[][] p4SemASem;
    private String[][] p4SemanalP;
    private ArrayList<String[][]> otherP4;
    private int[] aulas;
    private boolean secM;
    private boolean secT;
    private ArrayList<Asignatura> listAsig;
    private Horario horarioInic;
    private int index;
    private ArrayList<String>[] p1;
    private double recF;
    private int week;
    private ArrayList<ProfesoRest> profRD = new ArrayList<>();
    private ArrayList<ProfesoresRB> profRB = new ArrayList<>();
    ArrayList<Horario> listHdeCP = new ArrayList<>();
    private int progress = 1, val = 0;
     private ArrayList<Integer> ind;
    private int cumple = 0;
    private int total = 0;

    public Desarrollo() {
       
    }

    public void setListHorarios(ArrayList<Horario> listHorarios) {
        this.listHorarios = new ArrayList<>();
        semanas = new ArrayList<>();
        for (int i = 0; i < listHorarios.size(); i++) {
            this.listHorarios.add((Horario) listHorarios.get(i).clone());
            semanas.add(0);
        }
        this.listH = new ArrayList<>();
    }

    public ArrayList<Horario> getListH() {
        return listHorarios;
    }

    public String[][] getP4Semanal() {
        return p4SemanalP;
    }

    public String horario() throws CloneNotSupportedException {
        otherP4 = null;
        int cumpleTemp = 0;
        int totalTemp = 0;
        String[][] p4OtherG;
        ArrayList<ProfesoRest> profRDAux = new ArrayList<>();
        ArrayList<ProfesoRest> profRDOfic = new ArrayList<>();
        ArrayList<Integer> auxSemanas = new ArrayList<>();
        ocupacionLab();
        ocupacionLab1();
        String messag = "";
        val = 100 / progress;
//        for (int i = 0; i < listHorarios.size(); i++) {
//            for (int j = 0; j < listHorarios.get(i).getCantWeek(); j++) {
//                listHorarios.get(i).almacenarP1(j+1);
//                if(!listHorarios.get(i).verif(j)){
//                    ind[i].add(j+1);
//                    contT = false;
//                }
//            }
//        }
        ProfesorDAOImpl p = new ProfesorDAOImpl();
        AsignaturaDAOImpl asi = new AsignaturaDAOImpl();
        Afectaciones afect = new Afectaciones();
        ArrayList<Profesor> prestD;
        ArrayList<Asignatura> prestDAsig;
        int r = 0;
        int cont = profRD.size();
        int contRB = 0;
        for (int i = 0; i < listHorarios.size(); i++) {  //cargando todas las restricciones blandas y duras de profesores
            prestDAsig = asi.getAllAsignatura(listHorarios.get(i).getAno(), listHorarios.get(i).getCarrera());
            for (int j = 0; j < prestDAsig.size(); j++) {
                prestD = p.getAllProfesor(listHorarios.get(i).getAno(), listHorarios.get(i).getCarrera(), prestDAsig.get(j).getNombre());
                for (int k = 0; k < prestD.size(); k++) {
                    profRD.add(afect.afectRD(prestD.get(k).getNombre() + " " + prestD.get(k).getApellidos(), listHorarios.get(i).getDia()));
                    profRD.get(cont++).setProfesor(prestD.get(k));
                }
            }
        }
        index = 0;
        if (firstHorario()) { // se pregunta si la lista de horarios no esta vacia para buscar el horario a comenzar
            while (week < horarioInic.getCantWeek()-1) { // la cantidad de semanas que se genera
                while (!listHorarios.isEmpty()) {      // para recorer cada uno de los horarios
                    //cargando todas las restricciones blandas para cada año
                    contRB = 0;
                    afect.setContRB(0);
                    profRB = new ArrayList<>();
                    prestDAsig = asi.getAllAsignatura(horarioInic.getAno(), horarioInic.getCarrera());
                    for (int j = 0; j < prestDAsig.size(); j++) {
                        prestD = p.getAllProfesor(horarioInic.getAno(), horarioInic.getCarrera(), prestDAsig.get(j).getNombre());
                        for (int k = 0; k < prestD.size(); k++) {
                            profRB.add(afect.afectRB(prestD.get(k).getNombre() + " " + prestD.get(k).getApellidos(), horarioInic.getDia()));
                            profRB.get(contRB++).setProf(prestD.get(k));
                        }
                    }
                    horarioInic.almacenarP1(week + 1);           // cargar el p1
                    int turnos = 0;
                    int cantT = 0;
                    boolean mayorM = false;
                    boolean mayorT = false;
                    int se = 0;
                    int turnDeMas = horarioInic.verif(week) + 1;
                    int turnDMOrig = turnDeMas;
                    double recI;
                    if (secM && secT) {                 // definir cantidad de turnos y la seccion
                        turnos = 30;
                        cantT = 6;
                    } else {
                        turnos = 15;
                        cantT = 3;
                        if (secM) {
                            if (turnDeMas != 0) {
                                turnos += turnDeMas;
                                mayorM = true;
                                cantT = 6;
                            }
                        }
                        if (secT) {
                            mayorT = true;
                            if (turnDeMas > 5) {
                                se = 1;
                            } else {
                                if (turnDeMas != 1) {
                                    se = 2;
                                } else {
                                    mayorT = false;
                                    se = 3;
                                }
                            }
                        }
                    }
                    p4SemASem = new String[7][6];
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 6; j++) {
                            p4SemASem[i][j] = p4Semanal[week * 7 + i][j];
                        }
                    }
                    Entorno ent = new Entorno(aulas, p4SemASem);            //creo el entorno de trabajo
                    Agente agent = new Agente(turnos, listAsig.size());     //Creo el agente que va a trabajar 
                    ArrayList<Asignat> lisAs = new ArrayList<>();
                    ArrayList<Asignat> lisAsOpc;
                    ArrayList<Profesor> profesores;
                    for (int i = 0; i < listAsig.size(); i++) {                 //para crear la lista de asignaturas con la que trabaja el entorno
                        Asignat asignat = new Asignat(listAsig.get(i).getNombre(), listAsig.get(i).getCarrera(), listAsig.get(i).getAno(), listAsig.get(i).getAbrev());
                        lisAs.add(asignat);
                    }
                    for (int i = 0; i < profRD.size(); i++) {
                        profRDAux.add((ProfesoRest) (profRD.get(i).clone()));
                    }
//                    for (int x = 0; x < profRDAux.size(); x++) {
                       System.out.println("Espere.........." );
//                    }



                    ent.setRestProf(profRDAux);                 //poner restricciones duras al entorno
                    ent.setRestProfRB(profRB);                  //poner restricciones blandas del entorno
                    int i, a, tur, sust;
                    String tipo;






                    for (int v = 0; v < 1000; v++) {         //cantidad de iteracciones a realizar
                        if (secM && secT) {                 // definir cantidad de turnos y la seccion
                            turnos = 30;
                            cantT = 6;
                        } else {
                            turnos = 15;
                            cantT = 3;
                            if (secM) {
                                if (turnDeMas != 0) {
                                    turnos += turnDeMas;
                                    mayorM = true;
                                    cantT = 6;
                                }
                            }
                            if (secT) {
                                mayorT = true;
                                if (turnDeMas > 5) {
                                    se = 1;
                                } else {
                                    if (turnDeMas != 1) {
                                        se = 2;
                                    } else {
                                        mayorT = false;
                                        se = 3;
                                    }
                                }
                            }
                        }
                        turnDeMas = turnDMOrig;
                        lisAsOpc = new ArrayList<>();
                        for (i = 0; i < lisAs.size(); i++) {
                            lisAsOpc.add((Asignat) lisAs.get(i).clone());
                            lisAsOpc.get(i).setDay(horarioInic.getDia()[week * 7]);
                        }
                        cumpleTemp = 0;
                        totalTemp = 0;
                        ent.setFalseRestCount(0);
                        recI = 0;
                        p1 = new ArrayList[horarioInic.getP1().length];
                        for (int j = 0; j < horarioInic.getP1().length; j++) {
                            p1[j] = new ArrayList<>();
                            for (int k = 0; k < horarioInic.getP1()[j].size(); k++) {
                                p1[j].add(horarioInic.getP1()[j].get(k));
                            }
                        }
//                        horarioInic.setP1Aux(p1);             //para los sobrante de tunos en una semana
//                        for (int j = 0; j < listHdeCP.size(); j++) {
//                            listHdeCP.get(j).setP1Aux(p1);
//                        }
                        ent.setP1(p1);
                        for (i = 0; i < 5; i++) {
                            tur = -1;
                            for (int j = se; j < cantT + se; j++) {
                                tur++;
                                ent.searchR(lisAsOpc, horarioInic.getDia()[week * 7 + i], j);       //buscar recompenza 
                                if (!ent.getPosibles().isEmpty()) {
                                    a = agent.nextAction(i * 3 + tur, ent.getPosibles());       //busca accion a tomar
                                    tipo = p1[a].remove(0);           //preguntar si es conf o cp para cuando es mas de un grupo...
                                    profesores = p.getAllProfesorTipo(horarioInic.getAno(), horarioInic.getCarrera(), listAsig.get(a).getNombre(), tipo);
                                    if (tipo.equals("P") && profesores.size() < listHdeCP.size() + 1) {
                                        agent.update(i * 3 + tur, i * 3 + tur + 1, ent.getRecomp()[a], a);
                                        recI += ent.getRecomp()[a];
//                                            p4Semanal[week * 7 + i][j] = tipo + "-" + listAsig.get(a).getAbrev();
                                        p4SemASem[i][j] = tipo + "-" + listAsig.get(a).getAbrev();
//                                        horarioInic.getP1Aux()[a].remove(0);
                                        for (int k = 0; k < listHdeCP.size(); k++) {
                                            if (listHdeCP.get(k).getP4()[week * 7 + i][j].equals("")) {
                                                listHdeCP.get(k).setTurno(week * 7 + i, j, "--");
                                            }
                                        }
                                        if ((mayorM && j > 2) || (mayorT && j < 3)) {
                                            turnDeMas--;
                                        }
                                        ent.setP4(p4SemASem);
                                        ent.addRest(profesores.get(r % profesores.size()), horarioInic.getDia()[week * 7 + i], j, listAsig.get(a).getNombre());
                                        r++;
                                        ArrayList<Horario> ax = ent.searchCP(listHdeCP, lisAsOpc.get(a), week, a, se, cantT);
//                                        lisAsOpc.get(a).setDay(horarioInic.getDia()[week * 7 + i]);
                                        listHdeCP = new ArrayList<>();
                                        for (int k = 0; k < ax.size(); k++) {
                                            listHdeCP.add(ax.get(k));
                                        }
                                        ent.setP1(p1);
                                        p4SemASem = new String[7][6];
                                        for (int b = 0; b < 7; b++) {
                                            for (int x = 0; x < 6; x++) {
                                                p4SemASem[b][x] = ent.getP4()[b][x];
                                            }
                                        }
                                    } else {  // para cuando es conferencia, examen o la cantidad de profesores de clase practica es igual a la cantidad de grupos
                                        agent.update(i * 3 + tur, i * 3 + tur + 1, ent.getRecomp()[a], a);
                                        recI += ent.getRecomp()[a];
                                        ent.addRest(profesores.get(r % profesores.size()), horarioInic.getDia()[week * 7 + i], j, listAsig.get(a).getNombre());
//                                            p4Semanal[week * 7 + i][j] = tipo + "-" + listAsig.get(a).getAbrev();
                                        p4SemASem[i][j] = tipo + "-" + listAsig.get(a).getAbrev();
//                                        horarioInic.getP1Aux()[a].remove(0);
                                        if ((mayorM && j > 2) || (mayorT && j < 3)) {
                                            turnDeMas--;
                                        }
                                        ent.setP4(p4SemASem);
                                        for (int k = 0; k < listHdeCP.size(); k++) {
                                            listHdeCP.get(k).setTurno(week * 7 + i, j, tipo + "-" + listAsig.get(a).getAbrev());
//                                            listHdeCP.get(k).getP1Aux()[a].remove(0);
                                        }
                                        ent.setP1(p1);
                                        lisAsOpc.get(a).setDay(horarioInic.getDia()[week * 7 + i]); //poner a la asignatura el ultimo dia que se puso en el horario
                                    }
                                }
                                if (j == 2 && mayorT) {
                                    j++;
                                }
                                if (turnDeMas == 0 && mayorM) {
                                    se = 0;
                                    cantT = 3;
                                } else if (turnDeMas == 0 && mayorT) {
                                    se = 3;
                                    cantT = 3;
                                }
                            }
                        }
                        totalTemp += afect.getContRB();
                        cumpleTemp = totalTemp - ent.getFalseRestCount();
                        sust = 0;  //para restarle a la recompensa los espacios que dejo sin clases...
                        for (i = 0; i < 7; i++) {
                            for (int z = 0; z < 6; z++) {
                                if (p4SemASem[i][z].equals("--") || p4SemASem[i][z].equals("")) {
                                    sust++;
                                }
                            }
                        }
                        recI = recI - sust;
                        if (recI > recF) {
//                            horarioInic.setP1Desb(horarioInic.getP1Aux());
                            total = totalTemp;
                            cumple = cumpleTemp;
                            otherP4 = new ArrayList<>();
                            for (i = 0; i < 7; i++) {
                                for (int j = 0; j < 6; j++) {
                                    p4SemanalP[week * 7 + i][j] = p4SemASem[i][j];;
                                }
                            }
                            for (i = 0; i < listHdeCP.size(); i++) {
                                p4OtherG = new String[7][6];
                                for (int j = 0; j < 7; j++) {
                                    for (int k = 0; k < 6; k++) {
                                        p4OtherG[j][k] = listHdeCP.get(i).getP4()[week * 7 + j][k];
                                    }
                                }
                                otherP4.add(p4OtherG);
//                                listHdeCP.get(i).setP1Desb(listHdeCP.get(i).getP1Aux());
                            }
                            recF = recI;
                            profRDOfic = new ArrayList<>();
                            for (int x = 0; x < profRDAux.size(); x++) {
                                profRDOfic.add((ProfesoRest) profRDAux.get(x).clone());
                            }
                        }
                        profRDAux = new ArrayList<>();
                        for (int x = 0; x < profRD.size(); x++) {
                            profRDAux.add((ProfesoRest) profRD.get(x).clone());
                        }
                        ent.setRestProf(profRDAux);
                        p4SemASem = new String[7][6];
                        for (int x = 0; x < 7; x++) {
                            for (int j = 0; j < 6; j++) {
                                p4SemASem[x][j] = p4Semanal[week * 7 + x][j];
                            }
                        }
                        ent.setP4(p4SemASem);
                        for (int k = 0; k < listHdeCP.size(); k++) {
                            listHdeCP.get(k).ponerP4(p4SemASem, week);
                        }
                    }

                  //  imprimir();
                    profRD = new ArrayList<>();
                    for (int x = 0; x < profRDOfic.size(); x++) {
                        profRD.add((ProfesoRest) profRDOfic.get(x).clone());
                    }
//                    boolean veri = true;
//                    for (int y = 0; y < p1.length; y++) {
//                        if (!p1[y].isEmpty()) {
//                            veri = false;
//                        }
//                    }
//                    if (!veri) {
//                        p1Desb = new ArrayList[p1.length];
//                        for (int j = 0; j < p1.length; j++) {
//                            p1Desb[j] = new ArrayList<>();
//                            for (int k = 0; k < p1[j].size(); k++) {
//                                p1Desb[j].add(p1[j].get(k));
//                            }
//                        }
//                        horarioInic.setP1Desb(p1Desb);
//                    }
                    for (i = 0; i < 7; i++) {
                        for (int j = 0; j < 6; j++) {
                            p4SemASem[i][j] = p4SemanalP[week * 7 + i][j];
                        }
                    }
                    horarioInic.ponerP4(p4SemASem, week);
                    String[][] hor = new String[horarioInic.getP4().length][6];
                    for (i = 0; i < hor.length; i++) {
                        for (int j = 0; j < 6; j++) {
                            hor[i][j] = horarioInic.getP4()[i][j];
                        }
                    }
                    horarioInic.setP4Aux(hor);
                    for (int j = 0; j < listHdeCP.size(); j++) {
                        listHdeCP.get(j).ponerP4(otherP4.get(j), week);
                        listHdeCP.get(j).setP4Aux(listHdeCP.get(j).getP4());
                    }
                    for (int j = 0; j < listHdeCP.size(); j++) {
                        listH.add((Horario) listHdeCP.get(j).clone());
//                        System.out.println("Entre  bbbbb ");
                    }
                    listH.add((Horario) horarioInic.clone());
                    week++;
                    for (int j = 0; j < ind.size(); j++) {
                        auxSemanas.add(week);
                    }
                    auxSemanas.add(week);
//                  System.out.println("longitud:  " + listH.size());
//                 System.out.println("inicia la semana ++++++++++" + week);
                    while (!ind.isEmpty()) {
                        int aux = ind.get(0);
                        int ub = 0;
                        for (int j = 1; j < ind.size(); j++) {
                            if (ind.get(j) > aux) {
                                aux = ind.get(j);
                                ub = j;
                            }
                        }
                        listHorarios.remove(aux);
                        ind.remove(ub);
                    }
                   // System.out.println("..." + listHorarios.size());
                   //  System.out.println("recompensa:   " + recF);
                    if (listHorarios.size() != 0) {
                        index = 0;
                        listHdeCP = new ArrayList<>();
                        firstHorario();
                    }
                    
//                    bar.setValue(val);
//                    val += val;
                }






                semanas = new ArrayList<>();
                for (int i = 0; i < auxSemanas.size(); i++) {
                    semanas.add(auxSemanas.get(i));
                }
                auxSemanas = new ArrayList<>();
                listHorarios = new ArrayList<>();
                for (int i = 0; i < listH.size(); i++) {
                    listHorarios.add((Horario) listH.get(i).clone());
//                    for (int j = 0; j < 6; j++) {
//                        for (int k = 0; k < listH.get(i).getP4().length; k++) {
//                            System.out.print("" + listH.get(i).getP4()[k][j]);
//                        }
//                        System.out.println("");
//                    }
                }
               // System.out.println("size:  " + listHorarios.size());
                listH = new ArrayList<>();
                index = 0;
                listHdeCP = new ArrayList<>();
                firstHorario();
           //      System.out.println("termina semana -------" + week);
            }
//            index = 0;
//            firstHorario();
        }
    
        return messag;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    private boolean firstHorario() {     //metodo que busca el horario por el cual se comienza a programar
        AsignaturaDAOImpl asi = new AsignaturaDAOImpl();
        GrupoDAOImpl aul = new GrupoDAOImpl();
        Calendar c = Calendar.getInstance();
        ind = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        horarioInic = null;
        index = 0;
        if (!listHorarios.isEmpty()) {
            try {
                fecha = sdf.parse(listHorarios.get(0).getDia()[0]);
            } catch (ParseException ex) {
                Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.setTime(fecha);
            for (int i = 1; i < listHorarios.size(); i++) {
                try {
                    fecha = sdf.parse(listHorarios.get(i).getDia()[0]);
                } catch (ParseException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (c.getTime().after(fecha)) {
                    index = i;
                }
            }
            horarioInic = (Horario) listHorarios.get(index).clone();
            ind.add(index);
         //   System.out.println("///" + listHorarios.size());
            for (int i = 0; i < listHorarios.size(); i++) {
            //    System.out.println("xxxx  " + listHorarios.get(i).getAno() + "-" + listHorarios.get(i).getCarrera() + "#" + listHorarios.get(i).getNumero());
                if (listHorarios.get(i).getAno() == horarioInic.getAno() && listHorarios.get(i).getCarrera().equals(horarioInic.getCarrera())) {
                    if (listHorarios.get(i).getNumero() != horarioInic.getNumero()) {
                        listHdeCP.add((Horario) listHorarios.get(i).clone());
                        ind.add(i);
                      //  System.out.println("xxxx  " + listHorarios.get(i).getAno() + "-" + listHorarios.get(i).getCarrera());
                    }
                }
            }
         //    System.out.println("xxxx :: " + horarioInic.getAno() + "-" + horarioInic.getCarrera());
            listAsig = asi.getAllAsignatura(horarioInic.getAno(), horarioInic.getCarrera());
            p4Semanal = new String[horarioInic.getP4().length][6];
            p4SemanalP = new String[horarioInic.getP4().length][6];
            for (int i = 0; i < horarioInic.getP4().length; i++) {
                for (int j = 0; j < horarioInic.getP4()[i].length; j++) {
                    p4Semanal[i][j] = horarioInic.getP4()[i][j];
                    p4SemanalP[i][j] = horarioInic.getP4()[i][j];
                }
            }
            secM = horarioInic.isSecM();
            secT = horarioInic.isSecT();
//            if( horarioInic.getWeek() == null){
//                
//            }
            week = semanas.get(index);
            dias = horarioInic.getDia();
            recF = 1;
            ArrayList<Grupo> gr = aul.getAll(horarioInic.getCarrera(), horarioInic.getNumero(), horarioInic.getAno());
            aulas = new int[gr.size() * 2];           // falta arreglar esto por lo de las aulas
            for (int i = 0; i < gr.size(); i++) {
                aulas[i * 2] = gr.get(i).getAulaConf();
                aulas[i * 2 + 1] = gr.get(i).getAulaCp();
            }
//            horarioInic.
//            if (listHdeCP.size() > 0) {
//                for (int i = 0; i < listHdeCP.size(); i++) {
//                    listH.add((Horario)listHdeCP.get(i).clone());
//                }
//            }
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Asignatura> getListAsig() {
        return listAsig;
    }

    public String[] getDias() {
        return dias;
    }

    public void delet() {
        ProfesorDAOImpl pdi = new ProfesorDAOImpl();
        pdi.deleteAll();
        AsignaturaDAOImpl adi = new AsignaturaDAOImpl();
        adi.deleteAll();
        AulaDAOImpl audi = new AulaDAOImpl();
        audi.deleteAll();
        AfectacionesDAOImpl1 afdi1 = new AfectacionesDAOImpl1();
        LaboratorioDAOImpl1 ldi1 = new LaboratorioDAOImpl1();
        AfectacionesDAOImpl2 afdi2 = new AfectacionesDAOImpl2();
        LaboratorioDAOImpl2 ldi2 = new LaboratorioDAOImpl2();
        AfectacionesDAOImpl3 afdi3 = new AfectacionesDAOImpl3();
        LaboratorioDAOImpl3 ldi3 = new LaboratorioDAOImpl3();
        AfectacionesDAOImpl4 afdi4 = new AfectacionesDAOImpl4();
        LaboratorioDAOImpl4 ldi4 = new LaboratorioDAOImpl4();
        AfectacionesDAOImpl5 afdi5 = new AfectacionesDAOImpl5();
        LaboratorioDAOImpl5 ldi5 = new LaboratorioDAOImpl5();
        AfectacionesDAOImpl6 afdi6 = new AfectacionesDAOImpl6();
        LaboratorioDAOImpl6 ldi6 = new LaboratorioDAOImpl6();
        AfectacionesDAOImpl7 afdi7 = new AfectacionesDAOImpl7();
        LaboratorioDAOImpl7 ldi7 = new LaboratorioDAOImpl7();
        AfectacionesDAOImpl8 afdi8 = new AfectacionesDAOImpl8();
        LaboratorioDAOImpl8 ldi8 = new LaboratorioDAOImpl8();
        AfectacionesDAOImpl9 afdi9 = new AfectacionesDAOImpl9();
        LaboratorioDAOImpl9 ldi9 = new LaboratorioDAOImpl9();
        AfectacionesDAOImpl10 afdi10 = new AfectacionesDAOImpl10();
        LaboratorioDAOImpl10 ldi10 = new LaboratorioDAOImpl10();
        AfectacionesDAOImpl11 afdi11 = new AfectacionesDAOImpl11();
        LaboratorioDAOImpl11 ldi11 = new LaboratorioDAOImpl11();
        AfectacionesDAOImpl12 afdi12 = new AfectacionesDAOImpl12();
        LaboratorioDAOImpl12 ldi12 = new LaboratorioDAOImpl12();
        AfectacionesDAOImpl13 afdi13 = new AfectacionesDAOImpl13();
        LaboratorioDAOImpl13 ldi13 = new LaboratorioDAOImpl13();
        AfectacionesDAOImpl14 afdi14 = new AfectacionesDAOImpl14();
        LaboratorioDAOImpl14 ldi14 = new LaboratorioDAOImpl14();
        AfectacionesDAOImpl15 afdi15 = new AfectacionesDAOImpl15();
        LaboratorioDAOImpl15 ldi15 = new LaboratorioDAOImpl15();
        AfectacionesDAOImpl16 afdi16 = new AfectacionesDAOImpl16();
        LaboratorioDAOImpl16 ldi16 = new LaboratorioDAOImpl16();
        AfectacionesDAOImpl17 afdi17 = new AfectacionesDAOImpl17();
        LaboratorioDAOImpl17 ldi17 = new LaboratorioDAOImpl17();
        afdi1.deleteAll();
        ldi1.deleteAll();
        afdi2.deleteAll();
        ldi2.deleteAll();
        afdi3.deleteAll();
        ldi3.deleteAll();
        afdi4.deleteAll();
        ldi4.deleteAll();
        afdi5.deleteAll();
        ldi5.deleteAll();
        afdi6.deleteAll();
        ldi6.deleteAll();
        afdi7.deleteAll();
        ldi7.deleteAll();
        afdi8.deleteAll();
        ldi8.deleteAll();
        afdi9.deleteAll();
        ldi9.deleteAll();
        afdi10.deleteAll();
        ldi10.deleteAll();
        afdi11.deleteAll();
        ldi11.deleteAll();
        afdi12.deleteAll();
        ldi12.deleteAll();
        afdi13.deleteAll();
        ldi13.deleteAll();
        afdi14.deleteAll();
        ldi14.deleteAll();
        afdi15.deleteAll();
        ldi15.deleteAll();
        afdi16.deleteAll();
        ldi16.deleteAll();
        afdi17.deleteAll();
        ldi17.deleteAll();

    }

    public void ocupacionLab() {
        LaboratorioDAOImpl1 lab1 = new LaboratorioDAOImpl1();
        LaboratorioDAOImpl2 lab2 = new LaboratorioDAOImpl2();
        LaboratorioDAOImpl3 lab3 = new LaboratorioDAOImpl3();
        LaboratorioDAOImpl4 lab4 = new LaboratorioDAOImpl4();
        LaboratorioDAOImpl5 lab5 = new LaboratorioDAOImpl5();
        LaboratorioDAOImpl6 lab6 = new LaboratorioDAOImpl6();
        LaboratorioDAOImpl7 lab7 = new LaboratorioDAOImpl7();
        LaboratorioDAOImpl8 lab8 = new LaboratorioDAOImpl8();
        LaboratorioDAOImpl9 lab9 = new LaboratorioDAOImpl9();
        AsignaturaDAOImpl asig = new AsignaturaDAOImpl();
        ProfesorDAOImpl pdi = new ProfesorDAOImpl();
        Profesor prof;
        String abrev;
        int inicio = 0;
        int size, cont = 0;
        ArrayList<Horario> lis = null;
        ArrayList<Horario> listHTemp = new ArrayList<>();
        ArrayList<Horario> listHTempLab = new ArrayList<>();
        for (int i = 0; i < listHorarios.size(); i++) {
            listHTemp.add((Horario) listHorarios.get(i).clone());
        }
        listHorarios = new ArrayList<>();
        Horario first;
        for (int i = 0; i < listHTemp.size(); i++) {
            lis = new ArrayList();
            first = (Horario) listHTemp.get(i).clone();
            //progress += first.getCantWeek();
            lis.add(first);
            for (int j = listHTemp.size() - 1; j > i; j--) {
                if (first.getAno() == listHTemp.get(j).getAno() && first.getCarrera().equals(listHTemp.get(j).getCarrera()) && first.getNumero() != listHTemp.get(j).getNumero()) {
                    lis.add(listHTemp.remove(j));
                }
            }
            size = lis.size();
            if (!lis.isEmpty()) {
                for (int j = 0; j < 9 && j < first.getCantWeek(); j++) {
                    if (j == 0) {
                        ArrayList<Laboratorio1> laborat1 = lab1.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat1.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat1.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat1.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat1.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[0]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[1]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[2]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[3]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[4]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[4]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[4]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[4]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[4]);
                                cont++;
                            }
                            if (laborat1.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[4]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 1) {
                        ArrayList<Laboratorio2> laborat2 = lab2.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat2.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat2.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat2.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat2.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[7]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[8]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[9]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[10]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[11]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[11]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[11]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[11]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[11]);
                                cont++;
                            }
                            if (laborat2.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[11]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 2) {
                        ArrayList<Laboratorio3> laborat3 = lab3.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat3.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat3.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat3.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat3.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[14]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[15]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[16]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[17]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[18]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[18]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[18]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[18]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[18]);
                                cont++;
                            }
                            if (laborat3.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[18]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 3) {
                        ArrayList<Laboratorio4> laborat4 = lab4.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat4.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat4.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat4.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat4.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[21]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[22]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[23]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[24]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[25]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[25]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[25]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[25]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[25]);
                                cont++;
                            }
                            if (laborat4.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[25]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 4) {
                        ArrayList<Laboratorio5> laborat5 = lab5.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat5.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat5.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat5.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat5.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[28]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[29]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[30]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[31]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            if (laborat5.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[32]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 5) {
                        ArrayList<Laboratorio6> laborat6 = lab6.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat6.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat6.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat6.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat6.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[35]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[36]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[37]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[38]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[39]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[39]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[39]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[39]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[39]);
                                cont++;
                            }
                            if (laborat6.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[39]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 6) {
                        ArrayList<Laboratorio7> laborat7 = lab7.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat7.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat7.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat7.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat7.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[42]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[43]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[44]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[45]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[46]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[46]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[46]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[46]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[46]);
                                cont++;
                            }
                            if (laborat7.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[46]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 7) {
                        ArrayList<Laboratorio8> laborat8 = lab8.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat8.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat8.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat8.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat8.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[49]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[50]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[51]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[52]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[53]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[53]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[53]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[53]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[53]);
                                cont++;
                            }
                            if (laborat8.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[53]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                    if (j == 8) {
                        ArrayList<Laboratorio9> laborat9 = lab9.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                        for (int k = 0; k < laborat9.size(); k++) {
                            abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat9.get(k).getNombre());
                            prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat9.get(k).getNombre(), "C").get(0);
                            ProfesoRest pr = new ProfesoRest();
                            pr.setProfesor(prof);
                            if (laborat9.get(k).getLunes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getLunes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getLunes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getLunes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getLunes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getLunes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[56]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMartes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[57]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getMiercoles6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[58]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getJueves6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[59]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes1() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                    }
                                }
                                pr.setTurno(0, first.getDia()[60]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes2() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                    }
                                }
                                pr.setTurno(1, first.getDia()[60]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes3() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                    }
                                }
                                pr.setTurno(2, first.getDia()[60]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes4() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                    }
                                }
                                pr.setTurno(3, first.getDia()[60]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes5() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                    }
                                }
                                pr.setTurno(4, first.getDia()[60]);
                                cont++;
                            }
                            if (laborat9.get(k).getViernes6() == 1) {
                                lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                if (size > 1) {
                                    for (int f = 1; f < size; f++) {
                                        lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                    }
                                }
                                pr.setTurno(5, first.getDia()[60]);
                                cont++;
                            }
                            profRD.add(pr);
                        }
                    }
                }
            }
            for (int j = 0; j < lis.size(); j++) {
                listHorarios.add((Horario) lis.get(j).clone());
            }
        }
    }

    public void ocupacionLab1() {
        LaboratorioDAOImpl10 lab10 = new LaboratorioDAOImpl10();
        LaboratorioDAOImpl11 lab11 = new LaboratorioDAOImpl11();
        LaboratorioDAOImpl12 lab12 = new LaboratorioDAOImpl12();
        LaboratorioDAOImpl13 lab13 = new LaboratorioDAOImpl13();
        LaboratorioDAOImpl14 lab14 = new LaboratorioDAOImpl14();
        LaboratorioDAOImpl15 lab15 = new LaboratorioDAOImpl15();
        LaboratorioDAOImpl16 lab16 = new LaboratorioDAOImpl16();
        LaboratorioDAOImpl17 lab17 = new LaboratorioDAOImpl17();
        AsignaturaDAOImpl asig = new AsignaturaDAOImpl();
        ProfesorDAOImpl pdi = new ProfesorDAOImpl();
        Profesor prof;
        String abrev;
        int size, cont = 0;
        ArrayList<Horario> lis;
        ArrayList<Horario> listHTemp = new ArrayList<>();
        for (int i = 0; i < listHorarios.size(); i++) {
            listHTemp.add((Horario) listHorarios.get(i).clone());
        }
        listHorarios = new ArrayList<>();
        Horario first;
        for (int i = 0; i < listHTemp.size(); i++) {
            lis = new ArrayList();
            first = (Horario) listHTemp.get(i).clone();
            //progress += first.getCantWeek();
            lis.add(first);
            for (int j = listHTemp.size() - 1; j > i; j--) {
                if (first.getAno() == listHTemp.get(j).getAno() && first.getCarrera().equals(listHTemp.get(j).getCarrera()) && first.getNumero() != listHTemp.get(j).getNumero()) {
                    lis.add(listHTemp.remove(j));
                }
            }
            size = lis.size();
            if (!lis.isEmpty()) {
                if (first.getCantWeek() > 8) {
                    for (int j = 9; j < lis.get(0).getCantWeek(); j++) {
                        if (j == 9) {
                            ArrayList<Laboratorio10> laborat10 = lab10.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat10.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat10.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat10.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat10.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[63]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[64]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[65]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[66]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[67]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[67]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[67]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[67]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[67]);
                                    cont++;
                                }
                                if (laborat10.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[67]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 10) {
                            ArrayList<Laboratorio11> laborat11 = lab11.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat11.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat11.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat11.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat11.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[70]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[71]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[72]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[73]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[74]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[74]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[74]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[74]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[74]);
                                    cont++;
                                }
                                if (laborat11.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[74]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 11) {
                            ArrayList<Laboratorio12> laborat12 = lab12.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat12.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat12.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat12.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat12.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[77]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[78]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[79]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[80]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[81]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[81]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[81]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[81]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[81]);
                                    cont++;
                                }
                                if (laborat12.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[81]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 12) {
                            ArrayList<Laboratorio13> laborat13 = lab13.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat13.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat13.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat13.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat13.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[84]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[85]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[86]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[87]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[88]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[88]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[88]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[88]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[88]);
                                    cont++;
                                }
                                if (laborat13.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[88]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 13) {
                            ArrayList<Laboratorio14> laborat14 = lab14.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat14.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat14.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat14.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat14.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[91]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[92]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[93]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[94]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[95]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[95]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[95]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[95]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[95]);
                                    cont++;
                                }
                                if (laborat14.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[95]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 14) {
                            ArrayList<Laboratorio15> laborat15 = lab15.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat15.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat15.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat15.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat15.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[98]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[99]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[100]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[101]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[102]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[102]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[102]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[102]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[102]);
                                    cont++;
                                }
                                if (laborat15.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[102]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 15) {
                            ArrayList<Laboratorio16> laborat16 = lab16.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat16.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat16.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat16.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat16.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[105]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[106]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[107]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[108]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[109]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[109]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[109]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[109]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[109]);
                                    cont++;
                                }
                                if (laborat16.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[109]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                        if (j == 16) {
                            ArrayList<Laboratorio17> laborat17 = lab17.getAllLab(lis.get(0).getAno(), lis.get(0).getCarrera());
                            for (int k = 0; k < laborat17.size(); k++) {
                                abrev = asig.getAsignatura(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat17.get(k).getNombre());
                                prof = pdi.getAllProfesorTipo(lis.get(0).getAno(), lis.get(0).getCarrera(), laborat17.get(k).getNombre(), "C").get(0);
                                ProfesoRest pr = new ProfesoRest();
                                pr.setProfesor(prof);
                                if (laborat17.get(k).getLunes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getLunes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getLunes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getLunes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getLunes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getLunes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[112]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMartes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 1][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 1][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[113]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getMiercoles6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 2][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 2][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[114]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getJueves6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 3][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 3][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[115]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes1() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][0] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][0] = "--";
                                        }
                                    }
                                    pr.setTurno(0, first.getDia()[116]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes2() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][1] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][1] = "--";
                                        }
                                    }
                                    pr.setTurno(1, first.getDia()[116]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes3() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][2] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][2] = "--";
                                        }
                                    }
                                    pr.setTurno(2, first.getDia()[116]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes4() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][3] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][3] = "--";
                                        }
                                    }
                                    pr.setTurno(3, first.getDia()[116]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes5() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][4] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][4] = "--";
                                        }
                                    }
                                    pr.setTurno(4, first.getDia()[116]);
                                    cont++;
                                }
                                if (laborat17.get(k).getViernes6() == 1) {
                                    lis.get(cont % lis.size()).getP4()[j * 7 + 4][5] = "Lab-" + abrev;
                                    if (size > 1) {
                                        for (int f = 1; f < size; f++) {
                                            lis.get((cont + f) % size).getP4()[j * 7 + 4][5] = "--";
                                        }
                                    }
                                    pr.setTurno(5, first.getDia()[116]);
                                    cont++;
                                }
                                profRD.add(pr);
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < lis.size(); j++) {
                listHorarios.add((Horario) lis.get(j).clone());
            }
        }
    }

    public void imprimir() {
        double cu = Double.parseDouble(""+cumple);
        System.out.println("% de restricciones que cumple " + cu / total * 100 +"%");
        System.out.println("cant de restricciones que cumple " + cumple);
        System.out.println("total de restricciones " +total);
    }
}
