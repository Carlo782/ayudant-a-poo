import java.util.Random;

public abstract class Personaje {
    private String nombre;
    private int hp;
    private int def;
    private int atk;
    private Arma arma;
    private Pocion pocion;

    public Personaje(String nombre, int hp, int def, int atk) {
        this.nombre = nombre;
        this.hp = hp;
        this.def = def;
        this.atk = atk;
        this.arma = seleccionarArma();
        
    }

    
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

    protected abstract Arma seleccionarArma();

    public void recibirDanio(int danio) {
        this.hp -= danio;
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    private boolean calcularVidaParaPocion() {
        return this.hp <= 10 && this.hp > 0; 
    }
    

    public void usarPocion() {
        if (this.pocion != null && this.calcularVidaParaPocion()) { 
            int recuperacion = this.pocion.getRecuperacionHp(); 
            this.hp += recuperacion;
            this.pocion = null; 
            System.out.println(this.getNombre() + " ha usado una poción de salud! Tu vida ha aumentado en " + recuperacion + " puntos."); // Imprime el mensaje con la cantidad de recuperación guardada
        }
    }

    private boolean probabilidadSantuario() {
        Random ran = new Random();
        return ran.nextBoolean(); 
    }

    public void visitarSantuario(Santuario santuario) {
        if (this.probabilidadSantuario()) {
            this.def += santuario.getBeneficioDefensa();
            System.out.println(this.getNombre()+" Ha encontrado un santuario! Tu defensa ha aumentado en " + santuario.getBeneficioDefensa() + " puntos. Gracias a "+ santuario.getNombre());
        }else{
            System.out.println("Todo el camino ha estado despejado para." + this.getNombre());
        }
    }
    public abstract int calcularDanio(Personaje personaje);

    public abstract int atacar(Personaje personaje);
}
