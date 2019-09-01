package algorithms.easy

import kotlin.math.max

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

// T = O(n^2); S = O(1)
fun quadraticComplexity(prices: IntArray): Int {
    if (prices.size < 2) return 0
    var revenue = 0
    for (min in prices.dropLast(1).withIndex()) {
        for (i in min.index + 1 until prices.size) {
            if (prices[i] - min.value > revenue) revenue = prices[i] - min.value
        }
    }
    return revenue
}

// T = O(n); S = O(1)
fun maxProfit(prices: IntArray): Int {
    var max = 0
    var min = Int.MAX_VALUE
    for (i in prices.indices) {
        if (prices[i] < min) min = prices[i]
        else if (prices[i] - min > max) max = prices[i] - min
    }
    return max
}

// T = O(n); S = O(1)
fun maxProfitFunctional(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    return prices.fold(0) { acc, i -> if (i < min) min = i; max(acc, i - min) }
}
