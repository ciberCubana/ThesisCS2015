/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio6;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO6 {
    public ArrayList<Laboratorio6> getAllLab(int ano, String carrera);
    public void insert(Laboratorio6 l);
    public void delete(Laboratorio6 l);
    public void update(Laboratorio6 l);
}
