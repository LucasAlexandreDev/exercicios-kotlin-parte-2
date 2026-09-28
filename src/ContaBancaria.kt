// ---| EXERCÍCIO 19 |---

// Crie uma classe "ContaBancaria" com os atributos "nomeTitular"
// e "saldo" (privado) e crie funções para depositar um valor,
// sacar um valor e consultar o saldo.


// FORMA PURA

class ContaBancariaPura(
    private val nomeTitular: String,
    private var saldo: Double
) {

    fun depositar(valor: Double) {

        saldo += valor
    }

    fun sacar(valor: Double): Boolean {

        if (valor <= saldo) {
            saldo -= valor
            return true
        }

        return false
    }

    fun consultarSaldo(): Double {

        return saldo
    }
}

fun exercicio19Puro(): ContaBancariaPura {

    val conta = ContaBancariaPura("Maria", 1000.0)

    conta.depositar(500.0)

    conta.sacar(200.0)

    return conta
}


// FORMA COM MÉTODOS / ATALHOS

class ContaBancaria(
    private val nomeTitular: String,
    private var saldo: Double
) {

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) =
        if (valor <= saldo) {
            saldo -= valor
            true
        } else {
            false
        }

    fun consultarSaldo() = saldo
}

fun exercicio19ComMetodos(): ContaBancaria {

    val conta = ContaBancaria("Maria", 1000.0)

    conta.depositar(500.0)

    conta.sacar(200.0)

    return conta
}