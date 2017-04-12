/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import mapeo.Afectaciones12;

/**
 *
 * @author Family
 */
public interface AfectacionesDAO12 {
    public ArrayList<Afectaciones12> getAllAfect(String nombreProf);
    public void insert(Afectaciones12 a);
    public void delete(Afectaciones12 a);
    public void update(Afectaciones12 a);
}
