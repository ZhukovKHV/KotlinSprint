package lesson_3

fun main() {
    print("Введите множитель: ")
    val multiplier = readln().toInt()

    for (i in 1..9){
        val result = multiplier * i
        println("$multiplier * $i = $result")
    }
}