package com.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ExpRegular {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String correo = "correo@correo.com";

        if (validarCorreo(correo)) {
            System.out.println("Valido.");
        } else {
            System.out.println("Invalido.");
        }
    };

    public static boolean validarCorreo(String correo) {
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        // ^ inicio de la cadena
        // [a-zA-Z0-9._%+-] cualquier caracter alfanumerico, punto, guion bajo, porcentaje, mas o menos
        // + una o mas veces
        // @ arroba
        // [a-zA-Z0-9-] cualquier caracter alfanumerico y guion
        // + una o mas veces
        // . punto literal
        // [a-zA-Z]{2,} cualquier caracter alfanumerico al menos 2 veces
        // $ fin de la cadena

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }



}