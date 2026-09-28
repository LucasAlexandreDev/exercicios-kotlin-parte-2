fun main() {

    // ---| TESTE EXERCÍCIO 12 |---

    println("EXERCÍCIO 12 - FORMA PURA")
    exercicio12Puro()

    println("EXERCÍCIO 12 - FORMA COM MÉTODOS")
    exercicio12ComMetodos()


    // ---| TESTE EXERCÍCIO 13 |---

    val numerosExercicio13 = listOf(1, 2, 3, 4, 5, 6, 7)

    println("EXERCÍCIO 13 - FORMA PURA")
    println(exercicio13Puro(numerosExercicio13))

    println("EXERCÍCIO 13 - FORMA COM MÉTODOS")
    println(exercicio13ComMetodos(numerosExercicio13))


    // ---| TESTE EXERCÍCIO 14 |---

    val precosExercicio14 = listOf(10.0, 25.50, 8.50, 15.0)

    println("EXERCÍCIO 14 - FORMA PURA")
    println(exercicio14Puro(precosExercicio14))

    println("EXERCÍCIO 14 - FORMA COM MÉTODOS")
    println(exercicio14ComMetodos(precosExercicio14))


    // ---| TESTE EXERCÍCIO 15 |---

    val idadesExercicio15 = listOf(12, 18, 20, 15, 30, 17)

    println("EXERCÍCIO 15 - FORMA PURA")
    println(exercicio15Puro(idadesExercicio15))

    println("EXERCÍCIO 15 - FORMA COM MÉTODOS")
    println(exercicio15ComMetodos(idadesExercicio15))


    // ---| TESTE EXERCÍCIO 16 |---

    println("EXERCÍCIO 16 - FORMA PURA")
    println(exercicio16Puro(5))

    println("EXERCÍCIO 16 - FORMA COM MÉTODOS")
    println(exercicio16ComMetodos(5))


    // ---| TESTE EXERCÍCIO 17 |---

    println("EXERCÍCIO 17 - FORMA PURA")
    println(exercicio17Puro("Maria", 25, "São Paulo"))

    println("EXERCÍCIO 17 - FORMA COM MÉTODOS")
    println(exercicio17ComMetodos("Maria", 25, "São Paulo"))


    // ---| TESTE EXERCÍCIO 18 |---

    val produtosExercicio18 = arrayOf(
        Produto("Arroz", 25.00),
        Produto("Feijão", 10.00),
        Produto("Café", 35.00),
        Produto("Leite", 7.00)
    )

    println("EXERCÍCIO 18 - FORMA PURA")
    println(exercicio18Puro(produtosExercicio18))

    println("EXERCÍCIO 18 - FORMA COM MÉTODOS")
    println(exercicio18ComMetodos(produtosExercicio18))


    // ---| TESTE EXERCÍCIO 19 |---

    println("EXERCÍCIO 19 - FORMA PURA")

    val contaPura = exercicio19Puro()

    println(contaPura.consultarSaldo())

    println("EXERCÍCIO 19 - FORMA COM MÉTODOS")

    val contaComMetodos = exercicio19ComMetodos()

    println(contaComMetodos.consultarSaldo())


    // ---| TESTE EXERCÍCIO 20 |---

    println("EXERCÍCIO 20 - FORMA PURA")
    println(exercicio20Puro())

    println("EXERCÍCIO 20 - FORMA COM MÉTODOS")
    println(exercicio20ComMetodos())
}
