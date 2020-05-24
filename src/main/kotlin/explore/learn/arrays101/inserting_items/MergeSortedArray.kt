package explore.learn.arrays101.inserting_items

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 24/05/2020
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
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
    var ptr1 = m - 1
    var ptr2 = n - 1
    var i = m + n - 1

    while (ptr1 > -1 && ptr2 > -1) {
        nums1[i--] = if (nums1[ptr1] > nums2[ptr2]) nums1[ptr1--] else nums2[ptr2--]
    }

    while (ptr2 > -1) nums1[i--] = nums2[ptr2--]

    return nums1
}
