fun main() {
    val amount = 4000_00
    val commission = if ((amount * 75 / 10_000) < 35_00) 35_00 else amount * 75 / 10_000
    println("Сумма перевода: $amount")
    println("Комиссия: $commission")
}