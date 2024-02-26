/*
    Kita juga dapat mengubah tipe data dengan mengakses fungsi yang tersedia dari sebuah objek String. 
*/

fun main() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt)
    println(someDouble)
}