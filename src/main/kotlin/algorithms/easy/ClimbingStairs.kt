package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 04.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

//  O(2^n)
//  O(n); n - depth of recursion tree
fun climbStairsBruteForce(n: Int) = climbStairsBruteForce(0, n)

private fun climbStairsBruteForce(i: Int, n: Int): Int {
    if (i > n) return 0
    if (i == n) return 1
    return climbStairsBruteForce(i + 1, n) + climbStairsBruteForce(i + 2, n)
}

//  O(n)
//  O(n)
fun climbStairsRecursionMemorization(n: Int): Int {
    val memo = IntArray(n + 1)
    return climbStairsRecursionMemorization(0, n, memo)
}

private fun climbStairsRecursionMemorization(i: Int, n: Int, memo: IntArray): Int {
    if (i > n) return 0
    if (i == n) return 1
    if (memo[i] > 0) return memo[i]
    memo[i] = climbStairsRecursionMemorization(i + 1, n, memo) + climbStairsRecursionMemorization(i + 2, n, memo)
    return memo[i]
}

// O(n)
// O(n)
fun climbStairsDynamicApproach(n: Int): Int {
    if (n == 1) return 1
    val dp = IntArray(n + 1)
    dp[1] = 1
    dp[2] = 2
    for (i in 3 until n + 1) dp[i] = dp[i - 1] + dp[i - 2]
    return dp[n]
}

// O(n)
// O(1)
fun climbStairsFibonacciApproach(n: Int): Int {
    if (n == 1) return 1
    var first = 1
    var second = 2
    for (i in 3 until n + 1) {
        val third = first + second
        first = second
        second = third
    }
    return second
}

// O(log n)
// O(1)
fun climbStairsFibonacciFormula(n: Int): Int {
    val n = n.toDouble()
    val sqrt5 = Math.sqrt(5.0)
    val fibN = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1)
    return (fibN / sqrt5).toInt()
}