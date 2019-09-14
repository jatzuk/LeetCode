package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 14.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun trailingZeroes(n: Int): Int = if (n == 0) 0 else n / 5 + trailingZeroes(n / 5)
