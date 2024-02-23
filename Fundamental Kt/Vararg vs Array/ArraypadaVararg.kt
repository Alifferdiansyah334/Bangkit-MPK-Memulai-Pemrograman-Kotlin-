/*
    Memasukan nilai yang berbentuk array untuk parameter yang 
    ditandai dengan vararg dengan memanfaatkan spread operator
*/

fun main(){
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 30, *number, 10) //--> Pemasukan elemen array dengan spread operator (*)
}

fun sets(vararg number: Int): Unit {
    ...
}