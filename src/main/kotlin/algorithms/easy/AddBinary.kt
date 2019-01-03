package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 03-Jan-19
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun addBinary(a: String, b: String): String {
    var result = ""
    var sum = 0
    var i = a.length - 1
    var j = b.length - 1
    while (i > -1 || j > -1 || sum == 1) {
        sum += if (i > -1) (a[i--] - 48).toInt() else 0
        sum += if (j > -1) (b[j--] - 48).toInt() else 0
        result += sum % 2
        sum /= 2
    }
    return result.reversed()
}