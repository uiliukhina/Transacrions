val PERCENT: Float = 0.75F //процент комиссии
val MIN_FEE: Float = 35_00F // минимальная комиссия в копейках
val KOP_IN_RUB: Int = 100

fun main() {
    val amount0 = 45_00 // копеек
    val amount1 = 13000_00 //  копеек
    println("Перевод: " + amount0 / KOP_IN_RUB)
    println("Комиссия: " + calculateFee(amount0) / 100)
    println("Перевод: " + amount1 / 100)
    println("Комиссия: " + calculateFee(amount1) / 100)
}

/**   функция вычисления комиссии
 * Если 0,75% платежа не меньше 35р
 * комиссия составляет 0,75% платежа
 * иначе
 * комиссия составляет 35 р
 */
fun calculateFee(amount: Int): Float {
    return if (amount * PERCENT / 100 >= MIN_FEE) amount * PERCENT / 100 else MIN_FEE
}