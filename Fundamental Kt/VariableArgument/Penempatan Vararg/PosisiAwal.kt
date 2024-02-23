/*
    Penempatan Vararg diposisi awal
*/

fun main(){
    penempatanVararg2(10, 21, name = "Alif") // --> mengisi parameter yang diluar vararg dengan named argument
}

fun penempatanVararg2(vararg usia:Int, name:String):Unit {
    ...
}