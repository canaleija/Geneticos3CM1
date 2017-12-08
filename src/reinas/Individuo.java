/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas;

import binario.*;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int cromosoma[];
    private int fitness;
    private int n;
   
    public Individuo(int n) {
        this.fitness = 0;
        this.n = n;
        this.cromosoma = new int[n];
       
    }

    public Individuo(Individuo ind) {
        this.cromosoma = ind.getCromosoma().clone();
        this.fitness = ind.getFitness();
        this.n = this.cromosoma.length;
    }
   public Individuo(int cromosoma[]) {
        this.cromosoma = cromosoma;
        this.n = cromosoma.length;
        calcularFitness();
    }
  

    public void calcularFitness() {
        // calcular el numero de ataques
         fitness = 0;
         
        for(int i=0;i<n;i++)
              for(int j=0;j<n;j++){
        if(i!=j){
         // contamos 
         // evaluamos si estan en el mismo renglon
         if((cromosoma[i]==cromosoma[j])){
              fitness++;
         }else{
            if((Math.abs(cromosoma[i]-cromosoma[j])==Math.abs(i-j)))
                fitness++;
         }
          
         
         
        
        }      
              
        }
         
    }

    /**
     * @return the cromosoma
     */
    public int[] getCromosoma() {
        return cromosoma;
    }

    /**
     * @return the fitness
     */
    public int getFitness() {
        return fitness;
    }

   
    @Override
    public String toString() {
        return "Individuo{ fitness=" + fitness +"";
    }
    
    
    
    
    
}
