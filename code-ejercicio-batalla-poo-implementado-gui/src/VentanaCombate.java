import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * VentanaCombate es una interfaz gráfica que permite controlar el juego de combate entre dos personajes.
 * Permite ver el estado de los personajes, avanzar turnos, usar poción y guardar el historial de combate.
 */
public class VentanaCombate extends JFrame {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton siguienteTurnoButton;
    private JButton usarPociónButton;
    private Juego juego;
    private GestorDeArchivo gestorDeArchivo;

    /**
     * Constructor de la clase VentanaCombate.
     * Inicializa la interfaz gráfica y los componentes necesarios.
     *
     * @param personaje1 Primer personaje participante en el juego de combate.
     * @param personaje2 Segundo personaje participante en el juego de combate.
     */
    public VentanaCombate(Personaje personaje1, Personaje personaje2) {
        this.juego = new Juego(personaje1, personaje2);
        this.gestorDeArchivo = new GestorDeArchivo();

        setTitle("Combate");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(mainPanel);
        mostrarDatosPersonajes();
        visitarSantuario();

        siguienteTurnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteTurno();
            }
        });

        usarPociónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usarPocion();
            }
        });
    }

    /**
     * Muestra los datos de los personajes en las áreas de texto correspondientes.
     */
    private void mostrarDatosPersonajes() {
        textArea1.setText(obtenerDatosPersonaje(juego.getPersonaje1()));
        textArea3.setText(obtenerDatosPersonaje(juego.getPersonaje2()));
    }

    /**
     * Obtiene y formatea los datos de un personaje para mostrarlos en el área de texto.
     *
     * @param personaje El personaje del cual se obtendrán los datos.
     * @return Una cadena con los datos formateados del personaje.
     */
    private String obtenerDatosPersonaje(Personaje personaje) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(personaje.getNombre()).append("\n");
        sb.append("Clase: ").append(personaje.getClase()).append("\n");
        sb.append("Arma: ").append(personaje.getArma().getNombre()).append("\n");
        sb.append("Daño Arma: ").append(personaje.getArma().getAtk()).append("\n");
        sb.append("Vida: ").append(personaje.getHp()).append("\n");
        sb.append("Ataque: ").append(personaje.getAtk()).append("\n");
        sb.append("Defensa: ").append(personaje.getDef()).append("\n");
        sb.append("Poción Disponible: ").append(personaje.verificarPocion()).append("\n");
        return sb.toString();
    }

    /**
     * Realiza el siguiente turno de combate entre los personajes.
     * Muestra el resultado del turno y verifica si hay un ganador o si el juego continúa.
     */
    private void siguienteTurno() {
        String mensaje = juego.turno();
        textArea2.append(mensaje);

        if (juego.verificarFinDeJuego()) {
            Personaje ganador = juego.obtenerGanador();
            JOptionPane.showMessageDialog(this, ganador.getNombre() + " es el ganador!");
            guardarHistorial();
            this.dispose();
        } else {
            mostrarDatosPersonajes();
            juego.avanzarTurno();
        }
    }

    /**
     * Usa la poción del personaje activo según el turno actual.
     * Muestra el resultado de usar la poción y actualiza los datos de los personajes.
     */
    private void usarPocion() {
        if (juego.getTurnoActual() % 2 != 0) {
            String mensaje = juego.usarPocion(juego.getPersonaje1());
            textArea2.append(mensaje);
        } else {
            String mensaje = juego.usarPocion(juego.getPersonaje2());
            textArea2.append(mensaje);
        }
        mostrarDatosPersonajes();
    }

    /**
     * Simula que los personajes visitan un santuario antes de iniciar el combate.
     * Muestra el resultado de la visita al santuario en el área de texto.
     */
    private void visitarSantuario() {
        String mensaje = juego.getPersonaje1().visitarSantuario(new Santuario("Santuario defensa", 5));
        mensaje += juego.getPersonaje2().visitarSantuario(new Santuario("Santuario defensa", 5));
        textArea2.append(mensaje);
    }

    /**
     * Guarda el historial de combate en un archivo de texto.
     * El nombre del archivo es una combinación de los nombres de los personajes.
     * Muestra un mensaje de éxito o error en un cuadro de diálogo.
     */
    private void guardarHistorial() {
        try {
            String nombreArchivo = juego.getPersonaje1().getNombre() + " vs " + juego.getPersonaje2().getNombre() + ".txt";
            gestorDeArchivo.create(nombreArchivo);
            gestorDeArchivo.update(nombreArchivo, textArea2.getText());
            JOptionPane.showMessageDialog(this, "Historial guardado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el historial: " + e.getMessage());
        }
    }
}
