// CLASE DE UN PROVEEDOR EXTERNO: NO SE PUEDE MODIFICAR.
// Mide en grados Fahrenheit y sus metodos tienen otros nombres.
public class SensorImportado {
    private String modelo;
    private double fahrenheit;

    public SensorImportado(String modelo, double fahrenheit) {
        this.modelo = modelo;
        this.fahrenheit = fahrenheit;
    }

    public String getModelo() {
        return modelo;
    }

    public double readFahrenheit() {
        return fahrenheit;
    }
}
