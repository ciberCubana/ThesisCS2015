/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio3;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO3 {
    public ArrayList<Laboratorio3> getAllLab(int ano, String carrera);
    public void insert(Laboratorio3 l);
    public void delete(Laboratorio3 l);
    public void update(Laboratorio3 l);
}
