/*
    Menggunakan Elvis Operator dalam Operasi aritmatika
*/

fun main(){
    println(OperasiAritmatikaDenganElvis(1, 2, null))
}

fun OperasiAritmatikaDenganElvis(ValueA: Int, ValueB: Int, ValueC: Int?): Int{
    return ValueA + ValueB - (ValueC ?: 8)
}