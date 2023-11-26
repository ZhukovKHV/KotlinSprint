package lesson_4

fun main() {
    val weightOfAverage = 35..100
    val volumeOfAverage = 0..100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${(20 in weightOfAverage) && (80 in volumeOfAverage)}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${(50 in weightOfAverage) && (100 in volumeOfAverage)}")

}