package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 01.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class BestTimeToBuyAndSellStockIIKtTest {
    private val stocks1 = intArrayOf(7, 1, 5, 3, 6, 4)
    private val stocks2 = (7 downTo 0).toList().toIntArray()
    private val stocks3 = intArrayOf(2, 4, 1)
    private val stocks4 = intArrayOf(3, 2, 6, 5, 0, 3)
    private val stocks5 = (1..5).toList().toIntArray()

    @Test
    fun profitTest() {
        assertEquals(7, maxProfitII(stocks1))
        assertEquals(0, maxProfitII(stocks2))
        assertEquals(2, maxProfitII(stocks3))
        assertEquals(7, maxProfitII(stocks4))
        assertEquals(4, maxProfitII(stocks5))
    }

    @Test
    fun profitFunctionalTest() {
        assertEquals(7, maxProfitIIFunctional(stocks1))
        assertEquals(0, maxProfitIIFunctional(stocks2))
        assertEquals(2, maxProfitIIFunctional(stocks3))
        assertEquals(7, maxProfitIIFunctional(stocks4))
        assertEquals(4, maxProfitIIFunctional(stocks5))
    }
}
