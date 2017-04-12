/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio4;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO4 {
    public ArrayList<Laboratorio4> getAllLab(int ano, String carrera);
    public void insert(Laboratorio4 l);
    public void delete(Laboratorio4 l);
    public void update(Laboratorio4 l);
}
