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

internal class FindNumbersWithEvenNumberOfDigitsKtTest {

    @Test
    fun findNumbers() {
        assertEquals(2, findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
    }
}
