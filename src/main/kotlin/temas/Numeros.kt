package temas

// 1º Crea una función que dado 2 números enteros los sume y devuelva el resultado
fun sum(a: Int, b: Int) = a + b

// 2º Crea una función que dado 2 números enteros los multiplique y devuelva el resultado
fun multiply(a: Int, b: Int) = a * b

// 3º Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva
//    el resultado sólo si el divisor no es 0, en caso contrario devuelve nulo
fun division(dividend: Int, divisor: Int) =  if(divisor != 0) (dividend / divisor) else null

// 4º Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división.
//    Si el divisor es 0 devuelve nulo
fun integerDivide(dividend: Int, divisor: Int) = if(divisor != 0) (dividend % divisor) else null

// 5º Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos
//    que ha jugado y los que ha ganado
fun victoriesPercentage(playedGames: Int, wonGames: Int) = (wonGames / playedGames) * 100

// 6º Crea una función que dados 2 números devuelva el de mayor valor
fun greaterValue(number: Int, secondNumber: Int) = if (number > secondNumber) number else secondNumber

// 7º Calcula el volumen de una piscina dado el ancho, largo y la altura
fun calcVolume(width: Int, height: Int, depth: Int) = width * height * depth

// 8º Crea una función para calcular los X primeros números primos
fun calcNPrimeNumbers(totalNumbers: Int): List<Int> {
    val primes = mutableListOf(2)

    var number = 3
    while (primes.size < totalNumbers) {
        var range = (2 until number - 1)
        if (range.none {
            number % it == 0
        }) primes.add(number)

        number += 2 //Porque los numeros 4, 6, 8, ... no pueden ser primos
    }
    return primes

}




