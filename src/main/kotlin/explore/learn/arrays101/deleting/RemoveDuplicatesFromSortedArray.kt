package explore.learn.arrays101.deleting

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 27/05/2020
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
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var index = 0
    for (i in 1 until nums.size) {
        if (nums[i] > nums[index]) nums[++index] = nums[i]
    }
    return ++index
}

// O(n)
// O(1)
fun removeDuplicatesMapped(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var index = 0
    nums.map { if (it > nums[index]) nums[++index] = it }
    return ++index
}
