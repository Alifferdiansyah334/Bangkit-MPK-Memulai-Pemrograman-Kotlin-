
/*
    Melakukan Konversi Tipe data Numbers dalam kotlin
*/

fun main(){
    val byteNumber:Byte = 10 
    val intNumber :Int = byteNumber.toInt()
    
    println("$byteNumber Tipe Data Sebelum Konversi = " + byteNumber::class.simpleName)
    println("$intNumber Tipe Data Setelah Konversi = " + intNumber::class.simpleName)
}