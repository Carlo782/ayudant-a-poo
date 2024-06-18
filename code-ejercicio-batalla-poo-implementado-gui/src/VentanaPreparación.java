import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * VentanaPreparación es una interfaz gráfica para preparar dos personajes antes de iniciar un combate.
 * Permite seleccionar nombre, clase y arma para cada personaje, así como añadir una poción de salud opcionalmente.
 */
public class VentanaPreparación extends JFrame {
    private JPanel mainPanel;
    private JLabel nombre_personaje_1;
    private JTextField textField1;
    private JLabel clase_personaje_1;
    private JComboBox<String> comboBox1;
    private JComboBox<ArsenalArmas> comboBox2;
    private JLabel arma_personaje_1;
    private JLabel nombre_personaje_2;
    private JTextField textField2;
    private JComboBox<String> comboBox3;
    private JComboBox<ArsenalArmas> comboBox4;
    private JButton iniciarCombateButton;
    private JLabel clase_personaje_2;
    private JLabel arma_personaje_2;
    private JCheckBox añadirPociónCheckBox;
    private JCheckBox añadirPociónCheckBox1;

    /**
     * Constructor de la clase VentanaPreparación.
     * Inicializa la interfaz gráfica y los componentes necesarios.
     */
    public VentanaPreparación() {
        setTitle("Preparación para el combate");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(mainPanel);

        // Configuración de los ComboBox con valores predefinidos
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Guerrero", "Mago"}));
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"Guerrero", "Mago"}));
        comboBox2.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));
        comboBox4.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));

        // Acción al hacer clic en el botón de iniciar combate
        iniciarCombateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prepararCombate();
            }
        });
    }

    /**
     * Prepara los personajes para el combate utilizando los datos ingresados en la interfaz.
     * Crea los personajes, asigna poción si está seleccionada y abre la ventana de combate.
     */
    private void prepararCombate() {
        String nombre_personaje = textField1.getText();
        String clase_personaje = comboBox1.getSelectedItem().toString();
        String arma_personaje = comboBox2.getSelectedItem().toString();
        String nombre_personaje2 = textField2.getText();
        String clase_personaje2 = comboBox3.getSelectedItem().toString();
        String arma_personaje2 = comboBox4.getSelectedItem().toString();

        Personaje personaje1 = crearPersonaje(nombre_personaje, clase_personaje, arma_personaje);
        Personaje personaje2 = crearPersonaje(nombre_personaje2, clase_personaje2, arma_personaje2);
        asignarPocion(personaje1, personaje2);
        abrirVentanaCombate(personaje1, personaje2);
    }

    /**
     * Asigna una poción de salud a los personajes seleccionados si la casilla correspondiente está marcada.
     *
     * @param personaje1 Primer personaje seleccionado.
     * @param personaje2 Segundo personaje seleccionado.
     */
    private void asignarPocion(Personaje personaje1, Personaje personaje2) {
        if (añadirPociónCheckBox.isSelected()) {
            personaje1.setPocion(new Pocion("Poción de salud", 20));
        }

        if (añadirPociónCheckBox1.isSelected()) {
            personaje2.setPocion(new Pocion("Poción de salud", 20));
        }
    }

    /**
     * Abre la ventana de combate con los personajes seleccionados y oculta la ventana actual de preparación.
     *
     * @param personaje1 Primer personaje seleccionado.
     * @param personaje2 Segundo personaje seleccionado.
     */
    private void abrirVentanaCombate(Personaje personaje1, Personaje personaje2) {
        VentanaCombate ventanaCombate = new VentanaCombate(personaje1, personaje2);
        ventanaCombate.setVisible(true);
        this.setVisible(false);
    }

    /**
     * Crea un personaje con el nombre, clase y arma especificados.
     *
     * @param nombre Nombre del personaje.
     * @param clase Clase del personaje (Guerrero o Mago).
     * @param arma Arma del personaje seleccionada del ComboBox.
     * @return El objeto Personaje creado según los parámetros.
     * @throws IllegalArgumentException Si se proporciona una clase de personaje inválida.
     */
    private Personaje crearPersonaje(String nombre, String clase, String arma) {
        switch (clase) {
            case "Guerrero":
                return new Guerrero(nombre, 100, 10, 20, arma, 5);
            case "Mago":
                return new Mago(nombre, 100, 10, 20, arma, 5);
            default:
                throw new IllegalArgumentException("Clase de personaje inválida: " + clase);
        }
    }
}
