/*
    Penggunaan When Expression dalam kotlin
*/

fun main(){

    val value = 7 // --> Nilai variable value adalah 7 
 
    when(value){
        6 -> println("Value nya 6")
        7 -> println("Value nya 7") // --> maka ketika nilai variable 7 ini yang akan diekseksui
        8 -> println("Value nya 8")
    }
}