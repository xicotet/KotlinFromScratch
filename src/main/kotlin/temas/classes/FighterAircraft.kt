package temas.classes

/*
 * Crea un objeto caza que hereda de nave espacial y tenga como caracteristicas:
 *   -nombre
 *   -disparos
 *   -función disparar que vaya restando el número de disparos
 */

class FighterAircraft (
    override val shipName: String,
    override val health: Int,
    override val crew: Int,
    override var shoots: Int
): Spaceship, Shootable{

    override fun shoot() {
        shoots--
    }


}