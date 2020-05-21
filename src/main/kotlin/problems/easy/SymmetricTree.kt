package problems.easy

import java.util.*

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 13.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun isSymmetric(root: TreeNode?): Boolean {
    return root == null || isSymmetricRecursively(root.left, root.right)
}

// O(n); n - number of all nodes
// O(n)
private fun isSymmetricRecursively(left: TreeNode?, right: TreeNode?): Boolean {
    return if (left == null || right == null) left == right
    else if (left.value != right.value) false
    else isSymmetricRecursively(left.left, right.right) && isSymmetricRecursively(left.right, right.left)
}

// O(n)
// O(n)
fun isSymmetricIteratively(root: TreeNode?): Boolean {
    if (root == null) return true
    val stack = LinkedList<TreeNode?>().apply {
        push(root.left)
        push(root.right)
    }

    while (stack.isNotEmpty()) {
        val left = stack.pop()
        val right = stack.pop()
        if (left == null && right == null) continue
        if (left == null || right == null || left.value != right.value) return false
        stack.push(left.left)
        stack.push(right.right)
        stack.push(left.right)
        stack.push(right.left)
    }
    return true
}
