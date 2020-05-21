package problems.easy

import kotlin.math.abs

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 20/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(n)
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = HashMap<Int, Int>()
    for ((i, n) in nums.withIndex()) {
        if (n !in map) map[n] = i
        else {
            if (abs(i - map[n]!!) <= k) return true
            map[n] = i
        }
    }
    return false
}
