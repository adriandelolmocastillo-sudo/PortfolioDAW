package Tarea1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.println("Introduce A:");
        A = sc.nextInt();

        System.out.println("Introduce B:");
        B = sc.nextInt();

        System.out.println("Introduce C:");
        C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println("A es el mayor");
        } else {
            if (B > A && B > C) {
                System.out.println("B es el mayor");
            } else {
                System.out.println("C es el mayor");
            }
        }
    }
}
