fun main(){
    val nile = 'A'
    val kkm = arrayOf('A','B','C')
    when (nile)
    {
        in kkm -> println("Lulus")
        !in kkm -> println("Ora Lulus")
    }
}