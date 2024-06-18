import java.util.Scanner;

public class Juego {
    private Personaje personaje1;
    private Personaje personaje2;
    private final Scanner scanner;

    public Juego(Scanner scanner) {
        this.scanner = scanner;
    }

    public void iniciar() {
        prepararPersonajes();
        mostrarMenu();
        combate(this.personaje1, this.personaje2);
    }

    private void mostrarMenu() {
        System.out.println("¡Bienvenido al juego de combate!");
        System.out.println("1. Iniciar combate");
        System.out.println("2. Salir");
        int opcion = scanner.nextInt();
        if (opcion == 2) {
            System.out.println("¡Gracias por jugar!");
            System.exit(0);
        }
    }

    private void combate(Personaje personaje1, Personaje personaje2) {
        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            turno(personaje1, personaje2);
            if (personaje2.estaVivo()) {
                turno(personaje2, personaje1);
            }
        }
        declararGanador(personaje1, personaje2);
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println();
        atacante.usarPocion();
        int danio = atacante.atacar(defensor);
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " y causa " + danio + " puntos de daño.");
        System.out.println(defensor.getNombre() + " tiene " + defensor.getHp() + " puntos de vida restantes.");
    }

    private void declararGanador(Personaje personaje1, Personaje personaje2) {
        if (personaje1.estaVivo()) {
            System.out.println(personaje1.getNombre() + " es el ganador!");
        } else {
            System.out.println(personaje2.getNombre() + " es el ganador!");
        }
    }

    private void prepararPersonajes() {
        System.out.println("Seleccione el tipo de personaje para el Jugador 1:");
        this.personaje1 = seleccionarPersonaje();
        System.out.println("Seleccione el tipo de personaje para el Jugador 2:");
        this.personaje2 = seleccionarPersonaje();

        prepararSantuarios(personaje1, personaje2);
        asignarPociones(personaje1, personaje2);
    }

    private Personaje seleccionarPersonaje() {
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del personaje:");
        String nombre = scanner.nextLine();

        switch (seleccion) {
            case 1:
                return new Guerrero(nombre, 100, 10, 20, 5);
            case 2:
                return new Mago(nombre, 80, 15, 15, 10);
            default:
                System.out.println("Selección inválida. Se seleccionará Guerrero por defecto.");
                return new Guerrero(nombre, 100, 10, 20, 5);
        }
    }

    private void prepararSantuarios(Personaje personaje1, Personaje personaje2) {
        Santuario santuario = new Santuario("Santuario de Defensa", 10);
        personaje1.visitarSantuario(santuario);
        personaje2.visitarSantuario(santuario);
    }

    private void asignarPociones(Personaje personaje1, Personaje personaje2) {
        Pocion pocion = new Pocion("Poción de Salud", 20);
        personaje1.setPocion(pocion);
        personaje2.setPocion(pocion);
    }
}
