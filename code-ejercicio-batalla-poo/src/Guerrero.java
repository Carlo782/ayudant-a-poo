public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int hp, int def, int atk, int fuerza) {
        super(nombre, hp, def, atk, new Arma("Espada", TipoDeDanio.FISICO, 5));
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
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
