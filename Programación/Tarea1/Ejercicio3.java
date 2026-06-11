package Tarea1;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Introduce un número:");
        int num = scan.nextInt();
        if (num >= 0) {
            System.out.print("El número " + num + " es positivo");
            System.out.println("Todos los números positivos son mayores de cero");
        }else{
            System.out.println("El número " + num + " es negativo");
        }
    }
}
