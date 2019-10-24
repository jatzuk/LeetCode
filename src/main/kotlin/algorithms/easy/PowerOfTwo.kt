package algorithms.easy

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 24/10/2019
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
fun isPowerOfTwoNaive(n: Int): Boolean {
    generateSequence(1) { it * 2 }
            .takeWhile { it <= n }
            .forEach { if (it == n) return true }
    return false
}

// T = O(n); S = O(1)
fun isPowerOfTwoBitCount(n: Int) = n > 0 && Integer.bitCount(n) == 1

// T = O(log n); S = O(1)
fun isPowerOfTwoIterative(n: Int): Boolean {
    if (n < 1) return false
    var x = n
    while (x % 2 == 0) x /= 2
    return x == 1
}

// T = O(log n); S = O(n)
fun isPowerOfTwoRecursive(n: Int): Boolean =
        n > 0 && (n == 1 || (n % 2 == 0 && isPowerOfTwoRecursive(n / 2)))

// T = O(1); S = O(1)
fun isPowerOfTwoBitwise(n: Int) = n > 0 && (n and (n - 1)) == 0
