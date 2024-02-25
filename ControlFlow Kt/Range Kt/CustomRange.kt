/*
    Mengkustom nilai range dalam bahasa kotlin
*/



fun main(){
    // Dan untuk mengubah nilai dari step bisa dilakukan ketika kita menginisialisasi nilai yang dicakup Range itu sendiri:
        
    val rangeInt2 = 1..10 step 2

    // -> Pada kode di atas kita menentukan nilai step adalah 2, maka nilai yang dicakup variabel rangeInt adalah 1, 3, 5, 7, 9.

    rangeInt2.forEach {
        print("$it")
    }
}
