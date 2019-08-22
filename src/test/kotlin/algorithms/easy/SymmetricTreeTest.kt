package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class SymmetricTreeTest {
    val symmetric = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        right = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(3)
        }
    }

    val notSymmetric = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(3)
        }
        right = TreeNode(2).apply {
            right = TreeNode(3)
        }
    }

    @Test
    fun isSymmetricTest() {
        assertEquals(true, isSymmetric(symmetric))
        assertEquals(false, isSymmetric(notSymmetric))
    }

    @Test
    fun isSymmetricIterativelyTest() {
        assertEquals(true, isSymmetricIteratively(symmetric))
        assertEquals(false, isSymmetricIteratively(notSymmetric))
    }
}
