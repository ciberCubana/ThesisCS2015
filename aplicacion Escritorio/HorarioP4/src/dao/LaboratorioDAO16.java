/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio16;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO16 {
    public ArrayList<Laboratorio16> getAllLab(int ano, String carrera);
    public void insert(Laboratorio16 l);
    public void delete(Laboratorio16 l);
    public void update(Laboratorio16 l);
}
