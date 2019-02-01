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

fun levelOrderBottom(root: TreeNode?) = /*levelOrderDFS(root)*/ levelOrderBFS(root)

private fun levelOrderDFS(root: TreeNode?): List<List<Int>> {
    val stack = LinkedList<Pair<TreeNode?, Int>>()
    val map = hashMapOf<Int, MutableList<Int>>()
    if (root != null) stack.push(Pair(root, 0))

    while (stack.isNotEmpty()) {
        val elem = stack.pop()
        val ptr = elem.first
        if (ptr != null) {
            val depth = elem.second
            val row = map[depth] ?: arrayListOf()
            row.add(ptr.value)
            if (ptr.left != null) stack.push(Pair(ptr.left, depth + 1))
            if (ptr.right != null) stack.push(Pair(ptr.right, depth + 1))
            map[depth] = row
        }
    }

    val list = arrayListOf<MutableList<Int>>()
    for (i in map.size - 1 downTo 0) {
        list.add(arrayListOf())
        for (j in map[i]!!.size - 1 downTo 0) list[map.size - 1 - i].add(map[i]!![j])
    }
    return list
}

private fun levelOrderBFS(root: TreeNode?): List<List<Int>> {

}
