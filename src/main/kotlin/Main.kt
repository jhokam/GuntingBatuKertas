fun main() {
    println("Gunting || Batu || Kertas")

    print("Masukan Jawaban kamu = ")
    val input = readln()
    val list = arrayOf("Gunting", "Batu", "Kertas")
    val random = list.random()
    println("Computer Menggunakan $random")
    println("Anda Menggunakan $input")

    if (input == "Batu" && random == "Gunting") {
         println("Anda Menang")
    } else if (input == "Batu" && random == "Batu") {
        println("Sama")
    } else if (input == "Batu" && random == "Kertas") {
        println("Anda Kalah")
    }  else  if (input == "Gunting" && random == "Kertas") {
        println("Anda Menang")
    } else if (input == "Gunting" && random == "Gunting") {
        println("Sama")
    } else if (input == "Gunting" && random == "Batu") {
        println("Anda Kalah")
    }   else if (input == "Kertas" && random == "Batu") {
        println("Anda Menang")
    } else if (input == "Kertas" && random == "Kertas") {
        println("Sama")
    } else if (input == "Kertas" && random == "Gunting") {
        println("Anda Kalah")
    } else {
        println("Tolong Masukan jawaban yang benar!!")
    }
    print("Coba Ulang? (Ya/Tidak) = ")
    val masukan = readln()

    when (masukan) {
        "Ya" -> main()
        "Tidak" -> println("Sampai Jumpa")
    }
}