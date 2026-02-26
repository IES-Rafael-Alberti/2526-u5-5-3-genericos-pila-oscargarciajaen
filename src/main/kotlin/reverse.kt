fun <T> reverse(lista: List<T>): MutableList<T>{
    val listaInvertida: MutableList<T> = mutableListOf<T>()
    for (i in lista.size-1 downTo 0){
        listaInvertida.add(lista[i])
    }
    return listaInvertida
}