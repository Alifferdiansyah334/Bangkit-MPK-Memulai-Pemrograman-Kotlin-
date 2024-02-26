/*
    Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null 
    dan menunda inisialisasi. Berikut ini contoh kodenya.
*/

val name1: String by lazy {
    "Dicoding"
}

fun main() {
    print(name1.length)
}

/*
    Dalam menggunakan lazy property, Anda harus menggunakan keyword val. Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
*/

/*
    Jika dilihat proses inisialisasi harus di dalam block lazy, tidak bisa di tempat lain. Lalu, apa bedanya dengan inisialisasi seperti biasanya? Nah, hal ini terkait peningkatan performa dengan mengatur memori.
    Membuat object String seperti ini memang tidak membutuhkan memori yang banyak. Namun, bayangkan jika yang diinisialisasi adalah class yang sangat kompleks, tentunya ini akan memakan memori dan menghabiskan waktu di awal untuk program bisa berjalan. Nah, dengan menggunakan lazy initialization, variabel tersebut baru akan diinisialisasi ketika benar-benar dibutuhkan saja.
*/