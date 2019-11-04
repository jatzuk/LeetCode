package util

import algorithms.easy.TreeNode
import java.util.*

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 04/11/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun buildBinaryTreeFromUnsortedArray(array: Array<Int?>): TreeNode {
    val head = TreeNode(array[0]!!)
    val queue: Deque<TreeNode> = ArrayDeque()
    queue.offer(head)
    for (i in 1 until array.lastIndex step 2) {
        if (queue.isEmpty()) break
        val parent = queue.pop()
        array[i]?.let {
            parent.left = TreeNode(it)
            queue.offer(parent.left)
        }
        array[i + 1]?.let {
            parent.right = TreeNode(it)
            queue.offer(parent.right)
        }
    }
    return head
}

fun TreeNode.printTree() {
    left?.printTree()
    print("$value ")
    right?.printTree()
}

fun assertTreeEquals(expected: TreeNode?, actual: TreeNode?): Boolean {
    if (expected == null && actual == null) return true
    if (expected?.value != actual?.value) throw AssertionError(
        """|
            |Expected:  ${expected?.value}
            |Actual:    ${actual?.value}""".trimMargin()
    )
    return assertTreeEquals(expected?.left, actual?.left) && assertTreeEquals(expected?.right, actual?.right)
}
