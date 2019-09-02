package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(1)
fun isPalindrome(s: String): Boolean {
    with(s.replace("\\W".toRegex(), "").toLowerCase()) {
        repeat(length / 2) { i -> if (this[i] != this[length - 1 - i]) return false }
    }
    return true
}

// T = O(n); S = O(n)
fun isPalindromeNaive(s: String): Boolean {
    val chars = s.toCharArray()
    var head = 0
    var tail = chars.size - 1
    while (head < tail) {
        while (!chars[head].isLetterOrDigit() && head < tail) head++
        while (!chars[tail].isLetterOrDigit() && tail > head) tail--
        if (chars[head++].toLowerCase() != chars[tail--].toLowerCase()) return false
    }
    return true
}

// T = O(2n); S = O(n)
fun isPalindromeFunctional(s: String): Boolean {
    val purified = s.asIterable().filter { it.isLetterOrDigit() }.map { it.toLowerCase() }
    purified.forEachIndexed { i, c -> if (c != purified[purified.size - 1 - i]) return false }
    return true
}


