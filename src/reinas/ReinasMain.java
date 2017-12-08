/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ReinasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneticoReinas gr = new GeneticoReinas(100, 10000, 0.2, 100);
        gr.evolucionar();
        
    }
    
}
