import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    // PROBLEMA: una lista por cada tipo de cosa que puede ir adentro
    private List<Elemento> hijos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregar(Elemento e) {
        hijos.add(e);
    }


    // PROBLEMA: cada operacion repite dos ciclos, uno por lista
    public int getTamanoKB() {
        int total = 0;
        for (Elemento e : hijos) {
            total += e.getTamanoKB();
        }
        return total;
    }

    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] " + getTamanoKB() + " KB");
        for (Elemento e : hijos) {
            System.out.println(sangria + "   " + getNombre() + " " + getTamanoKB() + " KB");
        }

    }
}
