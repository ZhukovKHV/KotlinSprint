package lesson_4

fun main() {
    val tableOfRestaurant = 13
    val tableFreeToday = 0
    val tableFreeTomorrow = 4

    println("Доступность столиков на сегодня: ${tableFreeToday > 0}")
    println("Доступность столиков на завтра: ${tableOfRestaurant - tableFreeTomorrow > 0}")

}