/*
    Penggunaan Operator OR atau Disjungsi pada Bahasa Pemrograman Kotlin
*/

val umurAndi:Int = 19
val uangAndi = 1000000


fun main(){
    disjunctionOperator()
}

fun disjunctionOperator(){
    if(umurAndi == 19 || uangAndi >= 10000000) {
        println("Andi Sudah Dewasa Dan Memiliki Banyak Uang") // --> Output nya tetap ini karena pada operator OR jika Satu Output bernilai true/1 makan hasilnya akan true/1
    } else {
        println("Andi Sudah Dewasa Teteapi Tidak Memiliki Banyak Uang")
    }
}