/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kilometro;
        int mes;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuanto kilometro tiene tu vehiculo? ");
         kilometro = captu.nextInt();
         
         System.out.println("Cuanto meses tiene el vehiculo? ");
         mes = captu.nextInt();
         
         if (kilometro >= 5000 || mes >= 6){
             System.out.println("Cambia el aceite");
    }else{
          System.out.println("Vehiculo en buenas condiciones");   
         } 
    }
    
}
   