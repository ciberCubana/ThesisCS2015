/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeo;

import java.io.Serializable;

/**
 *
 * @author Family
 */
public class Aula implements Serializable{
    private int numero;
    private int tipo;

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
