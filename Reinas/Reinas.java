/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reinas;

/**
 *
 * @author thyfa
 */
   public class Reinas {
    private final int NR=8;
    private int[][] tablero= new int[NR][NR];;
    String letras[]= {"A","B","C","D","E","F","G","H"};
    
    public void imprimir() {
    System.out.print("   ");
    for (int i = 0; i < NR; i++) {
        System.out.print(" " + letras[i] + "     ");
    }
    System.out.print("\n");
    for (int i = 0; i < NR; i++) {
        System.out.print((i + 1));
        for (int j = 0; j < NR; j++) {
            System.out.print("   " + tablero[i][j] + "   ");
        }
        System.out.print("\n\n");
    }
    }
   }
 

