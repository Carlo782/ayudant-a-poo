import javax.swing.*;

public class App {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VentanaPreparación ventanaPreparación = new VentanaPreparación();
                ventanaPreparación.setVisible(true);
            }
        });
    }
}
