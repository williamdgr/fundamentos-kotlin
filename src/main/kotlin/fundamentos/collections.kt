package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 6)
    val pares = lista.filter { it % 2 == 0 }.first()
    println(pares)

    println("--------------------------")
    lista.forEach {
        println(it)
    }

    println("--------------------------")
    for (numero in lista) {
        println(numero)
    }

    println("--------------------------")
    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    println("--------------------------")
    var lista2 = mutableListOf(1,2,3,4,5)
    lista2.add(8)
    lista2.removeAt(0)
    lista2.remove(3)
    lista2[0] = 20

    lista2.sort()
    println(lista2)

    lista2.shuffle()
    println(lista2)


    println("--------------------------")
    var setNumeros = setOf(1,2,2,3) //A Diferenca da lista é o que o set não aceita valores iguais (duplicados)
    println(setNumeros)

    var setNumerosMutable = mutableSetOf(1,2,2,3)
    println(setNumerosMutable.contains(2))

    println("--------------------------")

    var mapNomeIdade = mapOf("William" to 30, "Gustavo" to 33)
    println(mapNomeIdade)

    var mapNomeIdadeMutable = mutableMapOf("William" to 30, "Gustavo" to 33)
    mapNomeIdadeMutable.put("Bruno", 23)
    println(mapNomeIdadeMutable)

    mapNomeIdadeMutable["Bruno"] = 80
    println(mapNomeIdadeMutable)

    mapNomeIdadeMutable.remove("William")
    println(mapNomeIdadeMutable)





}