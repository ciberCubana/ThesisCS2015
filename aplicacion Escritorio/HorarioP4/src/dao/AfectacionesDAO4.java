/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones4;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO4 {
    public ArrayList<Afectaciones4> getAllAfect(String nombreProf);
    public void insert(Afectaciones4 a);
    public void delete(Afectaciones4 a);
    public void update(Afectaciones4 a);
}
