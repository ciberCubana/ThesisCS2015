/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.impl.*;
import java.util.ArrayList;
import mapeo.*;

public class Afectaciones {

    private int contRB = 0;

    public ProfesoresRB afectRB(String nombreP, String[] day) {
        ProfesoresRB prof = new ProfesoresRB();
        AfectacionesDAOImpl1 afD1 = new AfectacionesDAOImpl1();
        ArrayList<Afectaciones1> af1 = afD1.getAllAfect(nombreP);
        for (int i = 0; i < af1.size(); i++) {
            int cont = 0;
            if (af1.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af1.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af1.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af1.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af1.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af1.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af1.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af1.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af1.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af1.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af1.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af1.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af1.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af1.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af1.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af1.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af1.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af1.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af1.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af1.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af1.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl2 afD2 = new AfectacionesDAOImpl2();
        ArrayList<Afectaciones2> af2 = afD2.getAllAfect(nombreP);
        for (int i = 0; i < af2.size(); i++) {
            int cont = 0;
            if (af2.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af2.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af2.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af2.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af2.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af2.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af2.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af2.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af2.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af2.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af2.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af2.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af2.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af2.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af2.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af2.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af2.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af2.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af2.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af2.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af2.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl3 afD3 = new AfectacionesDAOImpl3();
        ArrayList<Afectaciones3> af3 = afD3.getAllAfect(nombreP);
        for (int i = 0; i < af3.size(); i++) {
            int cont = 0;
            if (af3.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af3.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af3.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af3.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af3.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af3.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af3.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af3.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af3.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af3.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af3.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af3.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af3.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af3.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af3.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af3.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af3.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af3.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af3.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af3.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af3.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl4 afD4 = new AfectacionesDAOImpl4();
        ArrayList<Afectaciones4> af4 = afD4.getAllAfect(nombreP);
        for (int i = 0; i < af4.size(); i++) {
            int cont = 0;
            if (af4.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af4.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af4.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af4.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af4.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af4.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af4.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af4.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af4.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af4.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af4.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af4.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af4.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af4.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af4.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af4.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af4.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af4.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af4.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af4.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af4.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl5 afD5 = new AfectacionesDAOImpl5();
        ArrayList<Afectaciones5> af5 = afD5.getAllAfect(nombreP);
        for (int i = 0; i < af5.size(); i++) {
            int cont = 0;
            if (af5.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af5.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af5.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af5.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af5.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af5.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af5.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af5.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af5.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af5.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af5.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af5.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af5.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af5.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af5.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af5.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af5.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af5.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af5.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af5.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af5.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl6 afD6 = new AfectacionesDAOImpl6();
        ArrayList<Afectaciones6> af6 = afD6.getAllAfect(nombreP);
        for (int i = 0; i < af6.size(); i++) {
            int cont = 0;
            if (af6.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af6.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af6.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af6.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af6.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af6.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af6.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af6.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af6.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af6.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af6.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af6.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af6.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af6.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af6.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af6.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af6.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af6.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af6.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af6.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af6.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl7 afD7 = new AfectacionesDAOImpl7();
        ArrayList<Afectaciones7> af7 = afD7.getAllAfect(nombreP);
        for (int i = 0; i < af7.size(); i++) {
            int cont = 0;
            if (af7.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af7.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af7.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af7.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af7.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af7.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af7.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af7.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af7.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af7.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af7.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af7.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af7.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af7.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af7.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af7.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af7.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af7.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af7.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af7.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af7.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl8 afD8 = new AfectacionesDAOImpl8();
        ArrayList<Afectaciones8> af8 = afD8.getAllAfect(nombreP);
        for (int i = 0; i < af8.size(); i++) {
            int cont = 0;
            if (af8.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af8.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af8.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af8.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af8.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af8.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af8.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af8.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af8.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af8.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af8.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af8.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af8.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af8.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af8.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af8.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af8.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af8.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af8.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af8.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af8.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl9 afD9 = new AfectacionesDAOImpl9();
        ArrayList<Afectaciones9> af9 = afD9.getAllAfect(nombreP);
        for (int i = 0; i < af9.size(); i++) {
            int cont = 0;
            if (af9.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af9.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af9.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af9.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af9.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af9.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af9.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af9.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af9.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af9.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af9.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af9.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af9.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af9.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af9.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af9.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af9.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af9.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af9.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af9.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af9.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl10 afD10 = new AfectacionesDAOImpl10();
        ArrayList<Afectaciones10> af10 = afD10.getAllAfect(nombreP);
        for (int i = 0; i < af10.size(); i++) {
            int cont = 0;
            if (af10.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af10.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af10.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af10.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af10.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af10.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af10.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af10.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af10.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af10.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af10.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af10.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af10.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af10.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af10.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af10.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af10.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af10.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af10.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af10.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af10.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl11 afD11 = new AfectacionesDAOImpl11();
        ArrayList<Afectaciones11> af11 = afD11.getAllAfect(nombreP);
        for (int i = 0; i < af11.size(); i++) {
            int cont = 0;
            if (af11.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af11.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af11.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af11.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af11.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af11.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af11.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af11.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af11.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af11.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af11.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af11.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af11.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af11.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af11.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af11.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af11.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af11.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af11.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af11.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af11.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl12 afD12 = new AfectacionesDAOImpl12();
        ArrayList<Afectaciones12> af12 = afD12.getAllAfect(nombreP);
        for (int i = 0; i < af12.size(); i++) {
            int cont = 0;
            if (af12.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af12.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af12.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af12.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af12.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af12.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af12.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af12.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af12.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af12.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af12.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af12.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af12.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af12.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af12.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af12.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af12.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af12.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af12.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af12.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af12.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl13 afD13 = new AfectacionesDAOImpl13();
        ArrayList<Afectaciones13> af13 = afD13.getAllAfect(nombreP);
        for (int i = 0; i < af13.size(); i++) {
            int cont = 0;
            if (af13.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af13.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af13.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af13.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af13.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af13.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af13.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af13.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af13.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af13.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af13.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af13.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af13.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af13.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af13.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af13.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af13.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af13.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af13.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af13.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af13.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl14 afD14 = new AfectacionesDAOImpl14();
        ArrayList<Afectaciones14> af14 = afD14.getAllAfect(nombreP);
        for (int i = 0; i < af14.size(); i++) {
            int cont = 0;
            if (af14.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af14.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af14.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af14.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af14.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af14.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af14.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af14.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af14.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af14.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af14.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af14.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af14.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af14.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af14.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af14.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af14.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af14.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af14.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af14.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af14.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl15 afD15 = new AfectacionesDAOImpl15();
        ArrayList<Afectaciones15> af15 = afD15.getAllAfect(nombreP);
        for (int i = 0; i < af15.size(); i++) {
            int cont = 0;
            if (af15.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af15.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af15.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af15.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af15.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af15.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af15.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af15.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af15.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af15.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af15.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af15.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af15.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af15.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af15.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af15.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af15.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af15.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af15.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af15.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af15.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl16 afD16 = new AfectacionesDAOImpl16();
        ArrayList<Afectaciones16> af16 = afD16.getAllAfect(nombreP);
        for (int i = 0; i < af16.size(); i++) {
            int cont = 0;
            if (af16.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af16.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af16.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af16.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af16.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af16.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af16.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af16.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af16.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af16.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af16.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af16.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af16.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af16.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af16.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af16.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af16.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af16.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af16.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af16.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af16.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }
        AfectacionesDAOImpl17 afD17 = new AfectacionesDAOImpl17();
        ArrayList<Afectaciones17> af17 = afD17.getAllAfect(nombreP);
        for (int i = 0; i < af17.size(); i++) {
            int cont = 0;
            if (af17.get(i).getLunes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af17.get(i).getLunes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af17.get(i).getLunes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af17.get(i).getLunes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af17.get(i).getLunes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af17.get(i).getLunes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af17.get(i).getMartes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMartes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMartes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMartes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMartes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMartes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af17.get(i).getMiercoles1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMiercoles2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMiercoles3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMiercoles4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMiercoles5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af17.get(i).getMiercoles6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af17.get(i).getJueves1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af17.get(i).getJueves2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af17.get(i).getJueves3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af17.get(i).getJueves4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af17.get(i).getJueves5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af17.get(i).getJueves6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
            if (af17.get(i).getViernes1() == 1) {
                prof.setTurno(0, day[cont]);
                contRB++;
            }
            if (af17.get(i).getViernes2() == 1) {
                prof.setTurno(1, day[cont]);
                contRB++;
            }
            if (af17.get(i).getViernes3() == 1) {
                prof.setTurno(2, day[cont]);
                contRB++;
            }
            if (af17.get(i).getViernes4() == 1) {
                prof.setTurno(3, day[cont]);
                contRB++;
            }
            if (af17.get(i).getViernes5() == 1) {
                prof.setTurno(4, day[cont]);
                contRB++;
            }
            if (af17.get(i).getViernes6() == 1) {
                prof.setTurno(5, day[cont]);
                contRB++;
            }
            cont++;
        }

        return prof;
    }

    public ProfesoRest afectRD(String nombreP, String[] day) {
        ProfesoRest prof = new ProfesoRest();
        AfectacionesDAOImpl1 afD1 = new AfectacionesDAOImpl1();
        ArrayList<Afectaciones1> af1 = afD1.getAllAfect(nombreP);
        for (int i = 0; i < af1.size(); i++) {
            int cont = 0;
            if (af1.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af1.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af1.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af1.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af1.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af1.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af1.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af1.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af1.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af1.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af1.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af1.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af1.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af1.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af1.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af1.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af1.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af1.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af1.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af1.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af1.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af1.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af1.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af1.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af1.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af1.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af1.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af1.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af1.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af1.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl2 afD2 = new AfectacionesDAOImpl2();
        ArrayList<Afectaciones2> af2 = afD2.getAllAfect(nombreP);
        for (int i = 0; i < af2.size(); i++) {
            int cont = 0;
            if (af2.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af2.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af2.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af2.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af2.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af2.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af2.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af2.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af2.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af2.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af2.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af2.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af2.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af2.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af2.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af2.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af2.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af2.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af2.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af2.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af2.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af2.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af2.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af2.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af2.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af2.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af2.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af2.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af2.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af2.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl3 afD3 = new AfectacionesDAOImpl3();
        ArrayList<Afectaciones3> af3 = afD3.getAllAfect(nombreP);
        for (int i = 0; i < af3.size(); i++) {
            int cont = 0;
            if (af3.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af3.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af3.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af3.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af3.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af3.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af3.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af3.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af3.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af3.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af3.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af3.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af3.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af3.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af3.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af3.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af3.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af3.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af3.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af3.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af3.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af3.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af3.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af3.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af3.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af3.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af3.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af3.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af3.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af3.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl4 afD4 = new AfectacionesDAOImpl4();
        ArrayList<Afectaciones4> af4 = afD4.getAllAfect(nombreP);
        for (int i = 0; i < af4.size(); i++) {
            int cont = 0;
            if (af4.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af4.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af4.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af4.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af4.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af4.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af4.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af4.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af4.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af4.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af4.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af4.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af4.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af4.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af4.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af4.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af4.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af4.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af4.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af4.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af4.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af4.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af4.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af4.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af4.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af4.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af4.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af4.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af4.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af4.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl5 afD5 = new AfectacionesDAOImpl5();
        ArrayList<Afectaciones5> af5 = afD5.getAllAfect(nombreP);
        for (int i = 0; i < af5.size(); i++) {
            int cont = 0;
            if (af5.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af5.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af5.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af5.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af5.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af5.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af5.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af5.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af5.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af5.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af5.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af5.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af5.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af5.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af5.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af5.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af5.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af5.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af5.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af5.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af5.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af5.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af5.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af5.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af5.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af5.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af5.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af5.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af5.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af5.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl6 afD6 = new AfectacionesDAOImpl6();
        ArrayList<Afectaciones6> af6 = afD6.getAllAfect(nombreP);
        for (int i = 0; i < af6.size(); i++) {
            int cont = 0;
            if (af6.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af6.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af6.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af6.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af6.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af6.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af6.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af6.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af6.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af6.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af6.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af6.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af6.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af6.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af6.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af6.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af6.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af6.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af6.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af6.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af6.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af6.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af6.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af6.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af6.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af6.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af6.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af6.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af6.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af6.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl7 afD7 = new AfectacionesDAOImpl7();
        ArrayList<Afectaciones7> af7 = afD7.getAllAfect(nombreP);
        for (int i = 0; i < af7.size(); i++) {
            int cont = 0;
            if (af7.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af7.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af7.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af7.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af7.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af7.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af7.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af7.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af7.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af7.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af7.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af7.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af7.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af7.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af7.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af7.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af7.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af7.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af7.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af7.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af7.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af7.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af7.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af7.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af7.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af7.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af7.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af7.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af7.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af7.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl8 afD8 = new AfectacionesDAOImpl8();
        ArrayList<Afectaciones8> af8 = afD8.getAllAfect(nombreP);
        for (int i = 0; i < af8.size(); i++) {
            int cont = 0;
            if (af8.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af8.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af8.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af8.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af8.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af8.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af8.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af8.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af8.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af8.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af8.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af8.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af8.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af8.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af8.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af8.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af8.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af8.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af8.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af8.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af8.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af8.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af8.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af8.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af8.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af8.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af8.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af8.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af8.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af8.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl9 afD9 = new AfectacionesDAOImpl9();
        ArrayList<Afectaciones9> af9 = afD9.getAllAfect(nombreP);
        for (int i = 0; i < af9.size(); i++) {
            int cont = 0;
            if (af9.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af9.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af9.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af9.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af9.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af9.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af9.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af9.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af9.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af9.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af9.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af9.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af9.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af9.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af9.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af9.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af9.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af9.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af9.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af9.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af9.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af9.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af9.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af9.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af9.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af9.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af9.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af9.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af9.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af9.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl10 afD10 = new AfectacionesDAOImpl10();
        ArrayList<Afectaciones10> af10 = afD10.getAllAfect(nombreP);
        for (int i = 0; i < af10.size(); i++) {
            int cont = 0;
            if (af10.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af10.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af10.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af10.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af10.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af10.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af10.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af10.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af10.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af10.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af10.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af10.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af10.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af10.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af10.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af10.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af10.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af10.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af10.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af10.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af10.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af10.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af10.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af10.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af10.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af10.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af10.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af10.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af10.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af10.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl11 afD11 = new AfectacionesDAOImpl11();
        ArrayList<Afectaciones11> af11 = afD11.getAllAfect(nombreP);
        for (int i = 0; i < af11.size(); i++) {
            int cont = 0;
            if (af11.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af11.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af11.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af11.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af11.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af11.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af11.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af11.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af11.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af11.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af11.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af11.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af11.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af11.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af11.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af11.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af11.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af11.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af11.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af11.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af11.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af11.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af11.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af11.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af11.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af11.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af11.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af11.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af11.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af11.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl12 afD12 = new AfectacionesDAOImpl12();
        ArrayList<Afectaciones12> af12 = afD12.getAllAfect(nombreP);
        for (int i = 0; i < af12.size(); i++) {
            int cont = 0;
            if (af12.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af12.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af12.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af12.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af12.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af12.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af12.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af12.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af12.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af12.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af12.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af12.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af12.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af12.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af12.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af12.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af12.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af12.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af12.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af12.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af12.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af12.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af12.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af12.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af12.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af12.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af12.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af12.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af12.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af12.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl13 afD13 = new AfectacionesDAOImpl13();
        ArrayList<Afectaciones13> af13 = afD13.getAllAfect(nombreP);
        for (int i = 0; i < af13.size(); i++) {
            int cont = 0;
            if (af13.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af13.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af13.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af13.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af13.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af13.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af13.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af13.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af13.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af13.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af13.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af13.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af13.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af13.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af13.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af13.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af13.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af13.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af13.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af13.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af13.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af13.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af13.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af13.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af13.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af13.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af13.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af13.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af13.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af13.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl14 afD14 = new AfectacionesDAOImpl14();
        ArrayList<Afectaciones14> af14 = afD14.getAllAfect(nombreP);
        for (int i = 0; i < af14.size(); i++) {
            int cont = 0;
            if (af14.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af14.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af14.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af14.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af14.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af14.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af14.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af14.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af14.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af14.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af14.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af14.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af14.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af14.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af14.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af14.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af14.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af14.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af14.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af14.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af14.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af14.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af14.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af14.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af14.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af14.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af14.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af14.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af14.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af14.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl15 afD15 = new AfectacionesDAOImpl15();
        ArrayList<Afectaciones15> af15 = afD15.getAllAfect(nombreP);
        for (int i = 0; i < af15.size(); i++) {
            int cont = 0;
            if (af15.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af15.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af15.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af15.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af15.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af15.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af15.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af15.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af15.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af15.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af15.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af15.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af15.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af15.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af15.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af15.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af15.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af15.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af15.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af15.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af15.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af15.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af15.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af15.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af15.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af15.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af15.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af15.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af15.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af15.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl16 afD16 = new AfectacionesDAOImpl16();
        ArrayList<Afectaciones16> af16 = afD16.getAllAfect(nombreP);
        for (int i = 0; i < af16.size(); i++) {
            int cont = 0;
            if (af16.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af16.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af16.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af16.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af16.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af16.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af16.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af16.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af16.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af16.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af16.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af16.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af16.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af16.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af16.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af16.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af16.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af16.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af16.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af16.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af16.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af16.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af16.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af16.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af16.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af16.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af16.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af16.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af16.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af16.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }
        AfectacionesDAOImpl17 afD17 = new AfectacionesDAOImpl17();
        ArrayList<Afectaciones17> af17 = afD17.getAllAfect(nombreP);
        for (int i = 0; i < af17.size(); i++) {
            int cont = 0;
            if (af17.get(i).getLunes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af17.get(i).getLunes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af17.get(i).getLunes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af17.get(i).getLunes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af17.get(i).getLunes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af17.get(i).getLunes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af17.get(i).getMartes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af17.get(i).getMartes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af17.get(i).getMartes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af17.get(i).getMartes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af17.get(i).getMartes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af17.get(i).getMartes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af17.get(i).getMiercoles1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af17.get(i).getMiercoles2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af17.get(i).getMiercoles3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af17.get(i).getMiercoles4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af17.get(i).getMiercoles5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af17.get(i).getMiercoles6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af17.get(i).getJueves1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af17.get(i).getJueves2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af17.get(i).getJueves3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af17.get(i).getJueves4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af17.get(i).getJueves5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af17.get(i).getJueves6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
            if (af17.get(i).getViernes1() == 2) {
                prof.setTurno(0, day[cont]);
            }
            if (af17.get(i).getViernes2() == 2) {
                prof.setTurno(1, day[cont]);
            }
            if (af17.get(i).getViernes3() == 2) {
                prof.setTurno(2, day[cont]);
            }
            if (af17.get(i).getViernes4() == 2) {
                prof.setTurno(3, day[cont]);
            }
            if (af17.get(i).getViernes5() == 2) {
                prof.setTurno(4, day[cont]);
            }
            if (af17.get(i).getViernes6() == 2) {
                prof.setTurno(5, day[cont]);
            }
            cont++;
        }

        return prof;
    }

    public int getContRB() {
        return contRB;
    }

    public void setContRB(int contRB) {
        this.contRB = contRB;
    }
    
}
