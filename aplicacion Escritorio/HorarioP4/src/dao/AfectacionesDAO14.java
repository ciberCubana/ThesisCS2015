/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones14;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO14 {
    public ArrayList<Afectaciones14> getAllAfect(String nombreProf);
    public void insert(Afectaciones14 a);
    public void delete(Afectaciones14 a);
    public void update(Afectaciones14 a);
}
