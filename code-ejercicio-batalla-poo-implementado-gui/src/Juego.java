public class Juego {
    private Personaje personaje1;
    private Personaje personaje2;

    public Juego(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public void iniciar() {
        mostrarMenu();
        combate(personaje1, personaje2);
    }

    private void mostrarMenu() {
        // Aquí podrías agregar lógica para mostrar un menú en la consola o en la GUI si es necesario
        System.out.println("¡Bienvenido al juego de combate!");
    }

    public void combate(Personaje personaje1, Personaje personaje2) {
        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            turno(personaje1, personaje2);
            if (personaje2.estaVivo()) {
                turno(personaje2, personaje1);
            }
        }
        declararGanador(personaje1, personaje2);
    }

    private void turno(Personaje atacante, Personaje defensor) {
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
}
