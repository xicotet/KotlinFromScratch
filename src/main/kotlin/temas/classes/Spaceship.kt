package temas.classes

/* * * * * * * * * * * *
 * ENUNCIADO:
 * Crea una clase nave espacial que tenga estas caracteristicas:
 *   -nombre
 *   -salud
 *   -tripulación
 */

/*
 * NOTA DE PABLO CANO:
 * He optado por implementar una interfaz que defina una especie de "firma" para que
 * todas las subclases (en este caso, cazas -FighterAircraft- y portaaviones -AircraftCarrier-) tengan
 * una serie de parámetros comunes (nombre, salud, tripulación)
 * * * * * * * * * * * * * * * */

interface Spaceship {
    val shipName: String
    val health: Int
    val crew: Int

    fun shoot()
}

