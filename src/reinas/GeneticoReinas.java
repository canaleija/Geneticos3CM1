/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas;

import binario.Operadores;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoReinas {
    
    private int numInd;
    private int numGeneraciones;
    private double pMuta;
    private int n;
    private ArrayList<Individuo> poblacionActual;

    public GeneticoReinas(int numInd, int numGeneraciones, double pMuta, int n) {
        this.n = n;
        this.numInd = numInd;
        this.numGeneraciones = numGeneraciones;
        this.pMuta = pMuta;
        this.poblacionActual = null;
        generarPoblacionInicial();
    }

    public void evolucionar(){
    
        // generar diferentes generaciones 
        for(int g=0; g<this.numGeneraciones;g++){
          // generamos la nueva población 
          ArrayList<Individuo> nvaPoblacion = new ArrayList<>();
          int maskara[] = Operadores.mascaraAleatoria(n);
// generamos un proceso iterativo para crear la nueva población
          for(int i=0; i < this.numInd;i++){
            // seleccion 
            Individuo madre = Operadores.seleccionTorneo(this.poblacionActual);
            Individuo padre = Operadores.seleccionTorneo(this.poblacionActual);
            //cruza
            Individuo hijo = Operadores.cruzaMascara(maskara, madre, padre,n);
            
            if (Math.random()<=this.pMuta){
              // muta
             Operadores.mutaGen(hijo,n);
            
            }
                     
              nvaPoblacion.add(hijo);
          }
          // actualizar la población actual 
          actualizarPoblacion(nvaPoblacion);
          //if (this.poblacionActual.get(0).getFitness()==0)
          Individuo mejor = obtenerElMejor();
//          if (mejor.getFitness()==0)
//              System.out.println();
          System.out.println("epoca: "+g+" "+mejor.toString());
        }
    
    }
    
    
    
    private void generarPoblacionInicial() {
      // se crea la población inicial de forma
      // aleatoria 
      Random ran = new Random();
      this.poblacionActual = new ArrayList<>();
      for(int x=1; x <= this.numInd;x++){
          int aux[] = new int[n];
          /// generar la parte aleatoria
          for(int i=0;i<n;i++)
              aux[i]= ran.nextInt(n);
          
          this.poblacionActual.add(new Individuo(aux.clone()));
    
      }
    }

    private void actualizarPoblacion(ArrayList<Individuo> nvaPoblacion) {
        // recorremos los elementos de la pob
        this.poblacionActual = new ArrayList<>();
        for(Individuo ind : nvaPoblacion){
        
          this.poblacionActual.add(new Individuo(ind.getCromosoma()));
        }
    }

    private Individuo obtenerElMejor() {
        Individuo mejor = this.poblacionActual.get(0);
        for(Individuo aux: this.poblacionActual){
          if (aux.getFitness()<mejor.getFitness()){
          mejor = aux;
          }
        
        }
        return mejor;
    }
    
    
    
    
    
    
}
