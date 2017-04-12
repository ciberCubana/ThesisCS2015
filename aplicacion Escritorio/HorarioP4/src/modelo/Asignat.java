/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.impl.ProfesorDAOImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mapeo.Profesor;

/**
 *
 * @author Family
 */
public class Asignat implements Cloneable{

    private String nombre;
    private String carrera;
    private int ano;
    private String abrev;
    private ArrayList<Profesor> profesor;
    private String day;

    public Asignat(String nombre, String carrera, int ano, String abrev) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.ano = ano;
        this.abrev = abrev;
        ProfesorDAOImpl prof = new ProfesorDAOImpl();
        profesor = prof.getAllProfesor(ano, carrera, nombre);
    }

    @Override
    public Object clone(){
        Asignat obj = null;
        try {
            obj = (Asignat) super.clone();
            obj.nombre = this.nombre;
            obj.abrev = this.abrev;
            obj.ano = this.ano;
            obj.carrera = this.carrera;
            obj.day = this.day;
            obj.profesor =  new ArrayList<>();
            for (int i = 0; i < profesor.size(); i++) {
                obj.profesor.add((Profesor)this.profesor.get(i).clone());
            }
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Asignat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obj;
    } 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDay(String day) {
        this.day = day;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getAbrev() {
        return abrev;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getAno() {
        return ano;
    }

    public String getDay() {
        return day;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }
    
    public boolean searchProfesor(Profesores p){
        int i = 0;
        while(i < profesor.size()){
            if(p.getCorreo().equals(profesor.get(i).getCorreo())){
                return true;
            }
        }
        return false;
    }
    
}
