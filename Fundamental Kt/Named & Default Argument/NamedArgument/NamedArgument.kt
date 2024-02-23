/*
    Contoh penggunaan named Argumen dalam kotlin
*/



fun main(){
    val fullName = getFullName(mid = "Alif", first = "Muhammad", last = "Ferdyansyah")
    println(fullName)
}

fun getFullName(first:String, mid:String, last:String): String {
    
    return "$first $mid $last"
}
