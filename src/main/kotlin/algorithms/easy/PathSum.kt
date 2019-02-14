package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 14.02.2019
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
fun hasPathSum(root: TreeNode?, sum: Int): Boolean = root?.let {
    (sum - it.value == 0 && it.left == null && it.right == null) ||
            (hasPathSum(it.left, sum - it.value) || hasPathSum(it.right, sum - it.value))
} ?: false
