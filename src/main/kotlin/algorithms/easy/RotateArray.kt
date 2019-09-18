package algorithms.easy

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 18.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n ^ 2); S = O(1)
fun rotateNaive(nums: IntArray, k: Int): IntArray {
    repeat(k) {
        val tmp = nums.last()
        for (i in nums.lastIndex downTo 1) nums[i] = nums[i - 1]
        nums[0] = tmp
    }
    return nums
}
