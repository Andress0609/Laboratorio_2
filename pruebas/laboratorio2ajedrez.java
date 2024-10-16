/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;
import Caballo.Caballo;
import Tableros.Tablero;
import java.util.Arrays;

/**
 *
 * @author fabia
 */
public class laboratorio2ajedrez {
    public static void main(String[] args) {
        // TODO code application logic here

        Tablero t = new Tablero();

        Caballo c = new Caballo(t);

        c.DarPosicionesIniciales(0, 0);

//        c.DarPosicionInicial(4, 4);
//        c.EmpezarMovimiento(7, 0, 1);
//        
        System.out.println("    | [0 ][1 ][2 ][3 ][4 ][5 ][6 ][7 ]\n---------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print("[" + i + "] | ");
            for (int j = 0; j < 8; j++) {
                if (t.tabla[i][j] < 10) {
                    System.out.print("[" + t.tabla[i][j] + " ]");
                } else {
                    System.out.print("[" + t.tabla[i][j] + "]");
                }
            }
            System.out.println(" ");
        }
//        
//        if (!t.BuscarRemover(0)) {
//            System.out.println("Se logro completar");
//        } else {
//            System.out.println("No se completo");
//        }
//        
    }
}
