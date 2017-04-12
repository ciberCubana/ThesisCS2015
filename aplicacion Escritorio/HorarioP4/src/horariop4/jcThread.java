/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horariop4;

import javax.swing.JProgressBar;

/**
 * @web http://www.jc-mouse.net
 *
 * @author Mouse
 */
public class jcThread implements Runnable {
    
    private JProgressBar jProgressBar;
    private int i;
//    private int value = 50;//retardo en milisegundos

    /**
     * Constructor de clase
     */
    public jcThread(JProgressBar jProgressBar, int prog) {
        this.jProgressBar = jProgressBar;
        this.jProgressBar.setStringPainted(true);
        i = prog;
    }
    
    @Override
    public void run() {
        while(Visual.band);
        //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
        while (!Visual.band) {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i > 100) ? 1 : i + i;
            jProgressBar.setValue(i);
            jProgressBar.repaint();
            //retardo en milisegundos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            //si el trabajo en paralelo a terminado
            if (Visual.band) {
                jProgressBar.setValue(100);
                System.out.println("Trabajo finalizado...");
                break;//rompe ciclo 
            }            
        }
    }
}
