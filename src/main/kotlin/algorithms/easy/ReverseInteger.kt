package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 13-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun reverse(x: Int): Int {
    var tmp = x
    var num = 0
    while (Math.abs(tmp) > 0) {
        val pop = tmp % 10
        if (num > Int.MAX_VALUE / 10 || num == Int.MAX_VALUE / 10 && pop > 7) return 0
        if (num < Int.MIN_VALUE / 10 || num == Int.MIN_VALUE / 10 && pop < -8) return 0
        num = num * 10 + pop
        tmp /= 10
    }
    return num
}