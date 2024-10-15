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
    public boolean posicion(int fila, int columna) {

        for (int j = 0; j < columna; j++) {
            //System.out.println(j);
            if (tablero[fila][j]==1) {
                System.out.println(tablero[fila][j]);
                return false; 
            }
        }
        for (int i=fila, j=columna; i>=0 && j>=0; i--, j--) {
            if (tablero[i][j]==1) {
                return false; 
            }
        }
        for (int i=fila, j=columna; j>=0 && i<NR; i++, j--) {
            if (tablero[i][j]==1) {
                return false; 
            }
        }
        return true; 


    }
     public boolean solucion(int columna) {
        if (columna >=NR) {
            return true;
        }
        
        for (int i = 0; i < NR; i++) {
            System.out.println("Fila: " + i + " Columna: " + columna);
            if (posicion(i, columna)) {
                System.out.println("");
                System.out.println("");
                System.out.println("Vuelve a entrar");
                tablero[i][columna]=1;
                //imprimir();
                if (solucion(columna+1)) {

                    return true;
                }

                tablero[i][columna]=0;
                System.out.println("");
                System.out.println("");
            }
        }

        return false;
    }
      public boolean inicializar() {

        if (solucion(0)==false) {
            System.out.println("No Hay solucion");
            return false;
        }

        return true;
    }
   }
 

