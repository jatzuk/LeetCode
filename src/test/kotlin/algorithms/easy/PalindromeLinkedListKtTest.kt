package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 27/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class PalindromeLinkedListKtTest {
    private lateinit var case1: ListNode
    private lateinit var case2: ListNode
    private lateinit var case3: ListNode
    private lateinit var case4: ListNode
    private lateinit var case5: ListNode

    @Before
    fun setUp() {
        case1 = ListNode(1)
        case1.next = ListNode(2)

        case2 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(2).apply {
                    next = ListNode(1)
                }
            }
        }

        case3 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(2)
            }
        }

        case4 = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(1)
            }
        }

        case5 = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(1)
                }
            }
        }
    }

    @Test
    fun isPalindrome2Pointers() {
        assertEquals(false, isPalindrome2Pointers(case1))
        assertEquals(true, isPalindrome2Pointers(case2))
        assertEquals(false, isPalindrome2Pointers(case3))
        assertEquals(true, isPalindrome2Pointers(case4))
        assertEquals(false, isPalindrome2Pointers(case5))
    }

    @Test
    fun isPalindromeArrayList() {
        assertEquals(false, isPalindromeArrayList(case1))
        assertEquals(true, isPalindromeArrayList(case2))
        assertEquals(false, isPalindromeArrayList(case3))
        assertEquals(true, isPalindromeArrayList(case4))
        assertEquals(false, isPalindromeArrayList(case5))
    }
}
