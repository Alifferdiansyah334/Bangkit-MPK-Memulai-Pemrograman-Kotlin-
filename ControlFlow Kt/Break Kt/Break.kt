/*
    Penggunaan Break dan Fungsi Break dalam Kotlin
*/

fun main(){
    tanpaBreak()
    denganContinue()
    denganBreak()
}

fun tanpaBreak(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        print(i)
    }
    println("")
}

/*
    Proses perulangan pada kode di atas akan menghasilkan nilai null. 
    Jika kita mengelola nilai tersebut, ada potensi NullPointerException di sana. Lalu bagaimana kita melewatkan 
    atau menghentikan proses perulangan jika nilai yang dihasilkan bernilai null? Nah, 
    di sini kita bisa menggunakan Break dan Continue.
*/


fun denganContinue(){
    val listOfInt2 = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt2){
        if (i == null) continue 
        print(i)
    }
    println("")
}

/*
    kode di atas kita menggunakan kata kunci continue. Jika hasil evaluasi expression yang diberikan bernilai true, 
    maka proses iterasi akan dilewatkan dan lanjut ke proses iterasi berikutnya.
*/

fun denganBreak(){
    val listOfInt3 = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt3){
        if (i == null) break
        print(i)
    }
}

/*
    Penggunaan break pada kode di atas akan langsung 
    menghentikan proses iterasi jika variabel i bernilai null.
*/