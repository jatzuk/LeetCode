package explore.learn.arrays101.searching

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 5/30/2020
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
fun validMountainArray(nums: IntArray): Boolean {
    if (nums.size < 3) return false
    var pointer = 0
    while (pointer + 1 < nums.size && (nums[pointer] < nums[pointer + 1])) pointer++
    if (pointer == 0 || pointer == nums.lastIndex) return false
    while (pointer + 1 < nums.size && (nums[pointer] > nums[pointer + 1])) pointer++
    return pointer == nums.lastIndex
}
