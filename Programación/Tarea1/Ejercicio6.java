package Tarea1;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String piece;

        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez:");
        piece = sc.nextLine();

        if (piece.equalsIgnoreCase("R")) { // Rey
            System.out.println("Puede moverse en todas direcciones pero solo una posición.");
        } else if (piece.equalsIgnoreCase("D")) { // Dama o Reina
            System.out.println("Puede moverse en todas direcciones y cualquier número de casillas.");
        } else if (piece.equalsIgnoreCase("T")) { // Torre
            System.out.println("Puede moverse en línea recta horizontal o vertical.");
        } else if (piece.equalsIgnoreCase("A")) { // Alfil
            System.out.println("Puede moverse en diagonal cualquier número de casillas.");
        } else if (piece.equalsIgnoreCase("C")) { // Caballo
            System.out.println("Se mueve en forma de L y puede saltar piezas.");
        } else if (piece.equalsIgnoreCase("P")) { // Peón
            System.out.println("Avanza hacia adelante una casilla. Puede avanzar dos en su primer movimiento.");
        } else {
            System.out.println("Inicial no válida.");
        }
    }
}
