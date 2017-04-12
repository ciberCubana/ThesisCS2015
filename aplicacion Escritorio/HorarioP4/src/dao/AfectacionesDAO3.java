/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones3;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO3 {
    public ArrayList<Afectaciones3> getAllAfect(String nombreProf);
    public void insert(Afectaciones3 a);
    public void delete(Afectaciones3 a);
    public void update(Afectaciones3 a);
}
