package fundamentos

fun main() {

    var lista : List<Int?> = listOf(1, 2 , null, 3) // lista não pode ser nulo, mas os elementos podem

    var listaNullable : List<Int?>? = null //lista pode ser nula e elementos podem ser nulos tbm

    var nome: String? = "William"

    var tamanho: Int = nome?.length ?: 0

    println(tamanho)

    val toShort = nome!!.length.toShort() //!! garante que mesmo nome sendo nullable nesse momento ele não será nulo

    println("------------------------------------")

    val pessoa : Pessoa? = null
    println(pessoa!!.nome)
}