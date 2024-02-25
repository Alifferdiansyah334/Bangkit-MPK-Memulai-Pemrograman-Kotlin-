/*
    Memeriksa apakah suatu nilai ada pada cakupan nilai range
*/

fun main(){
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 is available")
    }
    negateRange()
    rangeChar()
}

/*
    Pada kode di atas kita menggunakan kata kunci in 
    untuk memeriksa apakah 7 berada diantara kisaran 
    1 sampai 10. 
*/

fun negateRange(){
    val oneToTen = 1.rangeTo(10)
    if (11 !in oneToTen) {
        println("11 Not Available")
    }
}

/*
    Sebaliknya, kita juga bisa memeriksa apakah suatu nilai 
    tidak ada pada nilai cakupan Range tersebut. 
    Kita bisa menggunakan kata kunci !in 
*/

fun rangeChar(){
    val charRange = 'A'.rangeTo('F')
    charRange.forEach {
        print("$it")
    }
}

/*
    Penggunaan Range pada Char
*/