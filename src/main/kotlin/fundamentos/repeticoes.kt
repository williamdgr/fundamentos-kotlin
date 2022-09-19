package fundamentos

fun main() {
//    printa1a10()
//    printa10a1()
//    printaPar1a10()
//    whileMenorQue10()
//    doWhileMenorQue10()
//    printaRange(10 , 50)
}

fun whileMenorQue10() {
    var x = 0
    while(x < 10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}

fun printa1a10() {
    for (numero in 1 .. 10) {
        println(numero)
    }
}

//Só tinha no java 11 eu estava usando o 8
fun printa10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for (numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    for (numero in inicio .. fim) {
        println(numero)
    }
}