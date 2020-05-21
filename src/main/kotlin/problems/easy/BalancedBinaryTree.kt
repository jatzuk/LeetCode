package problems.easy

import kotlin.math.abs
import kotlin.math.max

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun isBalanced(root: TreeNode?): Boolean {
//    if (root == null) return true
//    val ld = depth(root.left)
//    val rd = depth(root.right)
//    return abs(ld - rd) <= 1 && isBalanced(root.left) && isBalanced(root.right)

    return dfsDepth(root) != -1
}

// O(n^2)
// O(n)
private fun depth(root: TreeNode?): Int {
    if (root == null) return 0
    return 1 + max(depth(root.left), depth(root.right))
}

// O(n)
// O(n)
private fun dfsDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val ld = dfsDepth(root.left)
    if (ld == -1) return -1
    val rd = dfsDepth(root.right)
    if (rd == -1) return -1
    if (abs(ld - rd) > 1) return -1
    return 1 + max(ld, rd)
}
