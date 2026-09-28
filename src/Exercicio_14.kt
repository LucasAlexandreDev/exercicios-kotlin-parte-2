// ---| EXERCÍCIO 14 |---

// Dada uma lista de preços, calcule o total da compra


// FORMA PURA

fun exercicio14Puro(precos: List<Double>): Double {

    var total = 0.0

    for (preco in precos) {

        total += preco
    }

    return total
}


// FORMA COM MÉTODOS

fun exercicio14ComMetodos(precos: List<Double>): Double {

    return precos.reduce { total, preco -> total + preco }
}