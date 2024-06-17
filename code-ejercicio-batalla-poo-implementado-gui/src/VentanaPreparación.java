import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPreparación extends JFrame {
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
    private Juego juego;


    public VentanaPreparación(){
        setTitle("Preparación para el combate");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Guerrero","Mago"}));
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {"Guerrero","Mago"}));

        comboBox2.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));
        comboBox4.setModel(new DefaultComboBoxModel<>(ArsenalArmas.values()));


        iniciarCombateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    private void iniciarCombate(){
        String nombre_personaje = textField1.getText();
        String clase_personaje = comboBox1.getSelectedItem().toString();
        String arma_personaje = comboBox2.getSelectedItem().toString();
        String nombre_personaje2 = textField2.getText();
        String clase_personaje2 = comboBox3.getSelectedItem().toString();
        String arma_personaje2 = comboBox4.getSelectedItem().toString();


    }




}
