# Adapter · Ejercicio de entrada: sensores de temperatura

## Problema
La estación de clima de la universidad trabaja con la interfaz `SensorTemperatura`
(todo en grados Celsius). Llegó un sensor importado, `SensorImportado`, que mide en
Fahrenheit y cuyos métodos se llaman distinto. Es código de un proveedor: **no se puede modificar**.

En `00-inicio` la estación lo "resolvió" con una segunda lista, un segundo ciclo y la
conversión metida adentro de `EstacionClima`.

## Cómo ejecutar
```
cd 00-inicio
javac *.java
java Main
```

## Reto (15 min)
1. Cree `AdaptadorSensorImportado` que **implemente** `SensorTemperatura`.
2. Dele un atributo `SensorImportado` que reciba por constructor.
3. Implemente `getNombre()` y `leerCelsius()` traduciendo: C = (F − 32) × 5 / 9.
4. Borre de `EstacionClima` la lista `importados`, el método `agregarImportado` y el segundo ciclo.
5. En `Main`, agregue el sensor así: `estacion.agregar(new AdaptadorSensorImportado(tx));`

## Quedó bien si
- La consola muestra los mismos tres valores y el mismo promedio que `00-inicio`.
- `EstacionClima` ya no menciona `SensorImportado` en ninguna línea.
- `SensorImportado.java` quedó idéntico (no lo tocó).

## Reto extra (sin solución incluida)
Llega un segundo proveedor, `SensorKelvin`, con el método `double getKelvin()` (C = K − 273.15).
Agréguelo sin modificar `EstacionClima`.

La solución está en `01-solucion`.
