package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.10.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n ^ 2); S = O(1)
@Suppress("NAME_SHADOWING")
fun isHappy(n: Int): Boolean {
    var n = n
    val memo = mutableSetOf<Int>()
    while (memo.add(n)) {
        var sum = 0
        while (n > 0) {
            val tmp = n % 10
            sum += tmp * tmp
            n /= 10
        }
        if (sum == 1) return true
        n = sum
    }
    return false
}
