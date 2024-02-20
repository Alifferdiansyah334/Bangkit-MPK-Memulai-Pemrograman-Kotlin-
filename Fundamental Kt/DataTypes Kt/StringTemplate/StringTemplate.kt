/*
    Cara Menyisipkan sebuah variable tanpa konkatenansi
*/

fun main() {
    denganKonkatenansi()
    denganStringTemplate()

    stringTemplateUntukExpression()
}

// Menggunakan konkatenansi untuk menggabungkan String
fun denganKonkatenansi() {
    val namaDepan:String = "Alif"
    val untukSpasi:String = " "
    val namaBelakang:String = "Ferdyansyah"
    val namaLengkap:String = namaDepan + untukSpasi + namaBelakang
    println(namaLengkap)
}

// Menggunakan String Template untuk menggabungkan String
fun denganStringTemplate() {
    val namaAdik:String = "Naomi"
    val umurAdik:Int = 14

    val informasiAdik = "Nama adik saya $namaAdik dan umur adik saya $umurAdik"
    println(informasiAdik)
}

// Menggunakan String Template untuk Expression
fun stringTemplateUntukExpression() {
    val hargaTelur:Int = 2500
    print("Harga Telur ${if (hargaTelur > 2500) "mahal" else "murah"}")
}