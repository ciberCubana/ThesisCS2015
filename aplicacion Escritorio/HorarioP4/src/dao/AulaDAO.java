/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Aula;


/**
 *
 * @author Family
 */
public interface AulaDAO {
    public ArrayList<Aula> getAll();
    public void insert(Aula a);
    public void delete(Aula a);
    public void update(Aula a);
}
