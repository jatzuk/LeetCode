package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 19.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class ListNode(var value: Int = 0) : Iterable<ListNode> {
    var next: ListNode? = null

    override fun iterator(): Iterator<ListNode> {
        return object : Iterator<ListNode> {
            private var current: ListNode? = this@ListNode

            override fun hasNext() = current != null

            override fun next(): ListNode {
                val ptr = current
                current = current?.next
                return ptr!!
            }
        }
    }
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) return null
    var node1 = l1
    var node2 = l2
    val head = ListNode(-1)
    var ptr = head
    while (node1 != null && node2 != null) {
        if (node1.value > node2.value) {
            ptr.next = node2
            node2 = node2.next
        } else {
            ptr.next = node1
            node1 = node1.next
        }
        ptr = ptr.next!!
    }
    ptr.next = node1 ?: node2
    return head.next
}
