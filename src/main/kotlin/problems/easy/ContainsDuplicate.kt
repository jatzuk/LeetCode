package problems.easy

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
fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    for (n in nums) if (!set.add(n)) return true
    return false
}

// T = O(n log n); S = O(1)
fun containsDuplicateSorting(nums: IntArray): Boolean {
    nums.sort()
    for (i in 0 until nums.size - 1) if (nums[i] == nums[i + 1]) return true
    return false
}
