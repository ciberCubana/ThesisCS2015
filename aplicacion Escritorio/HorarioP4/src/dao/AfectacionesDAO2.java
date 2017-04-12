/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones2;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO2 {
    public ArrayList<Afectaciones2> getAllAfect(String nombreProf);
    public void insert(Afectaciones2 a);
    public void delete(Afectaciones2 a);
    public void update(Afectaciones2 a);
}
