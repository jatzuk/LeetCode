package explore.learn.arrays101.introduction

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

// O(n)
// O(n)
fun findNumbers(nums: IntArray): Int {
    var result = 0

    for (i in nums.indices) {
        var num = nums[i]
        var digits = 0

        while (num > 0) {
            num /= 10
            digits++
        }

        if (digits % 2 == 0) result++
    }

    return result
}
