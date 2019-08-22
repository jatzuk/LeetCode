package algorithms.easy

import org.junit.Before
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 09.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class RemoveDuplicatesFromSortedListTest {
    val list = ListNode(1)
    val list1 = ListNode(1)

    @Before
    fun setUp() {
        list.next = ListNode(2).apply { next = ListNode(3) }
        list1.next = ListNode(2).apply { next = ListNode(2).apply { next = ListNode(3) } }
    }

    @Test
    fun deleteDuplicatesTest() {
        assertNodeEquals(list, deleteDuplicates(list1)!!)
    }

    @Throws(AssertionError::class)
    fun assertNodeEquals(n1: ListNode, n2: ListNode): Boolean {
        var node2: ListNode? = n2
        for (node1 in n1) {
            val n1v = node1.value
            val n2v = node2?.value
            if (n1v != n2v) {
                throw AssertionError("""|
                    |Expected :$n1v
                    |Actual   :$n2v""".trimMargin())
            }
            node2 = node2?.next
        }
        return true
    }
}
