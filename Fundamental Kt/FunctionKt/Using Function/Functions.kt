/*
    Penggunaan Function Dalam Bahasa Pemrograman Kotlin
*/

fun main() {
    val user = setUser("Alif", 19) // --> Memasukan nilai pada variable name dan age yang terdapat pada function setUser dan memasukan Nilai return yang ada pada function SetUser kedalam variable user
    println(user) // --> Print hasil return SetUser Ke Terminal
 
    printUser("Alif") // --> Mengisi variable name pada function printUser dengan String "Alif"
}

fun setUser(name: String, age: Int):String { // --> Function SetUser yang memiliki variable name dengan tipedata String dan Variable age dengan tipedata Integer dan Hasil Return Yang Berupa String
    return "Your name is $name, and you $age years old"
}

/*
    Unit = Jika kita tidak ingin fungsi yang dibuat mengembalikan nilai, kita bisa menggunakan Unit sebagai tipe nilai kembaliannya. Contohnya seperti berikut:
*/

fun printUser(name: String): Unit{
    print("Your name is $name")
}