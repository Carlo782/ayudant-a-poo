import java.util.Scanner;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int hp, int def, int atk, String selection, int fuerza) {
        super(nombre, hp, def, atk, selection);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    protected Arma seleccionarArma(String selection) {

            switch (selection) {
                case "ESPADA_DE_HIERRO":
                    return new Arma(ArsenalArmas.ESPADA_DE_HIERRO.getNombre(), ArsenalArmas.ESPADA_DE_HIERRO.getTipoDeDanio(), ArsenalArmas.ESPADA_DE_HIERRO.getPoderDeAtaque());
                case "HACHA_DE_BATALLA":
                    return new Arma(ArsenalArmas.HACHA_DE_BATALLA.getNombre(), ArsenalArmas.HACHA_DE_BATALLA.getTipoDeDanio(), ArsenalArmas.HACHA_DE_BATALLA.getPoderDeAtaque());
                default:
                    System.out.println("Selección inválida, se asignará Espada de hierro por defecto.");
                    return new Arma(ArsenalArmas.ESPADA_DE_HIERRO.getNombre(), ArsenalArmas.ESPADA_DE_HIERRO.getTipoDeDanio(), ArsenalArmas.ESPADA_DE_HIERRO.getPoderDeAtaque());
            }
        }
    @Override
    public String getClase(){
        return "Guerrero";
    }

    @Override
    public int calcularDanio(Personaje personaje) {
        return this.getAtk() + this.getFuerza() + this.getArma().getAtk() - personaje.getDef();
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
