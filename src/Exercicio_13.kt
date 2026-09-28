// ---| EXERCÍCIO 13 |---

// Dada uma lista de números, crie uma nova lista apenas com os ímpares


// FORMA PURA

fun exercicio13Puro(numeros: List<Int>): MutableList<Int> {

    val impares = mutableListOf<Int>()

    for (numero in numeros) {

        if (numero % 2 != 0) {
            impares.add(numero)
        }
    }

    return impares
}


// FORMA COM MÉTODOS

fun exercicio13ComMetodos(numeros: List<Int>): List<Int> {

    return numeros.filter { it % 2 != 0 }
}