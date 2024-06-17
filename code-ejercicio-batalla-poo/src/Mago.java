public class Mago extends Personaje {
    
    private int poderMagico;

    public Mago(String nombre, int hp, int def, int atk, int poderMagico) {
        super(nombre, hp, def, atk, new Arma("Bastón", TipoDeDanio.MAGICO, 7));
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
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
