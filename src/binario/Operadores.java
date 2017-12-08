/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.util.ArrayList;
import java.util.Random;
import reinas.Individuo;


/**
 *
 * @author Roberto Cruz Leija
 */
public class Operadores {
    
     public static Individuo seleccionTorneo(ArrayList<Individuo> pob){
           Individuo mejor = pob.get(0);
           // recorre la poblacion
           for(Individuo i: pob){
              if(i.getFitness()<mejor.getFitness()){
                mejor = i;
              }
           }
            return new Individuo(mejor.getCromosoma().clone());
        }

     public static Individuo seleccionAleatoria(ArrayList<Individuo> pob){
          Random ran = new Random();
          
          return new Individuo(pob.get(ran.nextInt(pob.size())).getCromosoma().clone());
          
        
        }
     
     public static Individuo cruzaMascara(int mask[], Individuo madre, Individuo padre,int n ){
          int c1 []= new int[n];
          int c2 []= new int[n];
         // recorremos la maskara
         for (int m=0; m<mask.length;m++){
          if (mask[m]==1){
             c1[m] = madre.getCromosoma()[m];
             c2[m] = padre.getCromosoma()[m];
          }else{
             c1[m] = padre.getCromosoma()[m];
             c2[m] = madre.getCromosoma()[m];
          } 
         }
         Individuo hijo1 = new Individuo(c1);
         Individuo hijo2 = new Individuo(c2);
         
         if (hijo1.getFitness()<hijo2.getFitness()) return hijo1;
         
         return hijo2;
     }
   
     public static void mutaGen(Individuo ind, int n){
//     Random ran = new Random();
//     int pos = ran.nextInt(n);
//     
//     if (ind.getCromosoma()[pos]==0){
//         ind.getCromosoma()[pos]=1;}else{
//        ind.getCromosoma()[pos]=0;
//     }
//     
//    
//     ind.calcularFitness();

Random ran = new Random();
     int pos = ran.nextInt(n);
     // modificar bien la muta 
     ind.getCromosoma()[pos] = ran.nextInt(n);
     
    
     ind.calcularFitness();
     }
     
     
     public  static int[] mascaraAleatoria(int n){
        int aux[] = new int[n];
        Random ran = new Random();
        for (int x=0; x< aux.length;x++){
           aux[x]= ran.nextInt(2);
        }
        
        return aux;
     }
}
