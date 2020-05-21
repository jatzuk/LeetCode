package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 12.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class TreeNode(var value: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// O(n); n - number of all nodes
// O(n)
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    return if (p == null && q == null) true
    else if (p == null|| q == null) false
    else if (p.value == q.value) isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    else false
}
