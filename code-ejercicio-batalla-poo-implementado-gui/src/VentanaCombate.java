import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCombate extends JFrame {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton siguienteTurnoButton;
    private JButton usarPociónButton;
    Personaje personaje1;
    Personaje personaje2;
    int turnoActual;

    public VentanaCombate(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;

    setTitle("Combate");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    add(mainPanel);
    mostrarDatosPersonajes();


        usarPociónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usarPocion();
            }
        });
    }

    private void usarPocion(){
        if (turnoActual%2 == 0){
            personaje1.usarPocion();
        }else {
            personaje2.usarPocion();
        }
    }

    private void mostrarDatosPersonajes() {
        textArea1.setText("Nombre: " + personaje1.getNombre() + "\n");
        textArea1.append("Clase: " + personaje1.getClase() + "\n");
        textArea1.append("Arma: " + personaje1.getArma().getNombre() + "\n");
        textArea1.append("Daño Arma: " + personaje1.getArma().getAtk() + "\n");
        textArea1.append("Vida: " + personaje1.getHp() + "\n");
        textArea1.append("Ataque: " + personaje1.getAtk() + "\n");
        textArea1.append("Defensa: " + personaje1.getDef() + "\n");
        textArea1.append("Poción Disponible: " + personaje1.verificarPoción() + "\n");


        textArea3.setText("Nombre: " + personaje2.getNombre() + "\n");
        textArea3.append("Clase: " + personaje2.getClase() + "\n");
        textArea3.append("Arma: " + personaje1.getArma().getNombre() + "\n");
        textArea3.append("Daño Arma: " + personaje1.getArma().getAtk() + "\n");
        textArea3.append("Vida: " + personaje2.getHp() + "\n");
        textArea3.append("Ataque: " + personaje2.getAtk() + "\n");
        textArea3.append("Defensa: " + personaje2.getDef() + "\n");
        textArea3.append("Poción Disponible: " + personaje2.verificarPoción() + "\n");

    }



}
