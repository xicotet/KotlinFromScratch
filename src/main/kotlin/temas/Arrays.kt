package temas

// 1º Crea una función que dado un array de números inserte un número en una posición designada.
fun insertElement(userList: Array<Int>, position: Int, value: Int): Array<Int>? {
     val userListModified =  userList.copyOf()
     try {
          userListModified.set(position, value)
     } catch (e: IndexOutOfBoundsException) {
         return null
     }
     return userListModified
}

// 2º Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él
fun valueInList(userList: Array<Int>, value: Int) = value in userList

// 3º Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un número dado
fun countOccurrences(userList: Array<Int>, value: Int) = userList.count { it == value }

// 4º SIN USAR SORT, crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante
fun sortArray(userList: Array<Int>, downwards: Boolean): MutableList<Int> {
     /*
      * Recorremos el array del usuario y, para cada elemento, comprobamos si ese valor es mas pequeño
      * que cada elemento del array de resultado. Si es menor, entonces se añade ese valor a una posicion
      * anterior
      */

     val listResult = mutableListOf(userList[0]) //Guardamos el primer elemento del array

     for (i in 1 until userList.size) {
          for (j in 0 until listResult.size){
               if(userList[i] < listResult[j]) {
                    listResult.add(j, userList[i]) //Es j (y no j - 1) porque el metodo add funciona 'diferente' a set
                    break
               } else if (j == listResult.size - 1) //Hemos llegado al final. Añadimos el elemento en: j + 1 ( =listResult.size )
                    listResult.add(j + 1, userList[i])

          }
     }

     if (downwards) listResult.reverse()

     return listResult
}


// 5º Crea una función que dado un conjunto de String añada un nuevo elemento que se le pase y devuelva el nuevo array
fun addElementToArray(inputArray: Array<String>, newElement: String): Array<String> {
     val newArray: MutableList<String> = inputArray.toMutableList()
     newArray.add(newElement)
     return newArray.toTypedArray()
}

// 6º Crea una función que dado un conjunto de Int devuelva el primer número entre 1 y 1000000 que no se encuentre dentro del array
fun findFirstMissingNumber(inputArray: Array<Int>): Int? {
     //val inputArrayCopy: MutableList<Int> = sortArray(inputArray.copyOf(), false)

     for (i in 1..1000000) {
          if (i !in inputArray) return i
     }

     return null
}

