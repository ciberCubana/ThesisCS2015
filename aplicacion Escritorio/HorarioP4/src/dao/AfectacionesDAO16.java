/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones16;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO16 {
    public ArrayList<Afectaciones16> getAllAfect(String nombreProf);
    public void insert(Afectaciones16 a);
    public void delete(Afectaciones16 a);
    public void update(Afectaciones16 a);
}
