package temas.classes

import kotlin.random.Random

/*
 * Crea un objeto porta-cazas que hereda de nave espacial y tenga como características:
 *    - núnero de cazas
 *    - disparos
 *    - funcion disparar
 *    - función lanzar cazas que vaya reduciendose hasta que no queden cazas
 */

// Uso el nombre AircraftCarrier y no CarrierShip porque este último suele referirse a un buque de transporte (carguero)

class AircraftCarrier(
    override val shipName: String,
    override val health: Int,
    override val crew: Int,
    val spaceships: MutableList<Spaceship>,
): Spaceship {

    // Constructor sin la lista spaceShips como argumento
    constructor(name: String, health: Int, crew: Int): this(name, health, crew, mutableListOf())

    // Constructor con la lista spaceShips como argumento
    constructor(name: String, health: Int, crew: Int, spaceship: Spaceship): this(name, health, crew, mutableListOf(spaceship))

    var numberOfSpaceships = spaceships.size

    // Iterar sobre cada nave espacial (spaceships) de la lista y comprobar si cada item es una instancia
    // de una clase que implemente la interfaz Shootable. Si es así, va sumandolo a totalShoots
    var totalShoots = spaceships.sumOf { if (it is Shootable) it.shoots else 0   }

    fun addSpaceship(spaceship: Spaceship) {
        spaceships.add(spaceship)
        numberOfSpaceships++
        if (spaceship is Shootable) {
            totalShoots += spaceship.shoots
        }
        println("${spaceship.shipName} aterriza en el portaviones")
        println("Total de disparos disponibles del portanaves: $totalShoots")
        println()
    }

    // Lanzar nave espacial aleatoria del portanaves
    fun launchSpaceship(){
        val size = spaceships.size
        // Si el tamaño fuera 0 entonces Random produciria un error al hacer Random(0, 0)
        val positionOfShip: Int? = if (size > 0) Random.nextInt(0, size) else null
        // Si la posición es nula no buscamos la nave en la lista spaceShips
        val spaceshipLeaving: Spaceship? = positionOfShip?.let { spaceships.getOrNull(it) }

        byeByeSpaceship(spaceshipLeaving)
    }

    // Lanzar nave espacial del portanaves dado su nombre
    fun launchSpaceship(shipNameLeaving: String){
        val spaceshipLeaving: Spaceship? = spaceships.firstOrNull() { it.shipName == shipNameLeaving}
        byeByeSpaceship(spaceshipLeaving)
    }

    // Lanzar nave espacial del portaviones dada su posición en el carril de despegue del portanaves
    fun launchSpaceship(positionInFlightDeck: Int){
        val spaceshipLeaving: Spaceship? = spaceships.getOrNull(positionInFlightDeck)
        byeByeSpaceship(spaceshipLeaving)
    }

    //  Borrar la nave espacial de la lista de naves (spaceShips)
    fun byeByeSpaceship(spaceshipLeaving: Spaceship?) {
        spaceshipLeaving?.let {
            println("${it.shipName} abandona el portaviones")
            spaceships.remove(it)
        }
        if (spaceshipLeaving is Shootable) {
            totalShoots -= spaceshipLeaving.shoots
            println("Total de disparos disponibles del portanaves: $totalShoots")
        }

        println() // Linea en blanco
    }

    override fun shoot() {
        val size = spaceships.size
        var positionOfShip: Int?
        var spaceshipShooting: Spaceship?
        var shootsAvailable: Int

        //Si no hay ninguna nave que pueda disparar, no tiene sentido seguir
        if (spaceships.all { it !is Shootable }) {
            println("No hay naves que puedan disparar...")
            return
        }


        /*
         * Una nave aleatoria dispara si es una nave que puede disparar y ademas dispone de shoots
         * Si esa nave aleatoria no puede disparar o no tiene shoots, se busca otra
         * Si no quedan totalShoots o no hay naves, se sale del bucle
         */
        do {
            positionOfShip = if (size > 0) Random.nextInt(0, size) else null
            spaceshipShooting = positionOfShip?.let { spaceships.getOrNull(it) }
            shootsAvailable = if (spaceshipShooting is Shootable) spaceshipShooting.shoots else 0

            if (shootsAvailable > 0) {
                spaceshipShooting?.shoot()
                totalShoots--
            }
        } while (shootsAvailable == 0 && spaceships.size > 0 && totalShoots > 0)
    }


    fun shoot(shipNameShooting: String) {
        val spaceshipShooting: Spaceship? = spaceships.firstOrNull() { it.shipName == shipNameShooting }
        if (spaceshipShooting is Shootable) {
            if (spaceshipShooting.shoots > 0) {
                spaceshipShooting.shoot()
                totalShoots--
            }
        }
    }
}