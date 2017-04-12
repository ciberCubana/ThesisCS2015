/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeo;

import java.io.Serializable;

public class Profesor implements Serializable, Cloneable{

    private String nombre;
    private String apellidos;
    private String asignatura;
    private String carrera;
    private int ano;
    private String conf;
    private String cp;
    private String correo;

    
    @Override
    public Object clone() throws CloneNotSupportedException{
       Profesor obj  = (Profesor)super.clone();
       obj.ano = this.ano;
       obj.apellidos = this.apellidos;
       obj.asignatura = this.asignatura;
       obj.nombre = this.nombre;
       obj.carrera = this.carrera;
       obj.cp = this.cp;
       obj.conf = this.conf;
       obj.correo = this.correo;
        return super.clone();  
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAno() {
        return ano;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getConf() {
        return conf;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCp() {
        return cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
