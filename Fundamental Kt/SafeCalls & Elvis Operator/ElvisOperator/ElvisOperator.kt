/*
    Elvis operator memungkinkan kita untuk menetapkan default
    value atau nilai dasar jika objek bernilai null
*/

fun main(){
    denganElvisOperator()
    tanpaElvisOperator()
}

fun denganElvisOperator(){
    
    val text: String? = null //--> Variable nullable yang bersifat null
    val textLength = text?.length ?: 7 // --> textlength bernnilai variable text namun jika bernilai null maka textLength bernilai 7
    
    println(textLength)
}

fun tanpaElvisOperator(){
    
    val text2: String? = null
    val text2Length = if(text2 != null) text2.length else 7 // --> Jika tanpa menggunakan ElvisOperator

    println(text2Length)
}