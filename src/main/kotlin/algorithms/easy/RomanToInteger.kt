package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 16.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun romanToInt(s: String): Int {
    if (s.isEmpty()) return 0
    val map = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var res = 0

//    var prev = map[s[0]]!!
//    var i = 0
//    while (i < s.length) {
//        val cur = map[s[i]]!!
//        res += if (prev < cur || (i < s.length - 1 && map[s[i + 1]]!! > cur)) map[s[i++ + 1]]!! - cur
//        else cur
//        prev = cur
//        i++
//    }

    for (i in 0 until s.length - 1) {
        val cur = map[s[i]]!!
        if (cur < map[s[i + 1]]!!) res -= cur
        else res += cur
    }
    return res + map[s[s.length - 1]]!!
}