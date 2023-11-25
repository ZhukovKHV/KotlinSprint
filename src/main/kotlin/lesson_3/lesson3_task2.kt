package lesson_3

fun main() {
    var surnameUser = "Андреева"
    val nameUser = "Татьяна"
    val patronymicUser = "Сергеевна"
    val ageOfWedding: Byte = 22

    print("Возраст клиента: ")
    val ageUser = readln().toInt()

    if (ageUser < ageOfWedding) {
        println("$surnameUser $nameUser $patronymicUser $ageUser лет")
    } else {
        surnameUser = "Сидорова"
        println("$surnameUser $nameUser $patronymicUser $ageUser лет")
    }

}