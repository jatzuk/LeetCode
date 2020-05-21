package problems.easy

import java.util.*

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

class MyStack {
    private val queue = ArrayDeque<Int?>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop() = queue.pollLast()

    fun top() = queue.peekLast()

    fun empty() = queue.isEmpty()
}
