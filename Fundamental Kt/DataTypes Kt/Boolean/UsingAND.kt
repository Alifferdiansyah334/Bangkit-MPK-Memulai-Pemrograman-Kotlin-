/*
Penggunaan Operator AND atau Conjunction pada Kotlin
*/

import jamTutupToko

val jamBukaToko:Int = 9
val jamTutupToko:Int = 21
val JamTerkini:Int = 10


fun main(){
    conjuctionOperator()
}

fun conjuctionOperator(){

    var StatusToko:Boolean = false
    
    if(JamTerkini >= jamBukaToko && JamTerkini <= jamTutupToko ) {
        StatusToko = true
    } else {
        StatusToko = false
    }
    
    println("Toko Sedang Buka : $StatusToko")
}