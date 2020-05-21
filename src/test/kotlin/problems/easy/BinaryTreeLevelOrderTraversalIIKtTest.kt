package problems.easy

import org.junit.Before
import org.junit.Test
import problems.util.buildBinaryTreeFromUnsortedArray

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

class BinaryTreeLevelOrderTraversalIIKtTest {
    private val tree = buildBinaryTreeFromUnsortedArray(arrayOf(3, 9, 20, null, null, 15, 7))
    private val target = arrayListOf<MutableList<Int>>()

    @Before
    fun setup() {
        with(target) {
            add(arrayListOf(15, 7))
            add(arrayListOf(9, 20))
            add(arrayListOf(3))
        }
    }

    @Test
    fun levelOrderBottomTest() {
        assertListsEquals(target, levelOrderBottom(tree))
    }

    fun <T> assertListsEquals(list: List<List<T>>, matcher: List<List<T>?>) {
        for (i in 0 until matcher.size) {
            for (j in 0 until matcher[i]!!.size) {
                if (list[i][j] != matcher[i]!![j]) throw AssertionError("""|
                    |Expected : ${list[i][j]}
                    |Actual   : ${matcher[i]!![j]}""".trimMargin())
            }
        }
    }
}
