/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Profesores {

    private String nombre;
    private String apellidos;
    private String asignatura;
    private String conf;
    private String cp;
    private String correo;
    private String categ;
    private String telef;
    private String depart;

    public Profesores(String nombre, String apellidos, String asignatura, String conf, String cp, String correo, String categ, String telef, String depart) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
        this.conf = conf;
        this.cp = cp;
        this.correo = correo;
        this.categ = categ;
        this.telef = telef;
        this.depart = depart;
    }
    
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getCateg() {
        return categ;
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

    public String getTelef() {
        return telef;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setCateg(String categ) {
        this.categ = categ;
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

    public void setTelef(String telef) {
        this.telef = telef;
    }
    
}
