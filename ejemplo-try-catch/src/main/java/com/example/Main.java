package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

       public static void menu(){
        Scanner scan = new Scanner(System.in);
        int e, n1, n2;

        System.out.println("Eliga la opcion que quiere: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
        e = scan.nextInt();

        System.out.println("Ingrese un numeros a operar: ");
        n1 = scan.nextInt();

        System.out.println("Ingrese otro numero a operar: ");
        n2 = scan.nextInt();

        recibirOpcion(e, n1, n2);

        scan.close();
    }


    public static void recibirOpcion(int opcion, int a, int b){

     switch (opcion) {
        case 1:
        System.out.println(suma(a, b));
            break;
        case 2:
        System.out.println(resta(a, b));
            break;
        case 3:
        System.out.println(multiplicacion(a, b));
            break;
        case 4:
        System.out.println(division(a, b));
            break;
        default:
        System.out.println("Opcion no valida");
            break;
     }

    }



    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        int resultado = 0;

        //se intenta dividir por 0
        try {

            resultado = a / b;

        //si se intenta dividir por 0 y hay una excepcion se captura y se realiza "algo"
        } catch (Exception e) {

            System.out.println("No se puede dividir por 0");
        }

        return resultado;

    }










}