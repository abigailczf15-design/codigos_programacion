/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple1;

import java.util.Scanner;

/**
 *Llegeix una distància en milles marines i la converteix a metres.
 * @author ace6601
 */
public class Exemple1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double MILLES_A_METRES = 1852;  //factor conversió constant
        //definir constant MILLES_A_METRES = 1852
        //int num=0; variable
        Scanner lector = new Scanner(System.in);
        
           
        //llegir distància en milles
        System.out.println("quantes milles son?"); //mostrar
        double distanciaEnMilles = lector.nextDouble(); //esperar DistanciaEnMilles
        
        double distanciaEnMetres =distanciaEnMilles*MILLES_A_METRES; //CALCULAR distanciaEnMetres = distanciaenmilles*1952
    
        System.out.println("aixo son" + distanciaEnMetres + "metres");
        
    }
    
}
