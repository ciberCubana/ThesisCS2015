/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import mapeo.Profesor;

public class ProfesoresRB {

    private Profesor prof;
    private ArrayList<String> dia;
    private boolean[][] turno;

    public ProfesoresRB() {
        this.dia = new ArrayList<>();
        this.turno = new boolean[140][6];
    }

    public Profesor getProf() {
        return prof;
    }

    public ArrayList<String> getDia() {
        return dia;
    }

    public boolean[][] getTurno() {
        return turno;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
    }

    public void setDia(String dia) {
        this.dia.add(dia);
    }

//    public void setTurno(int turno, int d) {
//        if(dia.size() > this.turno.length){
//            boolean[][] aux = this.turno;
//            this.turno = new boolean[dia.size() * 2][6];
//            System.arraycopy(aux, 0, this.turno, 0, aux.length);
//        }
//        this.turno[d][turno] = true;
//    }
    
    public void setTurno(int turno, String day) {
        int d = searchDay(day);
        if(d == -1){
            dia.add(day);
            d = dia.size() - 1;
        }
        if(dia.size() > this.turno.length){
            boolean[][] aux = this.turno;
            this.turno = new boolean[dia.size() * 2][6];
            System.arraycopy(aux, 0, this.turno, 0, aux.length);
        }
        this.turno[d][turno] = true;
    }

    public int searchDay(String day) {
        int resp = -1, i = 0;
        while (i < dia.size()) {
            if (dia.get(i).equals(day)) {
                resp = i;
                i = dia.size();
            }
            i++;
        }
        return resp;
    }
}
