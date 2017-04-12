/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio2;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO2 {
    public ArrayList<Laboratorio2> getAllLab(int ano, String carrera);
    public void insert(Laboratorio2 l);
    public void delete(Laboratorio2 l);
    public void update(Laboratorio2 l);
}
