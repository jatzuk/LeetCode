package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 28.08.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class BestTimeToBuyAndSellStockKtTest {
    private val stocks1 = intArrayOf(7, 1, 5, 3, 6, 4)
    private val stocks2 = (7 downTo 0).toList().toIntArray()
    private val stocks3 = intArrayOf(2, 4, 1)
    private val stocks4 = intArrayOf(3, 2, 6, 5, 0, 3)

    @Test
    fun quadraticTimeTest() {
        assertEquals(5, quadraticComplexity(stocks1))
        assertEquals(0, quadraticComplexity(stocks2))
        assertEquals(2, quadraticComplexity(stocks3))
        assertEquals(4, quadraticComplexity(stocks4))
    }

    @Test
    fun linearComplexity() {
        assertEquals(5, maxProfit(stocks1))
        assertEquals(0, maxProfit(stocks2))
        assertEquals(2, maxProfit(stocks3))
        assertEquals(4, maxProfit(stocks4))
    }

    @Test
    fun functionalApproach() {
        assertEquals(5, maxProfitFunctional(stocks1))
        assertEquals(0, maxProfitFunctional(stocks2))
        assertEquals(2, maxProfitFunctional(stocks3))
        assertEquals(4, maxProfitFunctional(stocks4))
    }
}
