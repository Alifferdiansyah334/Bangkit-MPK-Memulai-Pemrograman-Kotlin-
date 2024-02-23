fun main(){
    var hasilKali = perkalian(10, 20)
    println(hasilKali)

    var hasilBagi = pembagian(10, 5)
    println(hasilBagi)

    informasi("hasil perkalian", "hasil pembagian")
}

fun perkalian(nomor1: Int, nomor2: Int): Int{
    return nomor1 * nomor2
}

fun pembagian(nomor3: Int, nomor4: Int): Int{
    return nomor3 / nomor4
}

fun informasi(teks: String, teks2: String): Unit{
    println("Berikut adalah informasi dari, $teks dan $teks2")
}