package fundamentos

class MinhaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int)
{
    companion object {
        fun criaComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gustavo", "Rua Teste", 24)
        }

        fun criaComSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int)
{
    fun criaComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua Teste", 24)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("Gustavo", "Rua Teste", 24).criaComValoresPadrao()

    var minhaClass = MinhaClasse.criaComValoresPadrao()

    var minhaClasseFromSegundaClasse = MinhaClasse.criaComSegundaClasse(SegundaClasse("William", "Rua teste", 33))
}