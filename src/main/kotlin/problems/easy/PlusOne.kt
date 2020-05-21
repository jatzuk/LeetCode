package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 31-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        val digit = ++digits[i]
        if (digit < 10) return digits
        digits[i] = 0
    }
    return intArrayOf(1) + digits
}
