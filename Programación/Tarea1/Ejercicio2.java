package Tarea1;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        int edad = 0;
        System.out.println("Introduce tu edad");
        edad = scan.nextInt();

        if (edad < 13) {
            System.out.println("Se le aplicará la tarifa de niño.");
        }else{
            System.out.println("Se le aplicara la tarifa de adulto.");
        }
        System.out.println("Disfruta de la película");
    }
}
