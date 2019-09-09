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
    var x = n
    while (x > 0) {
        append('A' + --x % 26)
        x /= 26
    }
}.reversed()
