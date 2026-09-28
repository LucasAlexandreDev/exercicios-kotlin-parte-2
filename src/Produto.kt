// ---| EXERCÍCIO 18 |---

// Crie um array de objetos representando produtos (nome, preço)
// e mostre o nome do produto mais caro


// FORMA PURA

class Produto(
    val nome: String,
    val preco: Double
)

fun exercicio18Puro(produtos: Array<Produto>): String {

    var maisCaro = produtos[0]

    for (produto in produtos) {

        if (produto.preco > maisCaro.preco) {
            maisCaro = produto
        }
    }

    return maisCaro.nome
}


// FORMA COM MÉTODOS

fun exercicio18ComMetodos(produtos: Array<Produto>): String {

    val maisCaro = produtos.reduce { produtoAtual, produto ->

        if (produto.preco > produtoAtual.preco) {
            produto
        } else {
            produtoAtual
        }
    }

    return maisCaro.nome
}