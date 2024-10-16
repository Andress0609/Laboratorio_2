/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tableros;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Tablero {
    public int[][] tabla;
    public int fila;
    public int columna;

    public Tablero() {
        this.tabla = new int[8][8];
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
    public int[][] getTabla() {
        return tabla;
    }

    public void setTabla(int[][] tabla) {
        this.tabla = tabla;
    }
    
    public void EmpezarMovimiento(){
        
    }
    
    
    
    public boolean Buscar(int num){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabla[i][j]==num) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void IngresarMovimiento(int f, int c, int m){
        if (!Buscar(m)) {
          this.tabla[f][c] = m;  
        } else {
            System.out.println("Son iguales");
        }
         
    
       
    }

    @Override
    public String toString() {
        return "Tablero{" + "tabla=" + "\n0 "+Arrays.toString(tabla[0])+ "\n1 "
                + Arrays.toString(tabla[1])+ "\n2 "
                + Arrays.toString(tabla[2])+ "\n3 "
                + Arrays.toString(tabla[3])+ "\n4 "
                + Arrays.toString(tabla[4])+ "\n5 "
                + Arrays.toString(tabla[5])+ "\n6 "
                + Arrays.toString(tabla[6])+ "\n7 "
                + Arrays.toString(tabla[7])+ "\n"+ '}';
    }
}
