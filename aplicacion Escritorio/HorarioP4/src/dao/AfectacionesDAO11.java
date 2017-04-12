/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones11;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO11 {
    public ArrayList<Afectaciones11> getAllAfect(String nombreProf);
    public void insert(Afectaciones11 a);
    public void delete(Afectaciones11 a);
    public void update(Afectaciones11 a);
}
