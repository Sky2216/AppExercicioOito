/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexerciciooito;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioOito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      double Raio,calculo;
    
      Scanner teclado = new Scanner (System.in);
      
      System.out.println("Digite o valor do raio: ");
        
      Raio = teclado.nextDouble();
        
      calculo = 2 * Math.PI * Raio;
    
      System.out.println("A area do circulo e: "+ calculo);
    
    
    
    
    
    
    
    
    }
    
}
