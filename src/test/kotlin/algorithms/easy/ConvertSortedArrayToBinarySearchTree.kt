package algorithms.easy

import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ConvertSortedArrayToBinarySearchTree {
    @Test
    fun sortedArrayToBSTTest() {
        treeWalk(sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
    }

    fun treeWalk(node: TreeNode?) {
        if (node == null) return
        treeWalk(node.left)
        print("${node.value} ")
        treeWalk(node.right)
    }
}
