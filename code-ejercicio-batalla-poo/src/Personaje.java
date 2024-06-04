import java.util.Random;

public class Personaje {
    private String nombre;
    private int hp;
    private int def;
    private int atk;
    private Arma arma;
    private Pocion pocion;

    public Personaje(String nombre, int hp, int def, int atk, Arma arma) {
        this.nombre = nombre;
        this.hp = hp;
        this.def = def;
        this.atk = atk;
        this.arma = arma;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public int getAtk() {
        return atk;
    }

    public Arma getArma() {
        return arma;
    }

    public Pocion getPocion() {
        return pocion;
    }

    public void setPocion(Pocion pocion) {
        this.pocion = pocion;
    }

    public void recibirDanio(int danio) {
        this.hp -= danio;
        usarPocion();
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    private boolean calcularVidaParaPocion() {
        return this.hp < 10 && this.hp > 0;
    }

    private void usarPocion() {
        if (this.calcularVidaParaPocion() && this.pocion != null) {
            this.hp += this.pocion.getRecuperacionHp();
            this.pocion = null;
        }
    }

    private boolean probabilidadSantuario() {
        Random ran = new Random();
        return ran.nextBoolean();  // Corrigiendo el error en el cálculo de probabilidad
    }

    public void visitarSantuario(Santuario santuario) {
        if (this.probabilidadSantuario()) {
            this.def += santuario.getBeneficioDefensa();
            System.out.println(this.getNombre()+" Ha encontrado un santuario! Tu defensa ha aumentado en " + santuario.getBeneficioDefensa() + " puntos.");
        }else{
            System.out.println("Todo el camino ha estado despejado para." + this.getNombre());
        }
    }

    public int calcularDanio(Personaje personaje) {
        return this.atk + this.arma.getAtk() - personaje.getDef();
    }

    public int atacar(Personaje personaje) {
        int danio = this.calcularDanio(personaje);
        if (danio < 0) {
            danio = 0;
        }
        personaje.recibirDanio(danio);
        return danio;
    }
}
