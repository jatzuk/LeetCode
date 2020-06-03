package explore.learn.arrays101.inplace

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 03/06/2020
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
// O(1)
fun moveZeroesNaive(nums: IntArray): IntArray {
    var zeroes = 0
    var i = 0
    while (i < nums.size - zeroes) {
        if (nums[i] == 0) {
            var j = i
            while (j < nums.lastIndex - zeroes) nums[j] = nums[++j]
            zeroes++
        }
        i++
    }

    repeat(zeroes) { nums[nums.lastIndex - it] = 0 }

    return nums
}

// O(n)
// O(1)
fun moveZeroes(nums: IntArray): IntArray {
    var nonZeroes = 0
    for (i in nums.indices) {
        if (nums[i] != 0) nums[nonZeroes++] = nums[i]
    }

    repeat(nums.size - nonZeroes) {
        nums[nums.lastIndex - it] = 0
    }

    return nums
}

// O(n)
// O(1)
fun moveZeroesOptimal(nums: IntArray): IntArray {
    var nonZeroes = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val tmp = nums[i]
            nums[i] = nums[nonZeroes]
            nums[nonZeroes++] = tmp
        }
    }

    return nums
}
