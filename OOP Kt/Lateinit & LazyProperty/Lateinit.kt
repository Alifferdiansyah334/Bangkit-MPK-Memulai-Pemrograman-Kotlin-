/*
    Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda.
*/

lateinit var name3: String // --> mendeklarasikan variable tanpa inisialisasi

fun main() {
    name3 = "Dicoding Miaw"
    print(name3.length)  
}

/*
    Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var (tidak bisa menggunakan val). Hal ini berbeda dengan Lazy property yang nanti akan dibahas.
*/