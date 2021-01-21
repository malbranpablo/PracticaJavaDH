package controller;

import java.util.Scanner;

public class Main {

/* Ejercicio 1*/
    public static void numerosPares(int numero){
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hola, bienvenido!!");
        System.out.println("Estimado por favor ingrese un numero para verificar si es par");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        numerosPares(n);
    }
}
