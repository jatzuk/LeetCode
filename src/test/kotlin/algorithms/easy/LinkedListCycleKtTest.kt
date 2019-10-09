package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class LinkedListCycleKtTest {
    private val node1 = ListNode(2)
    private val case1 = ListNode(3).apply {
        next = node1.apply {
            next = ListNode(0).apply {
                next = ListNode(-4).apply {
                    next = node1
                }
            }
        }
    }

    private val node2 = ListNode(1)
    private val case2 = node2.apply { next = ListNode(2).apply { next = node2 } }

    @Test
    fun hasCycleNaive() {
        assertEquals(true, hasCycle(case1))
        assertEquals(true, hasCycle(case2))
        assertEquals(false, hasCycle(ListNode(1)))
        assertEquals(false, hasCycle(ListNode(1).apply { next = ListNode(2) }))
    }

    @Test
    fun hasCycle2Vars() {
        assertEquals(true, hasCycle2Variables(case1))
        assertEquals(true, hasCycle2Variables(case2))
        assertEquals(false, hasCycle2Variables(ListNode(1)))
        assertEquals(
            false,
            hasCycle2Variables(ListNode(1).apply { next = ListNode(2) })
        )
    }
}
