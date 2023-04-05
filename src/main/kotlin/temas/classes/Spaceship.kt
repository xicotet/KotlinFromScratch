package temas.classes

/*
 * Crea un objeto nave espacial que tenga estas caracteristicas:
 *   -nombre
 *   -salud
 *   -tripulación
 */

interface Spaceship {
    val shipName: String
    val health: Int
    val crew: Int

    fun shoot()
}

