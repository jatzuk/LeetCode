package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class SameTreeTest {
    val tree00 = TreeNode(1).apply {
        left = TreeNode(2)
        right = TreeNode(3)
    }

    val tree01 = TreeNode(1).apply {
        left = TreeNode(2)
        right = TreeNode(3)
    }

    val tree10 = TreeNode(1).apply {
        left = TreeNode(2)
    }

    val tree11 = TreeNode(1).apply {
        right = TreeNode(3)
    }

    @Test
    fun isSameTree() {
        assertEquals(true, isSameTree(tree00, tree01))
        assertEquals(false, isSameTree(tree10, tree11))
    }
}
