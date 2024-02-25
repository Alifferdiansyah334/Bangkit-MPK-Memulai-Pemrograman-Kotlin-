/*
    Penggunaan RangeTo() dalam bahasa pemrograman kotlin
*/

fun main(){
    
    val rangeInt = 1.rangeTo(10)

    // -> Kode di atas, operator .. digantikan dengan fungsi rangeTo() untuk membuat Range .

    val downInt = 10.downTo(1)

    // -> Kode di atas menggunakan fungsi downTo() untuk menentukan nilai dengan urutan terbalik. Variabel downInt di atas mencakup nilai 10, 9, 8, 7, 6, 5, 4, 3, 2, 1.

    rangeInt.forEach { 
        print("$it")
    }
    
    println(" ")
    
    downInt.forEach {
        print("$it")
    }
}