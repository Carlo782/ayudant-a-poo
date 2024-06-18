import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPreparación extends JFrame {
    private JPanel mainPanel;
    private JLabel nombre_personaje_1;
    private JTextField textField1;
    private JLabel clase_personaje_1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel arma_personaje_1;
    private JLabel nombre_personaje_2;
    private JTextField textField2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JButton iniciarCombateButton;
    private JLabel clase_personaje_2;
    private JLabel arma_personaje_2;
    private JCheckBox añadirPociónCheckBox;
    private JCheckBox añadirPociónCheckBox1;

    public VentanaPreparación(){
        setTitle("Preparación para el combate");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(mainPanel);

        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Guerrero","Mago"}));
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {"Guerrero","Mago"}));
        comboBox2.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));
        comboBox4.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));

        iniciarCombateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prepararCombate();

            }
        });
    }

    private void prepararCombate(){
        String nombre_personaje = textField1.getText();
        String clase_personaje = comboBox1.getSelectedItem().toString();
        String arma_personaje = comboBox2.getSelectedItem().toString();
        String nombre_personaje2 = textField2.getText();
        String clase_personaje2 = comboBox3.getSelectedItem().toString();
        String arma_personaje2 = comboBox4.getSelectedItem().toString();

        Personaje personaje1 = crearPersonaje(nombre_personaje, clase_personaje, arma_personaje);
        Personaje personaje2= crearPersonaje(nombre_personaje2, clase_personaje2, arma_personaje2);
        asignarPocion(personaje1,personaje2);
        abrirVentanaCombate(personaje1, personaje2);
    }

    private void asignarPocion(Personaje personaje1, Personaje personaje2){
        if (añadirPociónCheckBox.isSelected()) {
            personaje1.setPocion(new Pocion("Poción de salud", 20));
        }

        if (añadirPociónCheckBox1.isSelected()) {
            personaje2.setPocion(new Pocion("Poción de salud", 20));
        }
    }
    private void abrirVentanaCombate(Personaje personaje1, Personaje personaje2){
        VentanaCombate ventanaCombate = new VentanaCombate(personaje1,personaje2);
        ventanaCombate.setVisible(true);
        this.setVisible(false);

    }

    private Personaje crearPersonaje(String nombre, String clase, String arma){

        switch (clase){
            case "Guerrero":
                return new Guerrero(nombre, 100,10,20,arma, 5);

            case "Mago":
                return new Mago(nombre, 100,10,20,arma, 5);

            default:
                throw new IllegalArgumentException("Clase de personaje inválida: " + clase);
        }

    }

}
