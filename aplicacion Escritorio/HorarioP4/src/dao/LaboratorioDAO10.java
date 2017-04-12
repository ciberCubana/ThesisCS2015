/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio10;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO10 {
    public ArrayList<Laboratorio10> getAllLab(int ano, String carrera);
    public void insert(Laboratorio10 l);
    public void delete(Laboratorio10 l);
    public void update(Laboratorio10 l);
}
