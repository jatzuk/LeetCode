package problems.easy

import java.util.*
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

fun minDepth(root: TreeNode?) = dfs(root) // bfs(root)

// O(V + E)
// O(V)
private fun dfs(root: TreeNode?): Int = root?.let {
    val left = dfs(root.left)
    val right = dfs(root.right)
    if (left == 0 || right == 0) left + right + 1 else min(left, right) + 1
} ?: 0

// O(V + E)
// O(V)
private fun bfs(root: TreeNode?) = root?.let {
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    var depth = 0
    while (queue.isNotEmpty()) {
        depth++
        repeat(queue.size) {
            val left = queue.peek().left
            val right = queue.peek().right
            if (left == null && right == null) return depth
            with(queue) {
                left?.let { add(it) }
                right?.let { add(it) }
                poll()
            }
        }
    }
    depth
} ?: 0
