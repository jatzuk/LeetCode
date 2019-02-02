package algorithms.easy

import java.util.*

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

fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    val list = arrayListOf<MutableList<Int>>()
//    dfs(root, 1, list)
    bfs(root, list)
    return list
}

private fun dfs(node: TreeNode?, depth: Int, list: MutableList<MutableList<Int>>) {
    if (node == null) return
    if (list.size < depth) list.add(0, arrayListOf())
    list[list.size - depth].add(node.value)
    dfs(node.left, depth + 1, list)
    dfs(node.right, depth + 1, list)
}

private fun bfs(root: TreeNode?, list: MutableList<MutableList<Int>>) {
    if (root == null) return
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val row = arrayListOf<Int>()
        for (i in 0 until queue.size) {
            with(queue.peek().left) { if (this != null) queue.add(this) }
            with(queue.peek().right) { if (this != null) queue.add(this) }
            row.add(queue.poll().value)
        }
        list.add(0, row)
    }
}
