package problems.easy

import org.junit.After
import org.junit.Test
import problems.util.assertTreeEquals
import problems.util.buildBinaryTreeFromUnsortedArray
import problems.util.printTree

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
    private val tree = buildBinaryTreeFromUnsortedArray(arrayOf(4, 2, 7, 1, 3, 6, 9))
    private val target = buildBinaryTreeFromUnsortedArray(arrayOf(4, 7, 2, 9, 6, 3, 1))

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
}
