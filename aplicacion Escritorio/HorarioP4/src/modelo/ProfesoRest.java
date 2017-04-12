/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapeo.Profesor;

/**
 *
 * @author work
 */
public class ProfesoRest implements Cloneable {

    private Profesor profesor;
    private ArrayList<String> dia;
    private boolean[][] turno;

    public ProfesoRest(Profesor profesor, String dia, int t) {
        this.dia = new ArrayList<>();
        this.dia.add(dia);
        this.profesor = profesor;
        turno = new boolean[50][6];
        turno[0][t] = true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ProfesoRest obj = (ProfesoRest) (super.clone());
        obj.dia = new ArrayList<>();

        for (int i = 0; i < dia.size(); i++) {
            obj.dia.add(dia.get(i));

        }
        if (this.turno.length > 0) {
            obj.turno = new boolean[this.turno.length][6];
        } else {
            obj.turno = new boolean[50][6];
        }
        for (int i = 0; i < this.turno.length; i++) {
            for (int j = 0; j < 6; j++) {
                obj.turno[i][j] = this.turno[i][j];
            }
        }

        if (this.profesor != null) {
            obj.profesor = (Profesor) this.profesor.clone();
        }
        return obj;
    }

    public ProfesoRest() {
        this.dia = new ArrayList<>();
        turno = new boolean[50][6];
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<String> getDia() {
        return dia;
    }

    public boolean getTurno(int t, String d) {
        int dt = searchDay(d);
        if (dt == -1) {
            return true;
        } else {
            if ((t == 2 && turno[dt][t + 1]) || (t == 3 && turno[dt][t - 1])) {
                return false;
            }
        }
        return !turno[dt][t];
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setDia(String dia) {                     //falta añadir los dias en que se van ocupando los profesores
        this.dia.add(dia);
    }

    public boolean setTurno(int t, String day) {            //falta añadir los turnos nuevos que se van dando
        int d = searchDay(day);
        if (d != -1) {
            if ((t == 2 && turno[d][t + 1]) || (t == 3 && turno[d][t - 1])) {
                return false;
            }
            if (turno[d][t]) {
                return false;
            } else {
                turno[d][t] = true;
            }
        } else {
            setDia(day);
            if (dia.size() > this.turno.length) {
                boolean[][] aux = this.turno;
                this.turno = new boolean[dia.size() * 2][6];
                System.arraycopy(aux, 0, this.turno, 0, aux.length);
            }
            turno[dia.size() - 1][t] = true;
        }
        return true;
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

    @Override
    public String toString() {
        String messag = profesor.getNombre() + " " + profesor.getApellidos() + " - " + profesor.getCorreo() + "\n";
        for (int i = 0; i < dia.size(); i++) {
            messag += dia.get(i) + " turnos:\n";
            for (int j = 0; j < 6; j++) {
                messag += " " + turno[i][j];
            }
            messag += "\n";
        }
        return messag;
    }
}
