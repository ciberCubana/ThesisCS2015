/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio7;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO7 {
    public ArrayList<Laboratorio7> getAllLab(int ano, String carrera);
    public void insert(Laboratorio7 l);
    public void delete(Laboratorio7 l);
    public void update(Laboratorio7 l);
}
