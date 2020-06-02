package explore.learn.arrays101.inplace

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02/06/2020
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
    var length = 0
    for (i in 1 until nums.size) {
        if (nums[i] > nums[length]) nums[++length] = nums[i]
    }
    return ++length
}
