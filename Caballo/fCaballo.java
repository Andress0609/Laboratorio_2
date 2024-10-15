/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caballo;

import Tableros.Tablero;

/**
 *
 * @author user
 */
public class fCaballo {
    public Tablero tablero;
    public int UltimoMovimiento[][];
    public int Posicion;
    
     public fCaballo(Tablero tablero) {
        this.tablero = tablero;
        UltimoMovimiento = new int[1][2];
        Posicion = 0;

}
      public int[][] getUltimoMovimiento() {
        return UltimoMovimiento;
    }

    public void setUltimoMovimiento(int[][] UltimoMovimiento) {
        this.UltimoMovimiento = UltimoMovimiento;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

}
