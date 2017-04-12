/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Asignatura;


public interface AsignaturaDAO {
    public ArrayList<Asignatura> getAll();
    public void insert(Asignatura a);
    public void delete(Asignatura a);
    public void update(Asignatura a);
}
