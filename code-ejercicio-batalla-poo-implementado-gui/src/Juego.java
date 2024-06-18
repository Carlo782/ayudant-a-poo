/**
 * Esta clase representa un juego de combate entre dos personajes.
 * Los personajes se alternan los turnos para atacar hasta que uno de ellos pierde toda su vida.
 */
public class Juego {
    private Personaje personaje1;
    private Personaje personaje2;
    private int turnoActual;

    /**
     * Constructor de la clase Juego.
     * Inicializa los personajes participantes y el turno actual.
     *
     * @param personaje1 Primer personaje que participa en el juego.
     * @param personaje2 Segundo personaje que participa en el juego.
     */
    public Juego(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.turnoActual = 1;
    }

    /**
     * Realiza un turno de combate entre los dos personajes.
     * El turno actual determina quién ataca a quién.
     *
     * @return Una cadena que describe el resultado del turno.
     *         Por ejemplo: "Personaje1 ataca a Personaje2 y causa 10 puntos de daño.\n"
     */
    public String turno() {
        Personaje atacante;
        Personaje defensor;

        if (turnoActual % 2 != 0) {
            atacante = personaje1;
            defensor = personaje2;
        } else {
            atacante = personaje2;
            defensor = personaje1;
        }

        int danio = atacante.atacar(defensor);

        return atacante.getNombre() + " ataca a " + defensor.getNombre() + " y causa " + danio + " puntos de daño.\n";
    }

    /**
     * Verifica si el juego ha terminado.
     * El juego termina cuando uno de los dos personajes no está vivo.
     *
     * @return true si el juego ha terminado (uno de los personajes ha perdido toda su vida), false en caso contrario.
     */
    public boolean verificarFinDeJuego() {
        return !personaje1.estaVivo() || !personaje2.estaVivo();
    }

    /**
     * Obtiene al personaje ganador del juego.
     *
     * @return El personaje ganador (el que aún está vivo).
     *         Si ambos personajes están vivos, devuelve el primer personaje.
     */
    public Personaje obtenerGanador() {
        if (!personaje1.estaVivo()) {
            return personaje2;
        } else {
            return personaje1;
        }
    }

    /**
     * Obtiene el primer personaje participante en el juego.
     *
     * @return El primer personaje del juego.
     */
    public Personaje getPersonaje1() {
        return personaje1;
    }

    /**
     * Obtiene el segundo personaje participante en el juego.
     *
     * @return El segundo personaje del juego.
     */
    public Personaje getPersonaje2() {
        return personaje2;
    }

    /**
     * Obtiene el número de turno actual.
     *
     * @return El número de turno actual.
     */
    public int getTurnoActual() {
        return turnoActual;
    }

    /**
     * Avanza al siguiente turno.
     * Incrementa el contador de turno actual en 1.
     */
    public void avanzarTurno() {
        turnoActual++;
    }

    /**
     * Usa la poción disponible para el personaje dado.
     *
     * @param personaje El personaje que desea usar la poción.
     * @return Un mensaje que indica el resultado de usar la poción.
     */
    public String usarPocion(Personaje personaje) {
        return personaje.usarPocion();
    }
}
