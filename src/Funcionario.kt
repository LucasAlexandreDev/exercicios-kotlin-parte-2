// ---| EXERCÍCIO 20 |---

// Crie uma classe "Funcionario" com "nome", "salario" e uma
// função que retorne o salário
// Depois crie "Gerente" que herde "Funcionario" e sobrescreva
// a função, retornando o salário com 20% de comissão

// FORMA PURA

open class FuncionarioPuro(
    val nome: String,
    val salario: Double
) {

    open fun retornarSalario(): Double {

        return salario
    }
}

class GerentePuro(
    nome: String,
    salario: Double
) : FuncionarioPuro(nome, salario) {

    override fun retornarSalario(): Double {

        val comissao = salario * 0.20

        val salarioComComissao = salario + comissao

        return salarioComComissao
    }
}

fun exercicio20Puro(): Double {

    val gerente = GerentePuro("João", 5000.0)

    return gerente.retornarSalario()
}


// FORMA COM MÉTODOS

open class Funcionario(
    val nome: String,
    val salario: Double
) {

    open fun retornarSalario() = salario
}

class Gerente(
    nome: String,
    salario: Double
) : Funcionario(nome, salario) {

    override fun retornarSalario() = salario * 1.20
}

fun exercicio20ComMetodos(): Double {

    val gerente = Gerente("João", 5000.0)

    return gerente.retornarSalario()
}
