/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio11;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO11 {
    public ArrayList<Laboratorio11> getAllLab(int ano, String carrera);
    public void insert(Laboratorio11 l);
    public void delete(Laboratorio11 l);
    public void update(Laboratorio11 l);
}
