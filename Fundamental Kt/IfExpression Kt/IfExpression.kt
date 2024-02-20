/*
Penggunaan if Else pada Bahasa pemrograman Kotlin
*/



import jamBuka

val jamBuka: Int = 10

fun main() {
    IfExpression()
}

fun IfExpression() {
    if(jamBuka > 10 || jamBuka == 10) {
        println("Toko Sudah Buka")
    } else if(jamBuka > 21) {
        println("Toko Sudah Tutup")
    } else {
        println("Toko Masih Tutup")
    }
}

