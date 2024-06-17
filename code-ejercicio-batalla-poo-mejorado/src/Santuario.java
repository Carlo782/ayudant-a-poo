public class Santuario {
    private String nombre;
    private int beneficioDefensa;

    public Santuario(String nombre ,int beneficioDefensa) {
        this.nombre = nombre;
        this.beneficioDefensa = beneficioDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBeneficioDefensa() {
        return beneficioDefensa;
    }

    public void setBeneficioDefensa(int beneficioDefensa) {
        this.beneficioDefensa = beneficioDefensa;
    }
}
