import java.util.Scanner;

public class Juego {
    private Scanner scanner = new Scanner(System.in);

    public void iniciar(Personaje personaje1, Personaje personaje2, Pocion pocion, Santuario santuario) {
        prepararPociones(personaje1, personaje2, pocion);
        prepararSantuario(personaje1, personaje2, santuario);
        mostrarMenu();
        combate(personaje1, personaje2);
    }

    private void prepararPociones(Personaje personaje1, Personaje personaje2, Pocion pocion) {
        personaje1.setPocion(pocion);
        personaje2.setPocion(pocion);
    }

    private void prepararSantuario(Personaje personaje1, Personaje personaje2, Santuario santuario) {
        personaje1.visitarSantuario(santuario);
        personaje2.visitarSantuario(santuario);
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

}
