/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio14;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO14 {
    public ArrayList<Laboratorio14> getAllLab(int ano, String carrera);
    public void insert(Laboratorio14 l);
    public void delete(Laboratorio14 l);
    public void update(Laboratorio14 l);
}
