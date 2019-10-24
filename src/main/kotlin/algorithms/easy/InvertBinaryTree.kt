package algorithms.easy

import java.util.*

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 24/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(V + E); S = O(V)
fun invertTreeBFS(node: TreeNode?): TreeNode? {
    if (node == null) return null
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(node)
    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val currentNode = queue.poll()
            val left = currentNode.left
            val right = currentNode.right
            currentNode.left = right
            currentNode.right = left
            left?.let { queue.add(it) }
            right?.let { queue.add(it) }
        }
    }
    return node
}

// T = O(V + E); S = O(V)
fun invertTreeDFS(node: TreeNode?): TreeNode? {
    node?.let {
        val left = invertTreeBFS(it.left)
        val right = invertTreeBFS(it.right)
        it.left = right
        it.right = left
    }
    return node
}
