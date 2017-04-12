/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio15;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO15 {
    public ArrayList<Laboratorio15> getAllLab(int ano, String carrera);
    public void insert(Laboratorio15 l);
    public void delete(Laboratorio15 l);
    public void update(Laboratorio15 l);
}
