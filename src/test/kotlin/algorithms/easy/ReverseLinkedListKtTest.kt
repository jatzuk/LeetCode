package algorithms.easy

import algorithms.easy.RemoveLinkedListElementsKtTest.Companion.assertListNodeEquals
import org.junit.Before
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 19/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ReverseLinkedListKtTest {
    private lateinit var expected: ListNode
    private lateinit var actual: ListNode

    @Before
    fun setUp() {
        var current = ListNode(0)
        actual = current
        repeat(4) {
            current.next = ListNode(it + 1)
            current = current.next!!
        }

        current = ListNode(4)
        expected = current
        repeat(4) {
            current.next = ListNode(3 - it)
            current = current.next!!
        }
    }

    @Test
    fun reverseListIteratively() {
        assertListNodeEquals(expected, reverseListIteratively(actual))
    }

    @Test
    fun reverseListRecursively() {
        assertListNodeEquals(expected, reverseListRecursively(actual))
    }
}
