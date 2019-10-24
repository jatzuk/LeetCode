package algorithms.easy

import org.junit.After
import org.junit.Before
import org.junit.Test

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

class InvertBinaryTreeKtTest {
    private lateinit var tree: TreeNode
    private val target = TreeNode(4).apply {
        left = TreeNode(7).apply {
            left = TreeNode(9)
            right = TreeNode(6)
        }
        right = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(1)
        }
    }

    @Before
    fun setUp() {
        tree = TreeNode(4)
        tree.left = TreeNode(2)
        tree.right = TreeNode(7)
        tree.left!!.left = TreeNode(1)
        tree.left!!.right = TreeNode(3)
        tree.right!!.left = TreeNode(6)
        tree.right!!.right = TreeNode(9)
    }

    @Test
    fun invertTreeBFS() {
        assertTreeEquals(target, invertTreeBFS(tree))
    }

    @Test
    fun invertTreeDFS() {
        assertTreeEquals(target, invertTreeDFS(tree))
    }

    @After
    fun tearDown() {
        tree.printTree()
    }

    private fun TreeNode.printTree() {
        left?.printTree()
        print("$value ")
        right?.printTree()
    }

    private fun assertTreeEquals(expected: TreeNode?, actual: TreeNode?): Boolean {
        if (expected == null && actual == null) return true
        if (expected?.value != actual?.value) throw AssertionError("""|
            |Expected:  ${expected?.value}
            |Actual:    ${actual?.value}""".trimMargin())
        return assertTreeEquals(expected?.left, actual?.left) && assertTreeEquals(expected?.right, actual?.right)
    }
}
