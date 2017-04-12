/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones15;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO15 {
    public ArrayList<Afectaciones15> getAllAfect(String nombreProf);
    public void insert(Afectaciones15 a);
    public void delete(Afectaciones15 a);
    public void update(Afectaciones15 a);
}
