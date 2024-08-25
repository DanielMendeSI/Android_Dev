fun main() {

    var nome_livro = ""
    var pags = 0
    var pags_lidas = 0

    println("Digite nome o do livro")
    while (nome_livro == ""){
        nome_livro = readln()
        if (nome_livro == "") println("Invalido")
    }

    while (pags == 0) {
        println("digite o numero de paginas do livro:")
        pags = readln().toIntOrNull() ?: 0
        if (pags == 0) println("Invalido")
    }


    while (pags_lidas == 0) {
        println("digite a quantidade de paginas lidas:")
        pags_lidas = readln().toIntOrNull() ?: 0
        if (pags_lidas == 0) println("Invalido")
    }

    println("Nome do livro:$nome_livro")
    println("porcentagem de paginas lidas: ${100*pags_lidas/pags}%")

}