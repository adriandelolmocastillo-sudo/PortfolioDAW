package Tarea1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main (String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Eres el propietario de la máquina? (Introduce True or False)");
        boolean isOwner = scan.nextBoolean();

        if(isOwner) {
            System.out.println("Hola, bienvenido al sistema");
        }
    }
}
