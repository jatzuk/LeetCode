package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 06.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class IntersectionOfTwoLinkedListsTest {
    private val intersection1 = ListNode(8)
    private val list1 = ListNode(4).apply {
        next = ListNode(1).apply {
            next = intersection1.apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    }

    private val list1_2 = ListNode(5).apply {
        next = ListNode(0).apply {
            next = ListNode(1).apply {
                next = intersection1
            }
        }
    }

    private val list3 = ListNode(4).apply { next = ListNode(5) }

    @Test
    fun intersectionHashTable() {
        assertEquals(intersection1, getIntersectionNodeHashSet(list1, list1_2))
        assertEquals(null, getIntersectionNodeHashSet(list1_2, list3))
    }

    @Test
    fun intersectionTest() {
        assertEquals(intersection1, getIntersectionNode(list1, list1_2))
        assertEquals(null, getIntersectionNode(list1_2, list3))
    }
}
