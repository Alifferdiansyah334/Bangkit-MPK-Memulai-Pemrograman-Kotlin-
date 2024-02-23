/*
    Safe Calls akan menjamin kode yang kita tulis aman dari
    Null Pointer Exception cara penggunaan nya dengan mengganti
    tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola objek dari 
    nullable
*/

fun main() {
    val text:String? = null // --> Variable Nullable yang bernilai null
    println(text?.length) // --> Menggunakan Safe Calls

    /*
        Dengan Safe Call, Kompiler akan melewatkan proses jika objek 
        tersebut bernilai null
    */
}