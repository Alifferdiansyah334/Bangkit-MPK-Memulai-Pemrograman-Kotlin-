/*
    Logika Untuk Mengelola Variable Null Pada Kotlin / Smart Cast Feature
*/


fun main() {
    
    var toogle:Boolean = true // --> Toogle untuk mengisi variable text
    var text:String? = null // --> Kondisi awal null
    
    if(toogle == true){ // --> Jika toogle dalam kondisi true maka variable text akan diisi
        text = "Toogle Kondisi True"
    } else { // --> Jika Toogle kondisi false maka text akan tetap null
        text = null
    }

    if(text != null){ // --> Mengecek apakah variable text tidak null
        println(text) // --> Jika ya maka akan di print di terminal
        println(text.length) // --> Jika ya maka akan di print di terminal
    } 
}