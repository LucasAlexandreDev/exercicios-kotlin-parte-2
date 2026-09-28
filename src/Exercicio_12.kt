// ---| EXERCÍCIO 12 |---

// Conte de 1 a 100:
// múltiplo de 3 = Batata
// múltiplo de 5 = Quente
// múltiplo de 3 e 5 = BatataQuente


// FORMA PURA

fun exercicio12Puro() {

    for (i in 1..100) {

        if (i % 3 == 0 && i % 5 == 0) {
            println("BatataQuente")

        } else if (i % 3 == 0) {
            println("Batata")

        } else if (i % 5 == 0) {
            println("Quente")

        } else {
            println(i)
        }
    }
}


// FORMA COM MÉTODOS

fun exercicio12ComMetodos() {

    for (i in 1..100) {

        val resultado = when {
            i % 3 == 0 && i % 5 == 0 -> "BatataQuente"
            i % 3 == 0 -> "Batata"
            i % 5 == 0 -> "Quente"

            else -> i
        }

        println(resultado)
    }
}