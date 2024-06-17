import java.util.Scanner;

public class Mago extends Personaje {
    
    private int poderMagico;

    public Mago(String nombre, int hp, int def, int atk, int poderMagico) {
        super(nombre, hp, def, atk);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override
    protected Arma seleccionarArma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el arma para el Mago:");
        System.out.println("1. Varita mágica (poder de ataque: 8)");
        System.out.println("2. Bastón de poder (poder de ataque: 10)");

        int seleccion = scanner.nextInt();
        switch (seleccion) {
            case 1:
                return new Arma(ArsenalArmas.VARITA_MAGICA.getNombre(), ArsenalArmas.VARITA_MAGICA.getTipoDeDanio(), ArsenalArmas.VARITA_MAGICA.getPoderDeAtaque());
            case 2:
                return new Arma(ArsenalArmas.BASTON_DE_PODER.getNombre(), ArsenalArmas.BASTON_DE_PODER.getTipoDeDanio(), ArsenalArmas.BASTON_DE_PODER.getPoderDeAtaque());
            default:
                System.out.println("Selección inválida, se asignará Varita mágica por defecto.");
                return new Arma(ArsenalArmas.VARITA_MAGICA.getNombre(), ArsenalArmas.VARITA_MAGICA.getTipoDeDanio(), ArsenalArmas.VARITA_MAGICA.getPoderDeAtaque());
        }
    }

    @Override
    public int calcularDanio(Personaje personaje) {
        return this.getAtk() + this.getPoderMagico() + this.getArma().getAtk() - personaje.getDef();
    }

    @Override
    public int atacar(Personaje personaje) {
        int danio = this.calcularDanio(personaje);
        if (danio < 0) {
            danio = 0;
        }
        personaje.recibirDanio(danio);
        return danio;
    }
}
