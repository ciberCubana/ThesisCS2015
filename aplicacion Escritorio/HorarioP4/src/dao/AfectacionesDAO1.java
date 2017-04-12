/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones1;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO1 {
    public ArrayList<Afectaciones1> getAllAfect(String nombreProf);
    public void insert(Afectaciones1 a);
    public void delete(Afectaciones1 a);
    public void update(Afectaciones1 a);
}
