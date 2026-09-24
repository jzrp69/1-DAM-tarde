/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_entradas;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Ejercicio4_Entradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Esta es la declaracion de primitivos y variables a utilizar
        double adultos;
        double niños;
        double total;
        double precioTotal;
        
        Scanner sc = new Scanner(System.in);
 
        //Preguntas e inputs
       
        System.out.println("Cuantos adultos son: ");
        adultos = sc.nextDouble()*20;
        
        System.out.println("Cuantos niños son: ");
        niños = sc.nextDouble()*15.50;
        
        total = adultos+niños;
       
        // Este es la operación para el descuento
        precioTotal = total >= 100 ? total - (total* 0.05): total;
        
        System.out.println("El total es: "+precioTotal);
        
        
    }
    
}
