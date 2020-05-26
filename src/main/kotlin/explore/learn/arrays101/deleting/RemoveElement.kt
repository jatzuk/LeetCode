package explore.learn.arrays101.deleting

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 26/05/2020
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
fun removeElement(nums: IntArray, value: Int): Int {
    var size = 0
    nums.forEach { n -> if (n != value) nums[size++] = n }
    return size
}
