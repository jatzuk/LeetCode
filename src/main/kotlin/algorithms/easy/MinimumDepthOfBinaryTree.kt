package algorithms.easy

import kotlin.math.min

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 13.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// O(V + E)
// O(V)
fun minDepth(root: TreeNode?): Int {
    return root?.let {
        val left = minDepth(root.left)
        val right = minDepth(root.right)
        if (left == 0 || right == 0) left + right + 1 else min(left, right) + 1
    } ?: 0
}
