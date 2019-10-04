package algorithms.easy

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

@Suppress("NAME_SHADOWING")
fun reverseBits(n: Int): Int {
    var n = n
    var res = 0
    for (i in 0 until 32) {
        res = res shl 1
        res += n and 1
        n = n shr 1
    }
    return res
}
