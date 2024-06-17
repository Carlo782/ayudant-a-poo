import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego(scanner);
        juego.iniciar();

    }
}
