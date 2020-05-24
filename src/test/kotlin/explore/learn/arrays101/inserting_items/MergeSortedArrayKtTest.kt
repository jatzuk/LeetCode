package explore.learn.arrays101.inserting_items

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 24/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MergeSortedArrayKtTest {

    private val case1 =
        (intArrayOf(1, 2, 3, 0, 0, 0) to 3) to (intArrayOf(2, 5, 6) to 3) to intArrayOf(1, 2, 2, 3, 5, 6)
    private val case2 =
        (intArrayOf(1, 2, 3, 0, 0, 0) to 3) to (intArrayOf(1, 3, 6) to 3) to intArrayOf(1, 1, 2, 3, 3, 6)
    private val case3 = (intArrayOf(0) to 0) to (intArrayOf(1) to 1) to intArrayOf(1)

    @Test
    fun mergeTest() {
        assertArrayEquals(
            case1.second,
            merge(
                case1.first.first.first,
                case1.first.first.second,
                case1.first.second.first,
                case1.first.second.second
            )
        )

        assertArrayEquals(
            case2.second,
            merge(
                case2.first.first.first,
                case2.first.first.second,
                case2.first.second.first,
                case2.first.second.second
            )
        )

        assertArrayEquals(
            case3.second,
            merge(
                case3.first.first.first,
                case3.first.first.second,
                case3.first.second.first,
                case3.first.second.second
            )
        )
    }
}
