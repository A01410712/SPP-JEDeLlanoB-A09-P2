/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp_jedellanob.a09.p2;
import java.util.Scanner; 
/**
 *
 * @author Alumno
 */
public class SPP_JEDeLlanoBA09P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 int matriza[][] = new int [3][3];
         int matrizb[][] = new int [3][3];
         int matrizc[][] = new int [3][3];
         int i, j;
         
         Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz A :");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matriza [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Datos de la Matriz B :");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matrizb [i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma :");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print(matrizc[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}

   
    

