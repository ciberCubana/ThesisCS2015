/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones6;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO6 {
    public ArrayList<Afectaciones6> getAllAfect(String nombreProf);
    public void insert(Afectaciones6 a);
    public void delete(Afectaciones6 a);
    public void update(Afectaciones6 a);
}
