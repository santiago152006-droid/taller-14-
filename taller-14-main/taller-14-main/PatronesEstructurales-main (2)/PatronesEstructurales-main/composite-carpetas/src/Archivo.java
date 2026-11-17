public class Archivo {
    private String nombre;
    private int tamanoKB;

    public Archivo(String nombre, int tamanoKB) {
        this.nombre = nombre;
        this.tamanoKB = tamanoKB;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamanoKB() {
        return tamanoKB;
    }
}
