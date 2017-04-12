/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones8;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO8 {
    public ArrayList<Afectaciones8> getAllAfect(String nombreProf);
    public void insert(Afectaciones8 a);
    public void delete(Afectaciones8 a);
    public void update(Afectaciones8 a);
}
