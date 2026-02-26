import kotlin.collections.Iterator

class PilaIterator<T>(val pila: MutableList<T>): Iterator<T> {

    override fun next(): T {
        val next = pila.last()
        pila.removeLast()
        return next
    }


    override fun hasNext(): Boolean {
        if (this.pila.size > 0) {
            return true
        } else {
            return false
        }
    }
}