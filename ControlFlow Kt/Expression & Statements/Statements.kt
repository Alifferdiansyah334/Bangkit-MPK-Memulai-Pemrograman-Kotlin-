/*
    Menggunakan If Expression sebagai Statements
*/

fun main(){
    val now:Int = 10
    val openOffice:Int = 9

    val office:String = if (now > openOffice) "Office already open" else "Office Close"
    /*
        Pada kode diatas if akan mengembalikan nilai ke dalam variable office yang berupa String
    */
    
    println(office)
}