fun main(){
    val pila: Pila<String> = Pila<String>()
    pila.push("one")
    pila.push("two")
    pila.push("three")
    pila.push("four")
    val numbersRev = reverse(pila.pila)
    if (listOf("four", "three", "two", "one") != numbersRev)
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}