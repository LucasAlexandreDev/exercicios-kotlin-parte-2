// ---| EXERCÍCIO 16 |---

// Dada uma variável numérica, calcule o seu fatorial


// FORMA PURA

fun exercicio16Puro(numero: Int): Long {

    var fatorial = 1L

    for (i in 1..numero) {

        fatorial *= i
    }

    return fatorial
}


// FORMA COM MÉTODOS

fun exercicio16ComMetodos(numero: Int): Long {

    if (numero == 0) {
        return 1L
    }

    return (1..numero).reduce { resultado, valor -> resultado * valor }.toLong()
}
