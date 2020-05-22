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
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var result = 0
    var currentSequence = 0
    for (i in nums.indices) {
        if (nums[i] == 1) currentSequence++
        else {
            if (currentSequence > result) result = currentSequence
            currentSequence = 0
        }
    }

    if (currentSequence > result) result = currentSequence
    return result
}
