/*
    Secara standar ketika properti pada kelas dibuat mutable, maka Kotlin akan menghasilkan fungsi getter dan setter pada properti tersebut. Jika properti pada sebuah kelas dibuat read-only, 
    Kotlin hanya akan menghasilkan fungsi getter pada properti tersebut. 
    Namun sebenarnya Anda bisa membuat fungsi getter dan setter secara manual jika pada kasus tertentu Anda perlu untuk override fungsi tersebut.
*/

class Animal{
    var name:String = "Dicoding miaw"
    get(){
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value){
        println("Fungsi Setter terpanggil")
        field = value
    }
}

fun main(){
    val dicodingCat = Animal()
    println("Nama : ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama : ${dicodingCat.name}")
}