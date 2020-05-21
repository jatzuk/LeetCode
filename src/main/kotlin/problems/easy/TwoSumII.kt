package problems.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 09.09.2019
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
fun twoSumIIHashMap(numbers: IntArray, target: Int): IntArray? {
    val map = HashMap<Int, Int>()
    for ((i, num) in numbers.withIndex()) {
        if (map.contains(target - num)) return intArrayOf(map[target - num]!! + 1, i + 1)
        map[num] = i
    }
    return null
}

// T = O(n); S = O(1)
fun twoSumIIBinarySearchRecursively(numbers: IntArray, target: Int): IntArray? {
    fun recursion(start: Int, end: Int, target: Int): Int {
        if (start > end) return -1
        val mid = (start + end) / 2
        return when {
            target > numbers[mid] -> recursion(mid + 1, end, target)
            target < numbers[mid] -> recursion(start, mid - 1, target)
            else -> mid
        }
    }

    for (i in numbers.indices) {
        val tmp = recursion(i + 1, numbers.lastIndex, target - numbers[i])
        if (tmp != -1) return intArrayOf(i + 1, tmp + 1)
    }
    return null
}

// T = O(n); S = O(1)
fun twoSumIIBinarySearchIteratively(numbers: IntArray, target: Int): IntArray? {
    for (i in numbers.indices) {
        var head = i + 1
        var tail = numbers.lastIndex
        while (head <= tail) {
            val mid = (head + tail) / 2
            val aim = target - numbers[i]
            when {
                numbers[mid] < aim -> head = mid + 1
                numbers[mid] > aim -> tail = mid - 1
                else -> return intArrayOf(i + 1, mid + 1)
            }
        }
    }
    return null
}

// T = O(n); S = O(1)
fun twoSumIITwoPointers(numbers: IntArray, target: Int): IntArray? {
    var left = 0
    var right = numbers.lastIndex
    while (left <= right) {
        val sum = numbers[left] + numbers[right]
        when {
            sum < target -> left++
            sum > target -> right--
            else -> return intArrayOf(left + 1, right + 1)
        }
    }
    return null
}
