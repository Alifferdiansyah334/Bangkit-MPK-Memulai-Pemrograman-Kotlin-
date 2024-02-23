/*
    Penggunaan Tipe data Array dalam Kotlin
*/

fun main(){
    arrayMultiJenis()
    arrayJenisSpesifik()
}

fun arrayMultiJenis(){ // --> Penggabungan Jenis Tipe Data Element Array
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)
    println(mixArray[5]) // --> Print element array dalam indeks ke 5
}

fun arrayJenisSpesifik(){ // --> Array dengan 1 Jenis Tipe Data Elements
    val integerArray = intArrayOf(1, 2, 3, 4)
    println(integerArray[2]) // --> Print element array dalam indeks ke 2
}

