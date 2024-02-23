/*
    Penggunaan Array vs Vararg dalam Kotlin
*/


fun main(){
    
    val numArray = arrayOf(10, 20, 30, 40)
    penggunaanArray(numArray)

    penggunaanVararg(10, 20, 30, 40)
}

fun penggunaanArray(numArray:Array<Int>) {
    ...
}

fun penggunaanVararg(vararg numVararg:Number){
    ...
}