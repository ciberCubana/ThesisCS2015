/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones5;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO5 {
    public ArrayList<Afectaciones5> getAllAfect(String nombreProf);
    public void insert(Afectaciones5 a);
    public void delete(Afectaciones5 a);
    public void update(Afectaciones5 a);
}
