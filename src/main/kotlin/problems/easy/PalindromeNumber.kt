package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 16-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false
    var res = 0
    var n = x
    while (res < n) {
        res = res * 10 + n % 10
        n /= 10
    }
    return res == n || res / 10 == n
}
