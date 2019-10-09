package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 22.08.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class PascalsTriangleIIKtTest {
    @Test
    fun pascalsTriangleTest() {
        assertEquals(listOf(1, 3, 3, 1), getRow(3))
        assertEquals(listOf(1, 4, 6, 4, 1), getRow(4))
        assertEquals(listOf(1, 5, 10, 10, 5, 1), getRow(5))
        assertEquals(listOf(1), getRow(0))
        assertEquals(
            listOf(
                1,
                30,
                435,
                4060,
                27405,
                142506,
                593775,
                2035800,
                5852925,
                14307150,
                30045015,
                54627300,
                86493225,
                119759850,
                145422675,
                155117520,
                145422675,
                119759850,
                86493225,
                54627300,
                30045015,
                14307150,
                5852925,
                2035800,
                593775,
                142506,
                27405,
                4060,
                435,
                30,
                1
            ), getRow(30)
        )
    }
}
