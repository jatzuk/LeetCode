package algorithms.easy

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

fun convertToTitle(n: Int) = buildString {
    var div = n
    var rem = n
    while (div > 26) {
        div /= 26
        rem = if (rem % div > 0) rem % div else 2
        append((div + 64).toChar())
    }
    append((rem + 64).toChar())
}
