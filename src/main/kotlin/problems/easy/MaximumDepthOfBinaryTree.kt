package problems.easy

import java.util.*
import kotlin.math.max

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 01.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun maxDepth(root: TreeNode?) = treeDepthIteratively(root) // treeDepth(root, 0)

// O(n)
// O(log(n)) worst case - O(n) (unbalanced tree)
private fun treeDepth(root: TreeNode?, depth: Int): Int {
    if (root == null) return depth
    val left = treeDepth(root.left, depth + 1)
    val right = treeDepth(root.right, depth + 1)
    return max(left, right)
}

// O(n)
// O(n)
private fun treeDepthIteratively(root: TreeNode?): Int {
    val stack = LinkedList<Pair<TreeNode?, Int>>()
    if (root != null) stack.push(Pair(root, 1))
    var depth = 0
    while (stack.isNotEmpty()) {
        val cur = stack.pop()
        val rt = cur.first
        val cd = cur.second
        if (rt != null) {
            depth = max(depth, cd)
            stack.push(Pair(rt.left, cd + 1))
            stack.push(Pair(rt.right, cd + 1))
        }
    }
    return depth
}
