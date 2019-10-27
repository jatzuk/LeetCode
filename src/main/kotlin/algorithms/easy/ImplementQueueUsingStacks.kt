package algorithms.easy

import java.util.*

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

class MyQueue {
    private val stack: Deque<Int> = ArrayDeque()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop(): Int? = stack.pollLast()

    fun peek(): Int? = stack.peekLast()

    fun empty() = stack.isEmpty()
}
