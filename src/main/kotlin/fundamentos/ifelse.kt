package fundamentos

fun main() {

    println(parOuImpar(2))
    println(parOuImpar(3))

    resultadoDaNota(7)
    resultadoDaNota(5)
    resultadoDaNota(3)
}

fun parOuImpar(numero: Int) : String{
   return if(numero % 2 == 0) {
       "Par"
   } else {
       "Ímpar"
   }
}

//se a nota for >= 6 -> Passou
//se a nota for >= 4 -> Recuperacao
//se a nota for < 4  -> reprovou
fun resultadoDaNota(nome: Int) {
    if (nome >= 6) {
        println("Passou")
    } else if (nome <= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }

}

