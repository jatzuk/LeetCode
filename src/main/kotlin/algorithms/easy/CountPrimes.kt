package algorithms.easy

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n ^ n); S = O(1)
// fails time limit test
@Suppress("NAME_SHADOWING")
fun countPrimesNaive(n: Int): Int {
    fun isPrime(n: Int): Boolean {
        for (i in 3 until n step 2) if (n % i == 0) return false
        return true
    }

    var count = if (n > 2) 1 else 0
    for (i in 3 until n step 2) if (isPrime(i)) count++
    return count
}

// T = O(n ^ n); S = O(n)
// fails time limit test
fun countPrimesFunctional(n: Int) = generateSequence(3) { it + 2 }
    .filter { i -> (3 until i step 2).none { i % it == 0 } }
    .takeWhile { it < n }
    .count() + if (n > 2) 1 else 0
