import java.util.Random;

public abstract class Personaje {
    private String nombre;
    private int hp;
    private int def;
    private int atk;
    private Arma arma;
    private Pocion pocion;

    public Personaje(String nombre, int hp, int def, int atk, String selection) {
        this.nombre = nombre;
        this.hp = hp;
        this.def = def;
        this.atk = atk;
        this.arma = seleccionarArma(selection);
        
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

    public boolean verificarPocion(){
        return pocion != null;
    }

    public void setPocion(Pocion pocion) {
        this.pocion = pocion;
    }

    protected abstract Arma seleccionarArma(String selection);

    public void recibirDanio(int danio) {
        this.hp -= danio;
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public abstract String getClase();

    public String usarPocion(){
        if (this.pocion != null) {
            int recuperación = this.pocion.getRecuperacionHp();
            this.hp += recuperación;
            this.pocion = null;
            return this.getNombre() + " ha usado una poción de vida y se a recuperado " + recuperación + " puntos de vida\n";
        }else {
            return this.getNombre() + " introdujo su mano en su bolsillo pero no encuentra nada\n";
        }
    }

    private boolean probabilidadSantuario() {
        Random ran = new Random();
        return ran.nextBoolean(); 
    }


    public String visitarSantuario(Santuario santuario) {
        if (this.probabilidadSantuario()) {
            this.def += santuario.getBeneficioDefensa();
            return this.getNombre()+" Ha encontrado un santuario! Tu defensa ha aumentado en " + santuario.getBeneficioDefensa() + "\n";
        }else{
            return "Todo el camino ha estado despejado para " + this.getNombre() + "\n";
        }
    }

    public abstract int calcularDanio(Personaje personaje);

    public abstract int atacar(Personaje personaje);
}
