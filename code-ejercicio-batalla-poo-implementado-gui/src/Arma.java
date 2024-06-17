public class Arma {
    
    private String nombre;
    private TipoDeDanio tipoDeDanio;
    private int atk;

    public Arma(String nombre, TipoDeDanio tipoDeDanio, int atk) {
        this.nombre = nombre;
        this.tipoDeDanio = tipoDeDanio;
        this.atk = atk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeDanio getTipoDeDanio() {
        return tipoDeDanio;
    }

    public void setTipoDeDanio(TipoDeDanio tipoDeDanio) {
        this.tipoDeDanio = tipoDeDanio;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
