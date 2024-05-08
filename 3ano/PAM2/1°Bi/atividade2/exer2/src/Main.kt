class Operacoes {
    fun somar(a:Int, b:Int): Int{
        return a + b
    }
}

fun somar(a: Int, b:Int): Int {
    return a + b
}

fun cale(a:Int, b:Int, funcao: (Int, Int) -> Int) : Int {
    return funcao(a, b)
}

fun main(args: Array<String>) {
    println(cale(2,3,Operacoes()::somar))
    println(cale(2,3,::somar))
}