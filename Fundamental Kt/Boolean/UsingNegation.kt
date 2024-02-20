

import jarakRumahAndi/*
    Penggunaan Operator NOT atau Negasi pada Bahasa Pemrograman Kotlin
*/

val andiSedangBohong = false
val jarakRumahAndi = 100
lateinit var statusAndi:String

fun main() {
    NegationOperator()
}

fun NegationOperator(){

    var statusRumahAndiDekat:Boolean = false

    if(andiSedangBohong != true) { // --> Penggunaan Negasi Untuk Perbandingan Nilai pada Variable
        statusAndi = "Andi Sedang Jujur"
    } else if(andiSedangBohong != false) {
        statusAndi = "Andi Sedang Bohong"
    } else {
        statusAndi = "Tidak Tahu"
    }

    if(jarakRumahAndi >= 100 || jarakRumahAndi == 100) {
        statusRumahAndiDekat = false
    } else {
        statusRumahAndiDekat = true
    }

    if(!statusRumahAndiDekat){ //--> Penggunaan Negasi untuk membalikan parameter variable statusRumahAndiDekat [jika true menjadi false / jika false menjadi true]
        println("Rumah Andi Jauh dan $statusAndi")
    } else {
        println("Rumah Andi Tidak Jauh dan $statusAndi")
    }
}