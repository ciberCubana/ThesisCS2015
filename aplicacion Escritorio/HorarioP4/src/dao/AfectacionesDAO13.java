/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones13;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO13 {
    public ArrayList<Afectaciones13> getAllAfect(String nombreProf);
    public void insert(Afectaciones13 a);
    public void delete(Afectaciones13 a);
    public void update(Afectaciones13 a);
}
