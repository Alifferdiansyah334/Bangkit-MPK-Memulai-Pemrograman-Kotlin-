/*
    mengakses indeks untuk setiap elemen yang ada pada ranges dengan memanfaatkan fungsi withIndex()
*/

fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()){
        println("value $value with index $index")
    }
}