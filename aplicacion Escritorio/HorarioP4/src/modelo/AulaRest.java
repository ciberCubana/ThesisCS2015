/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import mapeo.Aula;

/**
 *
 * @author work
 */
public class AulaRest {

    private ArrayList<String> dia;
    private Aula aula;
    private boolean[][] turno;

    public AulaRest(String dia, int turno, int numero, int tipo) { // 0-Clase Practica y seminarios
        this.dia = new ArrayList<>();                              // 1-Conferencia y examen
        this.dia.add(dia);
        this.turno = new boolean[50][6];
        setTurno(this.dia.size()-1, turno);
        aula.setNumero(numero);
        aula.setTipo(tipo);
    }

    public ArrayList<String> getDia() {
        return dia;
    }

    public int getTipo() {
        return aula.getTipo();
    }

    public boolean[][] getTurno() {
        return turno;
    }

    public int getNumero() {
        return aula.getNumero();
    }

    public boolean setTurno(int d, int t) {
        if (turno.length < dia.size()) {
            boolean[][] aux = turno;
            turno = new boolean[dia.size() * 2][6];
            System.arraycopy(aux, 0, turno, 0, aux.length);
        }
        if (turno[d][t]) {
            return false;
        }
        turno[d][t] = true;
        return true;
    }

    public void setNumero(int numero) {
        aula.setNumero(numero);
    }

    public void setTurno(int t, String day) {
        dia.add(day);
        if (turno.length < dia.size()) {
            boolean[][] aux = turno;
            turno = new boolean[dia.size() * 2][6];
            System.arraycopy(aux, 0, turno, 0, aux.length);
        }
        turno[dia.size() - 1][t] = true;
    }

    public int searchDay(String dia) {
        String[] datos = dia.split(" ");
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
}
