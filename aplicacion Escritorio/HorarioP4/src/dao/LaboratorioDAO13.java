/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio13;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO13 {
    public ArrayList<Laboratorio13> getAllLab(int ano, String carrera);
    public void insert(Laboratorio13 l);
    public void delete(Laboratorio13 l);
    public void update(Laboratorio13 l);
}
