package fundamentos

fun main() {
    dizOi(retornaNome(), 33)
    dizOi(idade = 24, nome = retornaNome())
    dizOi(retornaNome())
}

fun retornaNome(): String {
    return "William"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}