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

class ImplementQueueUsingStacksKtTest {
    private lateinit var queue: MyQueue

    @Before
    fun setUp() {
        queue = MyQueue()
        queue.push(1)
    }

    @Test
    fun queueTest() {
        assertEquals(1, queue.pop())
        assertEquals(null, queue.peek())
        assertEquals(true, queue.empty())
        queue.push(2)
        queue.push(4)
        assertEquals(2, queue.pop())
        assertEquals(4, queue.pop())
    }
}
