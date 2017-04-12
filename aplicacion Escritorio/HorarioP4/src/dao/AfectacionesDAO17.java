/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones17;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO17 {
    public ArrayList<Afectaciones17> getAllAfect(String nombreProf);
    public void insert(Afectaciones17 a);
    public void delete(Afectaciones17 a);
    public void update(Afectaciones17 a);
}
