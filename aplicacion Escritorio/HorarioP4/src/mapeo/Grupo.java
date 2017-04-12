/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeo;

import java.io.Serializable;

/**
 *
 * @author work
 */
public class Grupo implements Serializable {
    private int numero, ano, aulaConf, aulaCp;
    private String carrera;

    public int getAno() {
        return ano;
    }

    public int getAulaConf() {
        return aulaConf;
    }

    public int getAulaCp() {
        return aulaCp;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getNumero() {
        return numero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAulaConf(int aulaConf) {
        this.aulaConf = aulaConf;
    }

    public void setAulaCp(int aulaCp) {
        this.aulaCp = aulaCp;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
