package problems.easy

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

// T = O(n * k); S = O(1)
fun rotateNaive(nums: IntArray, k: Int): IntArray {
    repeat(k) {
        val tmp = nums.last()
        for (i in nums.lastIndex downTo 1) nums[i] = nums[i - 1]
        nums[0] = tmp
    }
    return nums
}

// T = O(n); S = O(n)
fun rotateExtraArray(nums: IntArray, k: Int): IntArray {
    val tmp = IntArray(nums.size)
    repeat(nums.size) { tmp[(it + k) % nums.size] = nums[it] }
    repeat(nums.size) { nums[it] = tmp[it] }
    return nums
}

// T = O(n); S = O(1)
fun rotateReversed(nums: IntArray, k: Int): IntArray {
    fun reverse(start: Int, end: Int) {
        var s = start
        var e = end
        while (s < e) {
            val tmp = nums[s]
            nums[s++] = nums[e]
            nums[e--] = tmp
        }
    }

    val j = k % nums.size
    reverse(0, nums.lastIndex)
    reverse(0, j - 1)
    reverse(j, nums.lastIndex)
    return nums
}
