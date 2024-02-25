/*
    Penggunaan Range dalam kotlin
*/

fun main(){
    val rangeInt = 1..10
    print(rangeInt.step)

    // Kode diatas menggunakan operator .. untuk membuat Range. Variabel rangeInt di atas mencakup nilai 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. Jarak antara dua nilai yang dicakup, ditentukan oleh step. Secara default, step bernilai 1. Untuk mendapatkan step kita bisa menggunakan properti step
    
    customRange()
}

fun customRange(){
    fun main(){
        // Dan untuk mengubah nilai dari step bisa dilakukan ketika kita menginisialisasi nilai yang dicakup Range itu sendiri:
        val rangeInt2 = 1..10 step 2
        rangeInt2.forEach {
            print("$it")
        }
        println(rangeInt2.step)
    }
}

