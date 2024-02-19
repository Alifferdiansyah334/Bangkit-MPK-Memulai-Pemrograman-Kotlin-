/*
    Penggunaan raw string memungkinkan penulisan multi line tanpa
    harus menggunakan escaped string berulang ulang
*/

fun main() {
    val line: String = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
        Line 6
        Line 7
        Line 8
        Line 9
        Line 10
    """.trimIndent()

    print(line)
}