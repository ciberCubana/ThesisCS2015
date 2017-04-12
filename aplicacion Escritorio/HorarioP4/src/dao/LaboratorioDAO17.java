/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio17;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO17 {
    public ArrayList<Laboratorio17> getAllLab(int ano, String carrera);
    public void insert(Laboratorio17 l);
    public void delete(Laboratorio17 l);
    public void update(Laboratorio17 l);
}
