package lesson_3

import java.util.Calendar

fun main() {
    val userName = "Иван"

    val greetingMorning = "Доброе утро"
    val greetingDay = "Добрый день"
    val greetingEvening = "Добрый вечер"
    val greetingNight = "Доброй ночи"

    val timeOfMessage = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

    when (timeOfMessage) {
        in 0..5 -> print("$greetingNight, $userName!")
        in 6..11 -> print("$greetingMorning, $userName!")
        in 12..17 -> print("$greetingDay, $userName!")
        in 18..23 -> print("$greetingEvening, $userName!")
    }
}