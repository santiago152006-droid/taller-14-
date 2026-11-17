public class AdaptadorSensorImportado implements SensorTemperatura {
    private SensorImportado sensor;


    public AdaptadorSensorImportado(SensorImportado var1) {
        this.sensor = sensor;
    }
    @Override 
    public String getNombre(){
        return sensor.getModelo();
    }
    @Override 
    public double leerCelsius(){
        return (sensor.readFahrenheit() - 32) * 5 / 9;
    }
}

