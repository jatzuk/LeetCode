package algorithms.easy

import org.junit.Assert.assertEquals
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

class ExcelSheetColumnTitleTest {
    private val case1 = "A" to 1
    private val case2 = "B" to 2
    private val case3 = "Z" to 26
    private val case4 = "AB" to 28
    private val case5 = "ZY" to 701

    @Test
    fun titleConversion() {
//        assertEquals(case1.first, convertToTitle(case1.second))
//        assertEquals(case2.first, convertToTitle(case2.second))
//        assertEquals(case3.first, convertToTitle(case3.second))
        assertEquals(case4.first, convertToTitle(case4.second))
//        assertEquals(case5.first, convertToTitle(case5.second))
    }
}