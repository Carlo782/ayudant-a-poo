package com.example;

public class SinExpRegular {
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
        if (correo == null || correo.length() == 0) {
            return false;
        }

        String[] partes = correo.split("@");

        if (partes.length != 2) {
            return false;
        }

        if (partes[0].length() == 0 || partes[1].length() == 0) {
            return false;
        }

        char primerCaracter = partes[0].charAt(0);
        char ultimoCaracter = partes[1].charAt(partes[1].length() - 1);
        if (!esCaracterValido(primerCaracter) || !esCaracterValido(ultimoCaracter)) {
            return false;
        }

        if (!partes[1].contains(".")) {
            return false;
        }

        return true;
    }

    public static boolean esCaracterValido(char caracter) {
        return Character.isLetterOrDigit(caracter) || caracter == '.' || caracter == '-';
    }
}
