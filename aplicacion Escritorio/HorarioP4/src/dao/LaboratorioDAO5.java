/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio5;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO5 {
    public ArrayList<Laboratorio5> getAllLab(int ano, String carrera);
    public void insert(Laboratorio5 l);
    public void delete(Laboratorio5 l);
    public void update(Laboratorio5 l);
}
