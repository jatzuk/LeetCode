package algorithms.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 09.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class TwoSumIITest {
    private val case1 = intArrayOf(2, 7, 11, 15)
    private val case2 = intArrayOf(5, 7, 8, 9, 11, 14, 17)

    @Test
    fun twoSumIIMapTest() {
        assertArrayEquals(intArrayOf(1, 2), twoSumIIHashMap(case1, 9))
        assertArrayEquals(intArrayOf(3, 6), twoSumIIHashMap(case2, 22))
        assertArrayEquals(null, twoSumIIHashMap(case2, 100))
    }

    @Test
    fun twoSumIIBinarySearchRecursively() {
        assertArrayEquals(intArrayOf(1, 2), twoSumIIBinarySearchRecursively(case1, 9))
        assertArrayEquals(intArrayOf(1, 7), twoSumIIBinarySearchRecursively(case2, 22))
        assertArrayEquals(null, twoSumIIBinarySearchRecursively(case2, 100))
    }

    @Test
    fun twoSumIIBinarySearchIteratively() {
        assertArrayEquals(intArrayOf(1, 2), twoSumIIBinarySearchIteratively(case1, 9))
        assertArrayEquals(intArrayOf(1, 7), twoSumIIBinarySearchIteratively(case2, 22))
        assertArrayEquals(null, twoSumIIBinarySearchIteratively(case2, 100))
    }

    @Test
    fun twoSumIITwoPointers() {
        assertArrayEquals(intArrayOf(1, 2), twoSumIITwoPointers(case1, 9))
        assertArrayEquals(intArrayOf(1, 7), twoSumIITwoPointers(case2, 22))
        assertArrayEquals(null, twoSumIITwoPointers(case2, 100))
    }
}
