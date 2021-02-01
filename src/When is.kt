fun main(){
    val nama = "Wildan"
    when(nama){
        is String -> println("Ini String")
        !is String -> println("Bukan String")
    }
}