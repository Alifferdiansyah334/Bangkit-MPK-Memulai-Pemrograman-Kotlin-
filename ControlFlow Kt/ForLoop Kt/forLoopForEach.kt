/*
    Kita menggunakan kata kunci for untuk memulai proses perulangan. Untuk tujuan yang sama, kita juga bisa memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach
*/

fun main(){
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value -> 
    println("value is $value")
    }
}