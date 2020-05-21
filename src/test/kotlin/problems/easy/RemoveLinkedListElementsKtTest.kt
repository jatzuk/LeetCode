package problems.easy

import org.junit.Before
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.10.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class RemoveLinkedListElementsKtTest {
    private val head: ListNode? = ListNode()
    private val actual: ListNode? = ListNode(1)
    private val base = ListNode(1).apply { next = ListNode(1) }
    private val case = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(2).apply {
                next = ListNode(1)
            }
        }
    }

    @Before
    fun setUp() {
        repeat(6) { getLastNode(head)?.next = ListNode((it + 1) % 3) }
        repeat(3) { getLastNode(actual)?.next = ListNode((it + 1) % 2 + 1) }
    }

    @Test
    fun removeElements() {
        assertListNodeEquals(actual, removeElements(head, 0))
        assertListNodeEquals(null, removeElements(base, 1))
        assertListNodeEquals(base, removeElements(case, 2))
    }

    private fun getLastNode(head: ListNode?): ListNode? {
        var current = head
        while (current?.next != null) current = current.next
        return current
    }

    companion object {
        fun assertListNodeEquals(expected: ListNode?, actual: ListNode?) {
            var ptr1 = expected
            var ptr2 = actual
            while (true) {
                if (ptr1 == null && ptr2 == null) return
                if ((ptr1 == null || ptr2 == null) || ptr1.value != ptr2.value) {
                    throw AssertionError(
                        """|
                        |Expected : ${ptr1?.value}
                        |Actual   : ${ptr2?.value}
                    """.trimMargin()
                    )
                }
                ptr1 = ptr1.next
                ptr2 = ptr2.next
            }
        }
    }
}
