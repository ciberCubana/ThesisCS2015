/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio8;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO8 {
    public ArrayList<Laboratorio8> getAllLab(int ano, String carrera);
    public void insert(Laboratorio8 l);
    public void delete(Laboratorio8 l);
    public void update(Laboratorio8 l);
}
