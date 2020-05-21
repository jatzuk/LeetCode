package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 23/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ImplementStackUsingQueuesKtTest {
    private lateinit var stack: MyStack

    @Before
    fun setUp() {
        stack = MyStack()
        stack.push(5)
    }

    @Test
    fun myStackTest() {
        with(stack) {
            assertEquals(5, pop())
            assertEquals(null, pop())
            push(4)
            push(3)
            push(2)
            assertEquals(2, pop())
            assertEquals(3, pop())
            assertEquals(false, empty())
            assertEquals(4, top())
        }
    }
}
