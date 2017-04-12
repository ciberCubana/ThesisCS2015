/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Laboratorio9;

/**
 *
 * @author Family
 */
public interface LaboratorioDAO9 {
    public ArrayList<Laboratorio9> getAllLab(int ano, String carrera);
    public void insert(Laboratorio9 l);
    public void delete(Laboratorio9 l);
    public void update(Laboratorio9 l);
}
