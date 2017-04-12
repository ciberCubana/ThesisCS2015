/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

public class DepartamentoRB {

    private String carrera;
    private String dia;
    private int turno;
    private ArrayList<Integer> semana;

    public DepartamentoRB(String carrera, String dia, int turno, ArrayList<Integer> semana) {
        this.carrera = carrera;
        this.dia = dia;
        this.turno = turno;
        this.semana = semana;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDia() {
        return dia;
    }

    public ArrayList<Integer> getSemana() {
        return semana;
    }

    public int getTurno() {
        return turno;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setSemana(ArrayList<Integer> semana) {
        this.semana = semana;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
