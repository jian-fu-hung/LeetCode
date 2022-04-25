package PeekingIterator

import java.util.*

class PeekingIterator(iterator:Iterator<Int>):Iterator<Int> {

    var stack: Queue<Int> = LinkedList<Int>()
    init {
        for(i in iterator){
            stack.add(i)
        }
    }

    fun peek(): Int {
        return stack.peek()
    }

    override fun next(): Int {
        return stack.poll()
    }

    override fun hasNext(): Boolean {
        return !stack.isEmpty()
    }
}
