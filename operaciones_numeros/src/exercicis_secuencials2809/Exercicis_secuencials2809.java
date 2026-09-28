/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis_secuencials2809;
import java.util.Scanner;

/**
 *
 * @author ace6601
 */
public class Exercicis_secuencials2809 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double valor1, valor2, suma, resta, divisio, producto;
    Scanner lector = new Scanner(System.in);
    System.out.println("dime el valor1");
    valor1 = lector.nextDouble();
    System.out.println("dime el valor2");
    valor2 = lector.nextDouble();
    
    suma = valor1 + valor2;
    
    resta = valor1 - valor2;
  
    divisio = valor1 / valor2;
    
    producto = valor1 * valor2;
    
    System.out.println("suma és" + suma + "resta és" + resta + " divisio es" + divisio + "producto es" + producto);
    
    }
    
}
