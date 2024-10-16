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
public class Caballo {
    public Tablero tablero;
    public int ultimoMovimiento[][];
    public int posicion;
    
     public Caballo(Tablero tablero) {
        this.tablero = tablero;
        ultimoMovimiento = new int[1][2];
        posicion = 0;

}
      public int[][] getUltimoMovimiento() {
        return ultimoMovimiento;
    }

    public void setUltimoMovimiento(int[][] UltimoMovimiento) {
        this.ultimoMovimiento = UltimoMovimiento;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    public void IniciarMovimiento(int fila, int columna) {

        for (int i = 0; i < 8; i++) {
            AsignarJugada(i);

            fila = fila + ultimoMovimiento[0][0];
            columna = columna + ultimoMovimiento[0][1];

            if (IndicarMovimiento(fila, columna)) {
                RealizarMovimiento(fila, columna);

                IniciarMovimiento(fila, columna);
                continue;
            }
            this.RegresarFilasColumnas(fila, columna, i);
            fila = ultimoMovimiento[0][0];
            columna = ultimoMovimiento[0][1];

            ultimoMovimiento[0][0] = 0;
            ultimoMovimiento[0][1] = 0;
        }


    }

    public void DarPosicionesIniciales(int fila, int columna) {
        RealizarMovimiento(fila, columna);

        this.IniciarMovimiento(fila, columna);
    }

    public void AsignarJugada(int Indicador) {
        switch (Indicador) {
            case 0: {
                ultimoMovimiento[0][0] = -2;
                ultimoMovimiento[0][1] = 1;
                break;
            }

            case 1: {

                ultimoMovimiento[0][0] = -2;
                ultimoMovimiento[0][1] = -1;
                break;

            }

            case 2: {

                ultimoMovimiento[0][0] = -1;
                ultimoMovimiento[0][1] = -2;
                break;

            }

            case 3: {

                ultimoMovimiento[0][0] = 1;
                ultimoMovimiento[0][1] = -2;
                break;

            }

            case 4: {

                ultimoMovimiento[0][0] = 2;
                ultimoMovimiento[0][1] = -1;
                break;

            }

            case 5: {

                ultimoMovimiento[0][0] = 2;
                ultimoMovimiento[0][1] = 1;
                break;

            }

            case 6: {

                ultimoMovimiento[0][0] = -1;
                ultimoMovimiento[0][1] = 2;
                break;

            }

            case 7: {

                ultimoMovimiento[0][0] = 1;
                ultimoMovimiento[0][1] = 2;
                break;

            }

        }
    }

    public void RealizarMovimiento(int fila, int columna) {
        posicion++;
        this.getTablero().tabla[fila][columna] = posicion;
    }

    public void RegresarFilasColumnas(int fila, int columna, int x) {

        ultimoMovimiento[0][0] = ultimoMovimiento[0][0] * -1;
        ultimoMovimiento[0][1] = ultimoMovimiento[0][1] * -1;
        ultimoMovimiento[0][0] = (fila + ultimoMovimiento[0][0]);
        ultimoMovimiento[0][1] = (columna + ultimoMovimiento[0][1]);

    }


    public boolean IndicarMovimiento(int fila, int columna) {
        try {
            if (tablero.getTabla()[fila][columna] == 0) {
                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }


}
