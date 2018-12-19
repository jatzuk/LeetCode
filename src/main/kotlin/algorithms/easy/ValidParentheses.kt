package algorithms.easy

import com.sun.jmx.remote.internal.ArrayQueue
import java.util.*

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 19.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

//  T = O(n)
//  S = O(n)
fun isValid(s: String): Boolean {
    if (s.isEmpty()) return true
    val stack = ArrayDeque<Char>(s.length)
    stack.push(s[0])
    for (i in 1 until s.length) {
        val char = s[i]
        if (char == '{' || char == '[' || char == '(') stack.push(char)
        val top = stack.peek()
        if ((top == '{' && char == '}') || (top == '[' && char == ']') || (top == '(' && char == ')')) stack.pop()
        else if (char == '}' || char == ']' || char == ')') return false
    }
    return stack.isEmpty()
}