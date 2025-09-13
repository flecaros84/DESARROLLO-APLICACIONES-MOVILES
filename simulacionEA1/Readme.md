## Requerimientos mínimos

1. **Registro de pescados**
- Cada pescado debe tener:
OK - `nombre` (ej: “Salmón Atlántico”, “Reineta”)
OK - `precioPorKilo`
OK - `stockKilos`
OK - Valida que el **precio sea mayor que 0** y que el **stock no sea negativo**.
OK - Usa `try-catch` para manejar posibles errores de ingreso.
2. **Mostrar pescados registrados**
OK - Imprime en consola todos los pescados con su nombre, precio y stock.
3. **Filtrar pescados caros**
OK - Muestra solo los pescados con precio mayor a $5000 usando `filter`.
4. **Calcular valor total del stock**
OK - Usa `sumOf` para calcular el valor total ( `precioPorKilo * stockKilos`).
5. **Herencia y polimorfismo**
OK - Crea una clase base: `Pescado`.
OK - Crea subclases: `Salmon` y `PescadoBlanco`.
OK - Cada clase debe sobrescribir un método `descripcion()`.
6. **Corrutinas y sealed class**
OK - Crea una función `suspend fun controlarCalidad(pescado: Pescado)` que use `delay()` para simular un proceso de revisión lenta.
OK - Modela el resultado con una **sealed class** (`Exitoso`, `Error`).
OK - Muestra los resultados en consola usando `when`.