/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego;

/**
 *
 * @author Alumnos
 */
public interface barco {
   
    Integer coordenadasbarco(int x, int y);
    Boolean verificardisparo(int x, int y);
    Boolean verificarhundimiento(int x, int y);
    
  
    
}
