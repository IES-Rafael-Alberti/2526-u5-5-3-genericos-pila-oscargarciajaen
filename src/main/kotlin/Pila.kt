import org.jetbrains.annotations.Nullable
import kotlin.collections.Iterator

class Pila<T> : Iterable<T> {
    val pila: MutableList<T> = mutableListOf()

    fun push(elemento: T){
        pila.add(elemento)
    }

    fun pop(): T{
        val ultimo = pila.last()
        pila.removeLast()
        return ultimo
    }

    fun peek(): T{
        return pila.last()
    }

    fun isEmpty(): Boolean{
        if (pila.size == 0){
            return true
        } else {
            return false
        }
    }

    fun size(): Int{
        var contadorElementos = 0
        for (i in pila){
            contadorElementos += 1
        }
        return contadorElementos
    }

    override fun iterator(): Iterator<T> {
        return PilaIterator(pila.toMutableList())
    }
}

