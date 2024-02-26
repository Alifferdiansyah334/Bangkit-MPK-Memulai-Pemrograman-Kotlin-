

fun main(){
    val dicodingCat = Animal()
    println("Nama : ${dicodingCat.name}, Berat : ${dicodingCat.weight}, umur : ${dicodingCat.age}, mamalia : ${dicodingCat.isMammal}") //--> memanggil properti
    dicodingCat.eat() // --> memanggil method
    dicodingCat.sleep() // --> memanggil method
    
    
    // --> Mengubah properti class
    dicodingCat.name = "Kucing Oren"
    dicodingCat.weight = 6.0
    println("Nama : ${dicodingCat.name}, Berat : ${dicodingCat.weight}, umur : ${dicodingCat.age}, mamalia : ${dicodingCat.isMammal}") //--> memanggil properti
    dicodingCat.eat() // --> memanggil method
    dicodingCat.sleep() // --> memanggil method
}

class Animal() {

    // Properti Class
    var name:String = "Kucing"
    var weight:Double = 3.2
    var age:Int = 2
    var isMammal:Boolean = true

    // Method Class
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")

    }
}