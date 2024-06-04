public class App {
    public static void main(String[] args) throws Exception {
        run();
    }

    public static void run(){
        preparando();
    }

    public static void preparando(){
    Pocion pocion = new Pocion("Poción de Salud", 20);
    
    Santuario santuario = new Santuario(10);
    
    Guerrero guerrero = new Guerrero("Guerrero", 20, 20, 10, 15);
    Mago mago = new Mago("Mago", 20, 10, 15, 10);
    
    Juego juego = new Juego();

    juego.iniciar(guerrero, mago, pocion, santuario);
    }
}
