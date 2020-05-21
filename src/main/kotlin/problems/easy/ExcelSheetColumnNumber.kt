package problems.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 13.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun titleToNumber(s: String) = s.fold(0) { acc, c -> acc * 26 + 1 + (c - 'A') }
