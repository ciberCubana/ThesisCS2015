/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Agente implements Serializable{

    private double Q[][];
    private int cantS, cantA;
    private static final double alpha = 0.1;
    private static final double gamma = 0.9;

    public Agente(int cantS, int cantA) {  //cantS->turnos de clase en la semana cantA->turnos que se pueden dar en un turno en especifico
        this.cantS = cantS;
        this.cantA = cantA;
        Q = new double[cantS][cantA];
        fill(Q, 0);
    }
    
    private void fill(double[][] R, double val){
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                R[i][j]= val;
            }
        }
    }

    public int nextAction(int stateA, ArrayList<Integer>list) {
        int a = 0;
        Random r = new Random();
        double rnd = Math.random();

        if (rnd < 0.2) {
            a = r.nextInt(list.size());
            a = list.get(a);
        } else {
            a = list.get(r.nextInt(list.size()));
            double maxV = Q[stateA][a];
            for (int j = 0; j < list.size(); j++) {
                int i = list.get(j);
                if (maxV < Q[stateA][i] ) {
                    maxV = Q[stateA][i];
                    a = i;
                }
            }
        }
        return a;
    }

    public double searchMaxReward(int s) {
        double ret = 0;
        if(s == Q.length)
            s--;
        for (int i = 0; i < cantA; i++) {
            ret = Math.max(Q[s][i], ret);
        }
        return ret;
    }

    public  void update(int actualS, int nextS, double r, int a) {
        double maxS = searchMaxReward(nextS);
        Q[actualS][a] += alpha * (r + gamma * maxS - Q[actualS][a]);
    }
    
    public  void printQValues() {
        for (int i = 1; i < cantS + 1; i++) {
            for (int j = 1; j < cantA + 1; j++) {
                System.out.printf("%.1f ", Q[i][j]);
            }
            System.out.println();
        }
    }

}
