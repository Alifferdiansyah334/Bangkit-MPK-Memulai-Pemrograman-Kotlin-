/*
    Kita juga dapat memeriksa apakah variabel tersebut sudah diinisialisasi dengan 
    menggunakan fungsi isInitialized seperti ini.
*/

lateinit var name2: String

fun main() {
    name = "Dicoding"
    if (::name2.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}

/*
    Jika mencoba untuk mengakses variabel yang belum terinisialisasi, Anda akan mendapat error “Exception in thread 
    "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized”.
*/