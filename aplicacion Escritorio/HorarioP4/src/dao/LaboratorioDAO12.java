/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio12;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO12 {
    public ArrayList<Laboratorio12> getAllLab(int ano, String carrera);
    public void insert(Laboratorio12 l);
    public void delete(Laboratorio12 l);
    public void update(Laboratorio12 l);
}
