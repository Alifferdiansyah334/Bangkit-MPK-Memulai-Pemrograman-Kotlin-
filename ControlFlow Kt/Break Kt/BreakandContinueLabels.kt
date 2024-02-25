/*
    Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label. Label pada Kotlin memiliki sebuah identifier yang 
    diikuti dengan tanda @. 
    Contoh dari sebuah label adalah foo@ atau bar@.
*/

fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")
    

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }

    }
}

/*
    Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label. break akan 
    menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil.
*/