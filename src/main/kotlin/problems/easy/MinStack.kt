package problems.easy

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
    private var head: ListNode? = null

//    T = O(n); S = O(n)
    fun push(x: Int) {
        val node = ListNode(x)
        if (head == null) head = node
        else getTail()?.second?.next = node
    }

//    T = O(n); S = O(n)
    fun pop() {
        val tail = getTail()
        if (tail?.second == head) head = null
        tail?.first?.next = tail?.second?.next
    }

//    T = O(n); S = O(n)
    fun top() = getTail()?.second?.value

//    T = O(n); S = O(1)
    fun getMin(): Int {
        var min = head?.value ?: Int.MAX_VALUE
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
//    T = O(n); S = O(1)
    private fun getTail(): Pair<ListNode?, ListNode?>? {
        var node = head
        var parent = node
        while (node?.next != null) {
            parent = node
            node = node.next
        }
        return parent to node
    }
}

class MinStackArray {
    private val array = IntArray(1024 * 8) { 0 }
    private var ptr = -1

//    T = O(1); S = O(1)
    fun push(x: Int) {
        array[++ptr] = x
    }

//    T = O(1); S = O(1)
    fun pop() {
        ptr--
    }

//    T = O(1); S = O(1)
    fun top() = array[ptr]

//    T - O(n); S = O(1)
    fun getMin(): Int {
        var min = Int.MAX_VALUE
        for (i in 0..ptr) if (array[i] < min) min = array[i]
        return min
    }
}

class MinStackArrayList {
    private val list = ArrayList<Int>()
    private var min = Int.MAX_VALUE

//    T = O(1); S = O(n)
    fun push(x: Int) {
        if (x < min) min = x
        list.add(x)
    }

//    T = O(n); S = O(1)
    fun pop() {
        val item = list.removeAt(list.lastIndex)
        if (min == item) min = list.min() ?: Int.MAX_VALUE
    }

//    T = O(1); S = O(1)
    fun top() = list.last()

//    T = O(1); S = O(1)
    fun getMin() = min
}
