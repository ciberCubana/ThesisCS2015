/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Profesor;

/**
 *
 * @author Family
 */
public interface ProfesorDAO {
    public ArrayList<Profesor> getAll();
    public void insert(Profesor p);
    public void delete(Profesor p);
    public void update(Profesor p);
     public ArrayList<Profesor> getAllProfesor(int ano, String carrera, String asig);
}
