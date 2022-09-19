package fundamentos

fun main() {
    var nome = "William"
    val nomeVal = "William"

    nome = "Daniel"
    //nomeVal = "Daniel" //val não pode ser reatribuida

    val idade = 24
    println(idade)

    var text = "Texto" //Quando atruibuimos uma string direto a variaveis já estamos tipando ela automaticamente
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}