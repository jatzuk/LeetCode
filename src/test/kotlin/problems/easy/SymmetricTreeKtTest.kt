package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import problems.util.buildBinaryTreeFromUnsortedArray

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

class SymmetricTreeKtTest {
    private val symmetric = buildBinaryTreeFromUnsortedArray(arrayOf(1, 2, 2, 3, 4, 4, 3))
    private val nonSymmetric = buildBinaryTreeFromUnsortedArray(arrayOf(1, 2, 2, null, 3, null, 3))

    @Test
    fun isSymmetricTest() {
        assertEquals(true, isSymmetric(symmetric))
        assertEquals(false, isSymmetric(nonSymmetric))
    }

    @Test
    fun isSymmetricIterativelyTest() {
        assertEquals(true, isSymmetricIteratively(symmetric))
        assertEquals(false, isSymmetricIteratively(nonSymmetric))
    }
}
