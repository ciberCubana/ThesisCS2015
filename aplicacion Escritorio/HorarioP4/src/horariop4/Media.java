package horariop4;



/*
 *@author: Karel Alonso Quintanilla
 *e-mail: kalonso@uclv.edu.cu
 */

import java.io.*;
import javax.swing.ImageIcon;

public class Media {

    int TipoSonido;

    public static ImageIcon cIcon(String p) {
        java.net.URL imgURL = Media.class.getResource(p);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + p);
            return null;
        }
    }

   
}
