package temas.classes

class GameCharacter(
    val name: String,
    var health: Int,
    val attack: Int,
    val defense: Int,
    val race: String
){

    var isDead: Boolean = false
        private set(value) {field = value}

    lateinit var status: String

    fun takeDamage(attacker: GameCharacter){
        // Si la defensa es mayor al ataque, no se produce daño (no pierde salud el defensor)
        var damage: Int = (attacker.attack - this.defense).coerceAtLeast(0) //Si da negativo, damage = 0
        this.health -= damage

        println("${attacker.name} ataca a ${this.name} y reduce su salud en $damage puntos ")

        status = if (isDead) "${this.name} está muerto" else "Salud total de ${this.name} es $health"
        println(status)
    }

    
}
