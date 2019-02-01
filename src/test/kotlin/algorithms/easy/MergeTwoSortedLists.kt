package algorithms.easy

import org.junit.Before
import org.junit.Ignore
import org.junit.Test

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

class MergeTwoSortedLists {
    val list = ListNode(1)
    val list1 = ListNode(1)

    @Before
    fun setUp() {
        list.next = ListNode(2).apply { next = ListNode(4) }
        list1.next = ListNode(3).apply { next = ListNode(4) }
    }

    @Ignore
    @Test
    fun nodeEquality() {
        assertNodesEquals(list, list1)
    }

    @Test
    fun mergeTwoListsTest() {
        assertMergeEquals(intArrayOf(1, 1, 2, 3, 4, 4), mergeTwoLists(list, list1))
    }

    @Throws(AssertionError::class)
    fun assertNodesEquals(n1: ListNode, n2: ListNode) {
        var node2: ListNode? = n2
        for (node1 in n1) {
            val n1v = node1.value
            val n2v = node2?.value
            if (n1v != n2v) throw AssertionError("\nExpected :$n1v\nActual   :$n2v")
            node2 = node2?.next
        }
    }

    @Throws(AssertionError::class)
    fun assertMergeEquals(array: IntArray, listNode: ListNode?) {
        for ((index, node) in listNode!!.withIndex()) {
            if (array[index] != node.value) {
                throw AssertionError("""|
                    |Expected :${array[index]}
                    |Actual   :${node.value}""".trimMargin())
            }
        }
    }
}
