/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_bloque_1;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Ejercicio3_Bloque_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int hormigas; 
        int arañas;
        int cochinillas;
        int total;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas hormigas ha capturado hoy? :");
            hormigas = sc.nextInt() *6;
        
        System.out.println("Cuantas arañas ha capturado hoy? :");
            arañas = sc.nextInt() *8;
        
        System.out.println("Cuantas cochinillas ha capturado hoy? :");
            cochinillas = sc.nextInt()*14;
      
        
        total = hormigas+arañas+cochinillas;
        
        System.out.println("En total hoy has capturado: " + total);
                
        
                
                
    }
    
}
