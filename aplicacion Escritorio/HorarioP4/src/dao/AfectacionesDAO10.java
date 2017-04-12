/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones10;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO10 {
    public ArrayList<Afectaciones10> getAllAfect(String nombreProf);
    public void insert(Afectaciones10 a);
    public void delete(Afectaciones10 a);
    public void update(Afectaciones10 a);
}
