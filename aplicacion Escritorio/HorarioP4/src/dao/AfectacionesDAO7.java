/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones7;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO7 {
    public ArrayList<Afectaciones7> getAllAfect(String nombreProf);
    public void insert(Afectaciones7 a);
    public void delete(Afectaciones7 a);
    public void update(Afectaciones7 a);
}
