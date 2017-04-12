/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Grupo;

/**
 *
 * @author work
 */
public interface GrupoDAO {
     public ArrayList<Grupo> getAll();
    public void insert(Grupo a);
    public void delete(Grupo a);
    public void update(Grupo a);
}
