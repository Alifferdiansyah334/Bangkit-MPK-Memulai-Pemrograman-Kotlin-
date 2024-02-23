/*
    Penggunaan Default Argument dalam Kotlin
*/

fun main(){
    val fullDescription = cityDescription(city = "Bandung") // --> Karena disini diganti bandung jadi value paramter city menjadi bandung
    println(fullDescription)
}

fun cityDescription(
        city:String = "Jakarta", // --> Default nya Jakarta
        suhu:String = "Panas",
        jumlahKendaraan:String = "Padat"):String {
    return "$city bersuhu $suhu dan jumlah kendaraan $jumlahKendaraan"
}