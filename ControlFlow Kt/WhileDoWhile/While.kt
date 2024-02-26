/*
    Penggunaan While dalam kotlin
*/


fun main(){
    var counter = 1
    while (counter <= 7){
        println("Print ke $counter") //--> akan print ini sampai counter terpenuhi
        counter++ //--> nilai counter akan diincrement setiap iterasi
    }
}

/*
    While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu. Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.
*/