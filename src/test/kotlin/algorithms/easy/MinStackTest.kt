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

class MinStackTest {
    @Test
    fun arrayStackTest() {
        with(MinStackArray()) {
            push(-2)
            push(0)
            push(-3)
            assertEquals(-3, getMin())
            pop()
            assertEquals(0, top())
            assertEquals(-2, getMin())

            push(-2)
            push(0)
            push(-1)
            assertEquals(-2, getMin())
            assertEquals(-1, top())
            pop()
            assertEquals(-2, getMin())
        }
    }

    @Test
    fun linkedListTest() {
        with(MinStackLinkedList()) {
            push(-2)
            push(0)
            push(-3)
            assertEquals(-3, getMin())
            pop()
            assertEquals(0, top())
            assertEquals(-2, getMin())

            push(-2)
            push(0)
            push(-1)
            assertEquals(-2, getMin())
            assertEquals(-1, top())
            pop()
            assertEquals(-2, getMin())
        }
    }

    @Test
    fun arrayListTest() {
        with(MinStackArrayList()) {
//            push(-2)
//            push(0)
//            push(-3)
//            assertEquals(-3, getMin())
//            pop()
//            assertEquals(0, top())
//            assertEquals(-2, getMin())
//
//            push(-2)
//            push(0)
//            push(-1)
//            assertEquals(-2, getMin())
//            assertEquals(-1, top())
//            pop()
//            assertEquals(-2, getMin())

            push(-2)
            push(0)
            push(-3)
            getMin()
            pop()
            top()
            getMin()
        }
    }
}
