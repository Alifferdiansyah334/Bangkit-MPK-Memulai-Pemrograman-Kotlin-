/*
    Menggunakan Cara Konversi Untuk Menjumlahkan dua tipe data yang berbeda
*/

fun main(){
    val tipeDataInt = 10
    val tipeDataString = "15"

    val penjumlahan = tipeDataInt + tipeDataString.toInt()

    println(penjumlahan)
}