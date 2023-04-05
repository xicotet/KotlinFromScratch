
import temas.*
import temas.classes.GameCharacter
import temas.classes.Spaceship

fun main(args: Array<String>) {
    //print(division(7, 6))

    val primes: List<Int> = calcNPrimeNumbers(5)

    primes.forEach { print(it) }

    println("\n${concatenate("hola","adios")}")
    println(replaceChar("esta frase es de ejemplo", 'a', 'i'))
    println(deleteCharInBoundaries("esta frase es de ejemplo", 'e'))
    println(repeatFirstLetters("este es el texto", 2))
    println(beginsAsItEnds("LA este es el texeslAd", 2))

    println("%%%%%%%%%%%%%")
    println("ARRAYS")
    val result = insertElement(arrayOf(1,2,3,4,5), 4, 33)
    result?.forEach { print("$it ") }

    println()
    println(valueInList(arrayOf(1,2,3,4,5), 4))

    println(countOccurrences(arrayOf(1,1,2,3,3,5,3), 1))

    println(sortArray(arrayOf(-5,6,7,0,-10,1,7,3,12,-200), false))


    println("\nDevuelve el primer numero entre 1 y 1000000 que no esta " +
            "\ndentro del array: ")
    print(findFirstMissingNumber(arrayOf(1,2,3,4)))

    println("%%%%%%%%%%%%%")
    println("OBJETOS")

    val pikachu: GameCharacter = GameCharacter("Pikachu", 15, 6, 3, "Pokemon")
    val charizard: GameCharacter = GameCharacter("Charizard", 10, 9, 4, "Pokemon")
    pikachu.takeDamage(charizard)

    val testList = mutableListOf<Spaceship>()
    val position = testList.size
    val listaPrueba = mutableListOf<Spaceship>()
    listaPrueba.forEach { println("hola -> $it") }


}