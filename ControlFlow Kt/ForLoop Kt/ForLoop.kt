/*
    For merupakan konsep perulangan pada blok yang sama selama 
    hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai 
    true. For dapat digunakan pada Ranges, Collections, Arrays dan 
    apa pun yang menyediakan iterator.
*/

fun main() {
    val ranges = 1..5 // --> variable dengan range 1 sampai 5
    for (i in ranges) { //--> untuk semua value dalam range akan di loop dan cetak
        println("value is $i")
    }
    contohdua()
}

fun contohdua(){
    val ranges2 = 1.rangeTo(10) step 3
    for (i in ranges2) {
        println("Value is $i")
    }
}

/*
    Pada kode di atas, kita menambahkan ekstensi step yang akan mengembalikan nilai baru 
    dengan tipe IntProgression dengan jarak nilai sebelumnya adalah 3.
*/

