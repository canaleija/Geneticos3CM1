/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int cromosoma[];
    private int fitness;
    private int decodificacion;

    public Individuo() {
        this.fitness = 0;
        this.cromosoma = new int[16];
        this.decodificacion = 0;
    }

    public Individuo(int[] cromosoma) {
        this.cromosoma = cromosoma;
        calcularDeco();
        calcularFitness();
           
    }

    public void calcularDeco() {
    
       for(int x=0;x<=15;x++){
          if(this.getCromosoma()[x]==1){
              this.decodificacion+=(Math.pow(2, 15-x));
          }
         
      }
    }

    public void calcularFitness() {
        // 262138
        this.fitness = (4*this.decodificacion)-2;
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

    /**
     * @return the decodificacion
     */
    public int getDecodificacion() {
        return decodificacion;
    }

    @Override
    public String toString() {
        return "Individuo{ fitness=" + fitness + ", decodificacion=" + decodificacion + '}';
    }
    
    
    
    
    
}
