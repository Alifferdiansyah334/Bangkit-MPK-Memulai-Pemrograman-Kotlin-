/*

    Escaped String memungkinkan kita mengurangi ambiguitas nilai yang 
    berada dalam sebuah string, seperti ketika ingin menambahkan petik 
    pada output String, menambahkan baris baru, menambahkan tab, single quote
    karakter double backslash dll

*/

// Menambahkan Single Quote pada String
fun main() {
    val singleQuote: String = "Alif\'Ferdyansyah\'"
    println(singleQuote)
    doubleQuote()
    tabEscapedString()
    newLine()
    backSlash()
}

// Menambahkan Double quote pada String
fun doubleQuote() {
    val TandaPetikPadaString = "Alif\"Ferdyansyah\""
    println(TandaPetikPadaString)
}

// Menambahkan Tab pada String
fun tabEscapedString() {
    val tabTest: String = "Alif\tFerdyansyah"
    println(tabTest)
}

// Menambahkan NewLine pada String
fun newLine(){
    val newLineTest: String = "Alif\nFerdyansyah"
    println(newLineTest)
}

// Menambahkan Backslash pada String
fun backSlash() {
    val backSlashTest: String = "Alif\\Ferdyansyah\\"
    println(backSlashTest)
}

