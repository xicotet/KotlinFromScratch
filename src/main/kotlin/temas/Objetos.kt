package temas

import temas.classes.Car
import temas.classes.CarBrand
import temas.classes.GameCharacter

// 1º Crea un función con los parámetros que necesites que cree y devuelva un objeto marca de coche con
// el nombre de la marca, el año de creación y el país de origen

fun createCarBrandObject(manufacturer: String, yearOfCreation: Int, countryOfOrigin: String): CarBrand {
    return CarBrand(manufacturer, yearOfCreation, countryOfOrigin)
}

// 2º Crea una función con los parámetros que necesites que cree y devuelva un objeto coche que tenga
// un nombre de modelo, fecha de fabricación, número de caballos y marca

fun createCarObject(horsepower: Int, yearOfCreation: Int, modelName: String, manufacturer: String): Car {
    return Car(horsepower, yearOfCreation, modelName, manufacturer)
}

// 3º Vamos a crear un objeto que va a representar a un personaje con las siguiente caracteristicas:
// nombre, salud,ataque, defensa, raza y funciones para

fun createCharacter(name: String, health: Int, attack: Int, defense: Int, race: String): GameCharacter {
    return GameCharacter(name, health, attack, defense, race)
}

// 4º Crea 2 personajes y ataca al otro personaje reduciendo su salud en función de tus puntos de ataque
fun attack(attacker: GameCharacter, defender: GameCharacter, amount: Int){
    defender.takeDamage(attacker)
}
