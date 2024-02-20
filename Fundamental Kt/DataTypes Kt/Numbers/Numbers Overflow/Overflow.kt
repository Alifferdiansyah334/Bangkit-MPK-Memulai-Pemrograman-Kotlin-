/*
    Jika kita memasukan nilai melebihi nilai maksimal yang dapat disimpan, maka akan terjadi overflow. 
    Nilai yang akan dikembalikan adalah nilai minimal yang dapat disimpan.
*/

fun main(){
    val maximumInt:Int = Int.MAX_VALUE
    val overflowTest:Int = Int.MAX_VALUE + 1

    println(maximumInt)
    println(overflowTest)
}