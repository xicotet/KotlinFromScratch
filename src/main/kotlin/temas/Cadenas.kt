package temas

// 1º Crea una función que dados 2 strings los concatene y los devuelva
fun concatenate(firstWord: String, secondWord: String) = firstWord + secondWord

// 2ºCrea una función que dada una frase sustituya un caracter por otro
fun replaceChar(originalString: String, oldChar: Char, newChar: Char) = originalString.replace(oldChar, newChar, true)

// 3ºCrea una función que dada una frase borre el caracter que se le pasa si la contiene al principio o al final de la frase
fun deleteCharInBoundaries(originalString: String, char: Char) =
    originalString.removePrefix(char.toString()).removeSuffix(char.toString())

// 4ºCrea una función que dado un texto devuelva 2 veces las 2 primeras letras. Ejemplo "swift" devuelve "swsw"
fun repeatFirstLetters(text: String, numberOfTimes: Int) = text.substring(0, 2).repeat(numberOfTimes)

// 5ºCrea una función que dada una frase compruebe que los 2 primeros caracteres son iguales que los 2 últimos
fun beginsAsItEnds(text: String, numberOfLetters: Int): Boolean {
    val firstLetters = text.substring(0, numberOfLetters)
    val endsWith = text.endsWith(firstLetters, true)
    return endsWith
}

// 6º Comprueba que 2 textos son iguales independientemente de si son mayusculas o no
fun areEqualStrings(firstText: String, secondText: String) = firstText.equals(secondText, true)

