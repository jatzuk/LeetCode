package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02.02.2019
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
fun sortedArrayToBST(nums: IntArray, start: Int = 0, end: Int = nums.size - 1): TreeNode? {
    if (start > end) return null
    val mid = (start + end) / 2
    val node = TreeNode(nums[mid])
    node.left = sortedArrayToBST(nums, start, mid - 1)
    node.right = sortedArrayToBST(nums, mid + 1, end)
    return node
}
