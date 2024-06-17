public class Pocion {

    private String nombre;
    private int recuperacionHp;

    public Pocion(String nombre, int recuperacionHp) {
        this.nombre = nombre;
        this.recuperacionHp = recuperacionHp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecuperacionHp() {
        return recuperacionHp;
    }

    public void setRecuperacionHp(int recuperacionHp) {
        this.recuperacionHp = recuperacionHp;
    }
}
