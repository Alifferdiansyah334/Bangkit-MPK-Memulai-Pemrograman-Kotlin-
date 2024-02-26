/*
    Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean merupakan sebuah Object. Hal ini berbeda dengan bahasa pemrograman lain. Maka dari itu, terdapat sebuah istilah yang terkenal di  Kotlin, yaitu “Object Everywhere”.
*/

fun main(){
    val someString = "Dicoding"

    /*
        Pada kode tersebut kita melakukan pembuatan variabel yang juga merupakan sebuah objek dengan nama someString. Objek tersebut merupakan realisasi dari kelas String, maka objek someString memiliki fungsi dan properti yang merupakan anggota dari kelas String.
    */

    /*
        Berikut adalah beberapa fungsi yang dapat digunakan pada objek String
    */

    println(someString.reversed())  // -> membuat urutan huruf menjadi terbalik
    println(someString.uppercase()) // -> membuat huruf menjadi kapital
    println(someString.lowercase()) // -> membuat huruf menjadi kecil
}