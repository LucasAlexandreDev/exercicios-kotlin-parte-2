// ---| EXERCÍCIO 15 |---

// Dada uma lista de idades, calcule a média dos maiores de idade


// FORMA PURA

fun exercicio15Puro(idades: List<Int>): Double {

    var soma = 0
    var quantidade = 0

    for (idade in idades) {

        if (idade >= 18) {
            soma += idade
            quantidade++
        }
    }

    if (quantidade == 0) {
        return 0.0
    }

    return soma.toDouble() / quantidade
}


// FORMA COM MÉTODOS

fun exercicio15ComMetodos(idades: List<Int>): Double {

    val maioresDeIdade = idades.filter { it >= 18 }

    if (maioresDeIdade.size == 0) {
        return 0.0
    }

    return maioresDeIdade
        .reduce { soma, idade -> soma + idade }
        .toDouble() / maioresDeIdade.size
}