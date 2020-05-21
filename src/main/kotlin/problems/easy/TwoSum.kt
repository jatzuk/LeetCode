package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 13-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

//  T = O(n^2) S = O(1)
fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) if (nums[j] == target - nums[i]) return intArrayOf(i, j)
    }
    return intArrayOf(-1, -1)
}

// T = O(n) S = O(n)
fun twoSumHashMapTwoPass(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in 0 until nums.size) map[nums[i]] = i

    for (i in 0 until nums.size) {
        val complement = target - nums[i]
        if (map.containsKey(complement) && complement != i) return intArrayOf(i, map[complement]!!)
    }
    return intArrayOf(-1, -1)
}

// T = O(n) S = O(n)
fun twoSumHashMapSinglePass(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in 0 until nums.size) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) return intArrayOf(map[complement]!!, i)
        map[nums[i]] = i
    }
    return intArrayOf(-1, -1)
}
