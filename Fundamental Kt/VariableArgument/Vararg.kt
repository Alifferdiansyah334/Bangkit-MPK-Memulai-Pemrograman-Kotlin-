/*
    Penggunaan Variable Argumen dalam kotlin

    dengan vararg kita bisa menyederhanakan beberapa parameter yang memiliki
    tipe data yang sama menjadi parameter tunggal

    Berikut contohnya
*/

fun main(){
    val number = sumNumber(10, 20, 30, 40)
    println(number)
    
    val numbers = getNumberSize(10, 20, 30, 40, 50)
    println(numbers)
}

fun sumNumber(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg numbers: Int): Int{
    return numbers.size
}