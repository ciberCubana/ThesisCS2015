/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horariop4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import modelo.Desarrollo;
import modelo.Horario;

public class Job<T,V> extends SwingWorker<Void, Void> {
    private Desarrollo d;
    public static boolean band = false;

    public Job(Desarrollo d) {
        this.d = d;
    }

    public Desarrollo getD() {
        return d;
    }
    
    @Override
    protected Void doInBackground()  {
        try {
            d.horario();
            band = true;
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Job.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

