package algorithms.easy

import kotlin.math.max

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 04/10/2019
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
fun rob(nums: IntArray): Int {
    var prev = 0
    return nums.fold(0) { acc, i ->
        val max = max(prev + i, acc)
        prev = acc
        max
    }
}
