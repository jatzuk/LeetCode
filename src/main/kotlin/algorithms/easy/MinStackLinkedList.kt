package algorithms.easy

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MinStackLinkedList {
    private var head: MinNode? = null

    fun push(x: Int) {
        val node = MinNode(x)
        if (head == null) head = node
        else getTail()?.second?.next = node
    }

    fun pop() {
        getTail()?.first?.next = null
    }

    fun top() = getTail()?.second?.value

    fun getMin(): Int {
        var min = Int.MAX_VALUE
        var item = head
        while (item != null) {
            if (item.value < min) min = item.value
            item = item.next
        }
        return min
    }

    /**
     * return [Pair]
     * first item holds the parent of current node
     * second item holds current node
     * */
    private fun getTail(): Pair<MinNode, MinNode?>? {
        var node = head
        var parent = node
        while (node?.next != null) {
            parent = node
            node = node.next
        }
        return parent!! to node
    }

    private inner class MinNode(val value: Int) {
        var next: MinNode? = null
    }
}


class MinStackArray {
    private val array = IntArray(10) { 0 }
    private var ptr = -1

    fun push(x: Int) {
        array[++ptr] = x
    }

    fun pop() {
        ptr--
    }

    fun top() = array[ptr]

    fun getMin(): Int {
        var min = Int.MAX_VALUE
        for (i in 0..ptr) {
            if (array[i] < min) {
                min = array[i]
            }
        }
        return min
    }
}

class MinStackArrayList {
    private val list = ArrayList<Int>()
    private var min = 0

    fun push(x: Int) {
        if (list.isEmpty()) min = x
        if (x < min) min = x
        list.add(x)
    }

    fun pop() {
        val item = list.removeAt(list.last())
        if (item == min) min = list.min()!!
    }

    fun top() = list.last()

    fun getMin() = min
}
