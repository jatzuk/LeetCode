package problems.easy

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 03.09.2019
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
fun singleNumber(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    for (item in nums) {
        if (map[item] == null) map[item] = 1
        else {
            var value = map[item]!!
            map[item] = ++value
        }
    }
    return map.entries.first { it.value == 1 }.key
}

// T = O(n); S = O(1)
fun singleNumberXor(nums: IntArray): Int {
    var result = 0
    for (item in nums) result = item xor result
    return result
}

// T = O(n); S = O(1)
fun singleNumberFunctional(nums: IntArray): Int {
    var result = 0
    nums.forEach { result = it xor result }
    return result
}
