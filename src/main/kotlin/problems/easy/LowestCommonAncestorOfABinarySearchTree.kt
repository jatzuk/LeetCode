package problems.easy

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 28/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(n)
fun lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode =
        if (p.value < root.value && q.value < root.value) lowestCommonAncestor(root.left!!, p, q)
        else if (p.value > root.value && q.value > root.value) lowestCommonAncestor(root.right!!, p, q)
        else root

// T = O(n); S = O(1)
fun lowestCommonAncestorIterative(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode {
    var current: TreeNode? = root
    while (current != null) {
        current = if (p.value < current.value && q.value < current.value) current.left
        else if (p.value > current.value && q.value > current.value) current.right
        else return current
    }
    throw IllegalArgumentException("Wrong input")
}
