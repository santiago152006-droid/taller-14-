public class Main {
    public static void main(String[] args) {
        EstacionClima estacion = new EstacionClima();
        estacion.agregar(new SensorNacional("Bosque Popular", 14.5));
        estacion.agregar(new SensorNacional("Chapinero", 15.2));

        SensorImportado tx = new SensorImportado("TX-900", 60.8);
        estacion.agregar(new AdaptadorSensorImportado(tx));   // NO COMPILA: SensorImportado no es SensorTemperatura
        //estacion.agregarImportado(tx);

        estacion.reporte();
    }
}
