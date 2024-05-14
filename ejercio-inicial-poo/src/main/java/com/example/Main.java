package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Veterinaria veterinaria = inicializarVeterinaria();
        while (true) {
            mostrarMenu(veterinaria);
            int opcion = tryCatchInt();
            switch (opcion) {
                case 1:
                    mostrarMenuRegistrarPaciente();
                    registrarPaciente(veterinaria);
                    break;
                case 2:
                    mostrarMenuDarDeAlta();
                    darDeAlta(veterinaria);
                    break;
                case 3:
                    veterinaria.tiempoDeRelajo();
                    break;
                case 4:
                    veterinaria.mostrarPacientes();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static Veterinaria inicializarVeterinaria() {
        return new Veterinaria("Veterinaria Patitas", "Calle 123", "123456789");
    }

    public static void mostrarMenu(Veterinaria veterinaria) {

            System.out.println("\nBienvenido a la veterinaria "+veterinaria.getNombre());
            System.out.println("1. Registrar paciente");
            System.out.println("2. Dar de alta paciente");
            System.out.println("3. Tiempo de relajo");
            System.out.println("4. Listar pacientes");
            System.out.println("5. Salir");

    }

    public static void mostrarMenuRegistrarPaciente() {
        System.out.println("--- Menú Registrar paciente ---");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
    }

    public static void registrarPaciente(Veterinaria veterinaria) {
        int opcion;

        while (true) {
            opcion = tryCatchInt();
            if (opcion == 1) {
                veterinaria.registrarPacientePerruno(registrarPacientePerruno());
                break;
            } else if (opcion == 2) {
                veterinaria.registrarPacienteGatuno(registrarPacienteGatuno());
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static Perro registrarPacientePerruno() {
        String nombre, raza,genero;
        int edad;
        boolean leGustaPasear;
        System.out.println("Registrar paciente perruno");
        nombre = pedirNombre();
        raza = pedirRaza();
        edad = pedirEdad();
        genero = pedirGenero();
        leGustaPasear = pedirLeGustaPasear();

        return new Perro(nombre, raza, edad, genero, leGustaPasear);
    }

    public static Gato registrarPacienteGatuno() {
        String nombre, raza, genero;
        int edad;
        boolean miedoAlAgua;

        System.out.println("Registrar paciente gatuno");

        nombre = pedirNombre();
        raza = pedirRaza();
        edad = pedirEdad();
        genero = pedirGenero();
        miedoAlAgua = pedirMiedoAlAgua();

        return new Gato(nombre, raza, edad,genero, miedoAlAgua);
    }

    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        return scanner.nextLine();
    }

    public static String pedirRaza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Raza: ");
        return scanner.nextLine();
    }

    public static int pedirEdad() {
        System.out.println("Edad: ");
        return tryCatchInt();
    }

    public static String pedirGenero() {
        int opcionGenero;
        System.out.println("Genero: \n1. Macho\n2. Hembra");
        while (true) {
            opcionGenero = tryCatchInt();
            if (opcionGenero == 1) {
                return "Macho";
            } else if (opcionGenero == 2) {
                return "Hembra";
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static boolean pedirLeGustaPasear() {
        int opcion;
        System.out.println("Le gusta pasear: \n1. Si\n2. No");
        while (true) {
            opcion = tryCatchInt();
            if (opcion == 1) {
                return true;
            } else if (opcion == 2) {
                return false;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static boolean pedirMiedoAlAgua() {
        int opcion;
        System.out.println("Miedo al agua: \n1. Si\n2. No");
        while (true) {
            opcion = tryCatchInt();
            if (opcion == 1) {
                return true;
            } else if (opcion == 2) {
                return false;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static void mostrarMenuDarDeAlta() {

        System.out.println("--- Menú Dar de alta paciente ---");
        System.out.println("1. Perro");
        System.out.println("2. Gato");

    }

    public static void darDeAlta(Veterinaria veterinaria) {
        int opcion;

        while (true) {
            opcion = tryCatchInt();
            if (opcion == 1) {
                veterinaria.darDeAltaPacientePerruno();
                break;
            } else if (opcion == 2) {
                veterinaria.darDeAltaPacienteGatuno();
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }

    public static int tryCatchInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un número válido");
                scanner.next();
            }
        }
    }

}