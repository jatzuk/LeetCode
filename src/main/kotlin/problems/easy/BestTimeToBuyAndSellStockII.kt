package problems.easy

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

// T = O(n); S = O(1)
fun maxProfitII(prices: IntArray): Int {
    var revenue = 0
    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) revenue += prices[i] - prices[i - 1]
    }
    return revenue
}

// T = O(2n); S = O(2n)
fun maxProfitIIFunctional(prices: IntArray): Int {
    return prices.drop(1).foldIndexed(0) { index, acc, i ->
        if (i > prices[index]) acc.plus(i - prices[index]) else acc
    }
}
