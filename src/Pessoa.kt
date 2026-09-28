// ---| EXERCÍCIO 17 |---

// Crie um objeto "pessoa" com nome, idade e cidade,
// depois exiba uma frase com os dados do objeto por meio de um método


// FORMA PURA

fun exercicio17Puro(
    nome: String,
    idade: Int,
    cidade: String
): String {

    return "$nome tem $idade anos e mora em $cidade."
}

// FORMA COM MÉTODOS

fun exercicio17ComMetodos(
    nome: String,
    idade: Int,
    cidade: String
): String {

    val pessoa = Pessoa(nome, idade, cidade)

    return pessoa.exibirDados()
}


class Pessoa(
    val nome: String,
    val idade: Int,
    val cidade: String
) {

    fun exibirDados() = "$nome tem $idade anos e mora em $cidade."

}
