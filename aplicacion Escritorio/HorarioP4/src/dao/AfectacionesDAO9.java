/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones9;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO9 {
    public ArrayList<Afectaciones9> getAllAfect(String nombreProf);
    public void insert(Afectaciones9 a);
    public void delete(Afectaciones9 a);
    public void update(Afectaciones9 a);
}
