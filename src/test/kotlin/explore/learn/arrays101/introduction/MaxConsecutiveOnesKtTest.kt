package explore.learn.arrays101.introduction

import org.junit.Assert.assertEquals
import org.junit.Test


/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 21/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

internal class MaxConsecutiveOnesKtTest {

    @Test
    fun findMaxConsecutiveOnesTest() {
        assertEquals(3, findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
    }
}
