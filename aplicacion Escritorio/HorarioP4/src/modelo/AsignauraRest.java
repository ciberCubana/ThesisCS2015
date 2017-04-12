/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Family
 */
public class AsignauraRest {
    private Asignat asignatura;
    private String dia;
    private boolean[] turno;

    public AsignauraRest(Asignat asignatura, String dia, int turno) {
        this.asignatura = asignatura;
        this.dia = dia;
        this.turno = new boolean[6];
        this.turno[turno] = true;
    }

    public Asignat getAsignatura() {
        return asignatura;
    }

    public String getDia() {
        return dia;
    }

    public boolean[] getTurno() {
        return turno;
    }

    public void setAsignatura(Asignat asignatura) {
        this.asignatura = asignatura;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean setTurno(int t) {
        if (turno[t]) {
            return false;
        }
        turno[t] = true;
        return true;
    }
    
}
