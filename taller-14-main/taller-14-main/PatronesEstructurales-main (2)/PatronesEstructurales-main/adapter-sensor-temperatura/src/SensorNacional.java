// Sensor fabricado para nuestra estacion: ya cumple la interfaz.
public class SensorNacional implements SensorTemperatura {
    private String ubicacion;
    private double celsius;

    public SensorNacional(String ubicacion, double celsius) {
        this.ubicacion = ubicacion;
        this.celsius = celsius;
    }

    public String getNombre() {
        return ubicacion;
    }

    public double leerCelsius() {
        return celsius;
    }
}
