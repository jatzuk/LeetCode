package problems.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 04.10.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(1); S = O(1)
fun hammingWeightNaive(n: Int) = Integer.toBinaryString(n).count { it == '1' }

// T = O(1); S = O(1)
fun hammingWeightMask(n: Int): Int {
    var bits = 0
    var mask = 1
    for (i in 0 until 32) {
        if (n and mask != 0) bits++
        mask = mask shl 1
    }
    return bits
}

// T = O(1); S = O(1)
@Suppress("NAME_SHADOWING")
fun hammingWeightBitManipulation(n: Int): Int {
    var n = n
    var res = 0
    while (n != 0) {
        n = n and (n - 1)
        res++
    }
    return res
}
