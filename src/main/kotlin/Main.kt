fun main() {
    println("Gunting || Batu || Kertas")

    print("Masukan Jawaban kamu = ")
    val input = readln()
    val list = arrayOf("Gunting", "Batu", "Kertas")
    val random = list.random()
    println("Computer Menggunakan $random")
    println("Anda Menggunakan $input")

    if(input === random){
        println("Seri")
    }   else if (input === "Gunting" && random === "Kertas" ||
        input === "Batu" && random === "Gunting" ||
        input === "Kertas" && random === "Batu") {
        println("Anda Menang")
    } else {
        println("Anda Kalah")
    }

    print("Coba Ulang? (Ya/Tidak) = ")
    val masukan = readln()

    when (masukan) {
        "Ya" -> main()
        "Tidak" -> println("Sampai Jumpa")
    }
}