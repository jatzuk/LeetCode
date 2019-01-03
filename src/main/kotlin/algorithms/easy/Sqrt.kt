package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 04-Jan-19
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun mySqrt(x: Int): Int {
    if (x == 0 || x == 1) return x
    var ctr = 1L
    var res = 1L
    while (res <= x) res = ++ctr * ctr
    return (ctr - 1).toInt()
}

fun mySqrtNewtonAlgorithm(x: Int): Int {
    if (x == 0 || x == 1) return x
    var res = x.toLong()
    while (res * res > x) res = (res + x / res) / 2
    return res.toInt()
}