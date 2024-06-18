import java.util.Scanner;

public class Mago extends Personaje {
    
    private int poderMagico;

    public Mago(String nombre, int hp, int def, int atk,String selection, int poderMagico) {
        super(nombre, hp, def, atk, selection);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override
    protected Arma seleccionarArma(String selection) {

        switch (selection) {
            case "VARITA_MAGICA":
                return new Arma(ArsenalArmas.VARITA_MAGICA.getNombre(), ArsenalArmas.VARITA_MAGICA.getTipoDeDanio(), ArsenalArmas.VARITA_MAGICA.getPoderDeAtaque());
            case "BASTON_DE_PODER":
                return new Arma(ArsenalArmas.BASTON_DE_PODER.getNombre(), ArsenalArmas.BASTON_DE_PODER.getTipoDeDanio(), ArsenalArmas.BASTON_DE_PODER.getPoderDeAtaque());
            default:
                System.out.println("Selección inválida, se asignará Varita mágica por defecto.");
                return new Arma(ArsenalArmas.VARITA_MAGICA.getNombre(), ArsenalArmas.VARITA_MAGICA.getTipoDeDanio(), ArsenalArmas.VARITA_MAGICA.getPoderDeAtaque());
        }
    }

    @Override
    public String getClase(){
        return "Mago";
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
