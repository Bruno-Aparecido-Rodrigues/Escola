import kotlin.math.pow
import kotlin.math.sqrt

// Função para calcular a área do retângulo
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

// Função para calcular a área do triângulo equilátero
// pow é exponenciação e sqrt é a raiz quadrada
fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (lado.pow(2) * sqrt(3.0)) / 4
}

// Função para calcular a área do triângulo isósceles
fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

// Função para calcular a área do triângulo escaleno
fun calcularAreaTrianguloEscaleno(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

// Função para calcular a área da circunferência
fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

// Função para calcular a área do losango
fun calcularAreaLosango(diagonal1: Double, diagonal2: Double): Double {
    return (diagonal1 * diagonal2) / 2
}

// Função para calcular a área do trapézio
fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {

    println("Área do Retângulo: ${calcularAreaRetangulo(5.0, 8.0)}")
    println("Área do Triângulo Equilátero: ${calcularAreaTrianguloEquilatero(4.0)}")
    println("Área do Triângulo Isósceles: ${calcularAreaTrianguloIsosceles(5.0, 6.0)}")
    println("Área do Triângulo Escaleno: ${calcularAreaTrianguloEscaleno(7.0, 3.0)}")
    println("Área da Circunferência: ${calcularAreaCircunferencia(3.0)}")
    println("Área do Losango: ${calcularAreaLosango(6.0, 8.0)}")
    println("Área do Trapézio: ${calcularAreaTrapezio(6.0, 4.0, 5.0)}")
}