/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;
import binario.Individuo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoBinario {
//    
//    private int numInd;
//    private int numGeneraciones;
//    private double pMuta;
//    private ArrayList<Individuo> poblacionActual;
//
//    public GeneticoBinario(int numInd, int numGeneraciones, double pMuta) {
//        this.numInd = numInd;
//        this.numGeneraciones = numGeneraciones;
//        this.pMuta = pMuta;
//        this.poblacionActual = null;
////        generarPoblacionInicial();
//    }
//
////    public void evolucionar(){
////    
////        // generar diferentes generaciones 
////        for(int g=0; g<this.numGeneraciones;g++){
////          // generamos la nueva población 
////          ArrayList<Individuo> nvaPoblacion = new ArrayList<>();
////          int maskara[] = Operadores.mascaraAleatoria(16);
////// generamos un proceso iterativo para crear la nueva población
////          for(int i=0; i < this.numInd;i++){
////            // seleccion 
////            Individuo madre = Operadores.seleccionTorneo(this.poblacionActual);
////            Individuo padre = Operadores.seleccionAleatoria(this.poblacionActual);
////            //cruza
////            Individuo hijo = Operadores.cruzaMascara(maskara, madre, padre);
////            
////            if (Math.random()<=this.pMuta){
////              // muta
////             Operadores.mutaGen(hijo);
////            
////            }
////                     
////              nvaPoblacion.add(hijo);
////          }
////          // actualizar la población actual 
////          actualizarPoblacion(nvaPoblacion);
////          System.out.println(this.poblacionActual.get(0).toString());
////        }
////    
// //   }
//    
//    
//    
////    private void generarPoblacionInicial() {
////      // se crea la población inicial de forma
////      // aleatoria 
////      Random ran = new Random();
////      this.poblacionActual = new ArrayList<>();
////      for(int x=1; x <= this.numInd;x++){
////          int aux[] = new int[16];
////          /// generar la parte aleatoria
////          for(int i=0;i<16;i++)
////              aux[i]= ran.nextInt(2);
////          
////          this.poblacionActual.add(new Individuo(aux.clone()));
////      
////      }
////    }
////
////    private void actualizarPoblacion(ArrayList<Individuo> nvaPoblacion) {
////        // recorremos los elementos de la pob
////        this.poblacionActual = new ArrayList<>();
////        for(Individuo ind : nvaPoblacion){
////        
////          this.poblacionActual.add(new Individuo(ind.getCromosoma()));
////        }
////    }
////    
////    
////    
//    
//    
    
}
