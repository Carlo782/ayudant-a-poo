public enum ArsenalArmas {
    ESPADA_DE_HIERRO("Espada de hierro", TipoDeDanio.FISICO, 10),
    HACHA_DE_BATALLA("Hacha de batalla", TipoDeDanio.FISICO, 12),
    VARITA_MAGICA("Varita mágica", TipoDeDanio.MAGICO, 8),
    BASTON_DE_PODER("Bastón de poder", TipoDeDanio.MAGICO, 10);

    private final String nombre;
    private final TipoDeDanio tipoDeDanio;
    private final int poderDeAtaque;

    ArsenalArmas(String nombre, TipoDeDanio tipoDeDanio, int poderDeAtaque) {
        this.nombre = nombre;
        this.tipoDeDanio = tipoDeDanio;
        this.poderDeAtaque = poderDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDeDanio getTipoDeDanio() {
        return tipoDeDanio;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }
}
