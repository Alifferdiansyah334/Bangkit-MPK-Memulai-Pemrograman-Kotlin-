/*
    Nullable type adalah suatu cara penanganan NPE (NullPointerException) yang sering terjadi 
    jika ingin mengelola atau mengakses variable yang belum diinisialisasikan
*/

fun main(){
//  tanpaNullable()
    denganNullable()
}

/*
fun tanpaNullable(){
    val text:String = null // --> Jika Program dijalankan maka akan error
}
*/

fun denganNullable(){
    var text:String? = null // --> Null Safety || Program bisa berjalan tanpa menginisalisasi variable
                            

    val namaDepan:String = "Alif"
    val namaBelakang:String = " Ferdyansyah"
    
    text = namaDepan + namaBelakang  // --> Mengisi nilai  variable text yang sebelumnya kosong/null

    println(text) // --> Mengambil nilai variable text untuk print di layar
    
}