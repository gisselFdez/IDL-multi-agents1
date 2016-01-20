package main;

import engine.SMA;
import util.Data;

public class SmaMain {

  public static void main(String[] args) {
    /*
     * Parametres :
     * - taille de la grille
     * - nombre de billes
     * - taille de la bille
     * - vitesse
     * 
     * Param�tres optionnels :
     * - visibilit� de la grille
     * - �quit� -> shuffle
     * - grille torique
     * - seed pour le Random (voir https://docs.oracle.com/javase/7/docs/api/java/util/Random.html#setSeed(long))
     */

    Data.size = 50;
    Data.nombreAgents = 15;
    Data.tours = 25;
    Data.vitesse = 100;

//    Panel panel = new Panel(50);
//    Data.v = new Vue(panel);
//    Data.v.addObserver(panel);

    try {
      SMA sma = new SMA();
      sma.init();
      sma.run();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
  }

}