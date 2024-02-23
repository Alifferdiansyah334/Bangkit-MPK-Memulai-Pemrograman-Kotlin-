/*
    Berikut adalah anatomi function dalam Bahasa Pemrograman Kotlin
*/

fun main(){
    println(sumFunction(10, 20))
}

private fun sumFunction(valueA: Int, valueB: Int): Int{
    return valueA + valueB
}

/*
    private fun --> Function Header =  bagian yang merupakan konstruksi dari sebuah fungsi untuk 
    menentukan perilakunya akan seperti apa. Di dalam function header terdapat visibility modifier, 
    kata kunci fun, nama, daftar parameter dan nilai kembalian dari fungsi tersebut.

    private --> Visibility Modifier = Visibility modifier atau tingkatan akses merupakan bagian spesifik dari sebuah bahasa pemrograman yang ditujukan 
    untuk mengatur bagaimana hak akses dari sebuah kelas, fungsi, properti dan variabel.

    SumFunction --> Function Name = Nama dari sebuah fungsi merupakan sebuah identifier yang akan memudahkan kita untuk menggunakan fungsi tersebut. Perlu diketahui bahwa kita tidak bisa 
    memberikan nama yang sama untuk beberapa fungsi. Untuk penamaan dari sebuah fungsi sendiri menggunakan format penulisan camelCase.

    (valueA: Int, valueB: Int) --> Function Parameter Ketika kita mendeklarasikan sebuah fungsi baru, kita bisa atau tanpa menetapkan parameter tersebut. Parameter adalah data atau nilai yang disematkan ketika fungsi tersebut dipanggil. 
    Nantinya parameter akan diproses di dalam fungsi tersebut.

    :Int --> Function Return Type = Setiap fungsi yang kita deklarasi sejatinya akan selalu mengembalikan dan nilai yang akan dikembalikan bisa kita gunakan untuk keperluan lain. Misalnya untuk dijadikan sebagai argumen untuk fungsi lainnya.
    Jika kita tidak menentukan return type, secara implisit fungsi tersebut akan mengembalikan nilai dengan tipe Unit, yaitu return type yang tidak mengembalikan nilai signifikan.

    {} return valueA + valueB --> Function Body = elanjutnya adalah function body, yang ditandai dengan curly braces. Di dalamnya kita akan menempatkan sebuah logika kode baik itu sebuah expression atau statement. 
    Seperti yang dijelaskan pada sub-modul pengenalan, jika kita menetapkan sebuah fungsi dapat mengembalikan nilai, maka kita wajib menambah sebuah baris kode yang diawali dengan kata kunci return yang diikuti 
    oleh expression untuk menetapkan nilai yang akan dikembalikan.

    Sebaliknya, jika kita tidak ingin mengembalikan nilai, kita tidak perlu menambahkannya seperti yang disebutkan di atas.

*/