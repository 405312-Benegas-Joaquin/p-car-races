### Carrera de Autos

Estás desarrollando un sistema para gestionar una serie de carreras de autos. Necesitas implementar una serie de clases y métodos que permitan manejar las carreras, autos, pilotos y resultados. A continuación se describen las clases y las tareas que debes realizar.

#### Tareas a Resolver:

1. **Agregar Autos a una Carrera:**
    - Implementa un método en el service de `Race` llamado `addCar(Car car)` que permita añadir un auto a la lista de autos participantes.


2. **Encontrar el Auto con Mayor Velocidad Máxima:**
    - Implementa un método en el service de `Car` llamado `getFastestCar()` que devuelva el auto con la mayor velocidad máxima de todos los participantes.


3. **Calcular la Velocidad Promedio de los Autos:**
    - Implementa un método en el service de `Race` llamado `calculateAverageSpeedInARace()` que devuelva la velocidad promedio de todos los autos participantes.


4. **Encontrar el Piloto con Mayor Experiencia:**
    - Implementa un método en el service de `Driver` llamado `getMostExperiencedDriver()` que devuelva el piloto con mayor experiencia (en años).


5. **Listar Autos Ordenados por Año de Fabricación:**
    - Implementa un método en el service de `Car` llamado `listCarsByYear()` que devuelva una lista de autos ordenados de manera ascendente por año de fabricación.


6. **Calcular el Tiempo Promedio para Completar la Pista:**
    - Implementa un método en el service de `Race` llamado `calculateAverageTimeInARace()` que calcule el tiempo promedio en horas que tardan los autos en completar la pista, asumiendo que todos los autos alcanzan su velocidad máxima. Usa la fórmula: tiempo = longitud / velocidad.


7. **Agregar Detalle de la Carrera:**
    - Implementa un método en el service de `Race` llamado `addRaceDetail(RaceDetail detail)` que permita añadir un detalle a la lista de detalles de la carrera.


8. **Calcular el Ganador de la Carrera y el Status:**
    - Implementa un método en el service de `Race` llamado `calculateWinnerAndStatus()` que busque en los detalles el auto que haya hecho el menor tiempo y lo establezca como ganador. Este método solo debe ejecutarse si la carrera tiene estado `FINISHED`.
### Objetivo:

Completa las implementaciones de los métodos indicados en los servicios y prueba tu código en el método `main`. Asegúrate de manejar adecuadamente las listas y realizar las operaciones necesarias para cumplir con los requerimientos de lógica.

Con este enunciado, estarás practicando diversos aspectos de la programación en Java, incluyendo búsqueda en listas, uso de acumuladores, ciclos, y conceptos de POO, además de manejar estados mediante el uso de enums. ¡Buena suerte!