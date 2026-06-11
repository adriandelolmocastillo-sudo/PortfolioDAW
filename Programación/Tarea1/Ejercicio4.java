package Tarea1;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el precio del artículo: ");
        double precio = scan.nextDouble();
        double impuesto;

        if (precio >= 300) {
            impuesto = precio * 0.05;
        } else {
            impuesto = 0;
        }

        double total = precio + impuesto;
        System.out.println("Impuesto aplicado: " + impuesto + "€");
        System.out.println("Coste total: " + total + "€");
    }
}
