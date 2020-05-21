package problems.easy

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 11.09.2019
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
fun majorityElementHashMap(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    nums.forEach {
        if (map.containsKey(it)) map[it] = map[it]!! + 1
        else map[it] = 1
    }
    return map.maxWith(Comparator { o1, o2 -> o1.value - o2.value })!!.key
}

// T = O(n log n); S = O(n)
fun majorityElementSorting(nums: IntArray) = nums.sorted()[nums.size / 2]

// T = O(n); S = O(n)
fun majorityElementFunctional(nums: IntArray) =
    nums.groupBy { it }.values.maxBy { it.size }!!.first()
