/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio1;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO1 {
    public ArrayList<Laboratorio1> getAllLab(int ano, String carrera);
    public void insert(Laboratorio1 l);
    public void delete(Laboratorio1 l);
    public void update(Laboratorio1 l);
}
