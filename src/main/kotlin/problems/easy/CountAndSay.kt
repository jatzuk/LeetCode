package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 24.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun countAndSay(n: Int): String {
    var str = "1"
    for (i in 1 until n) str = generateSequence(str)
    return str
}

private fun generateSequence(string: String): String {
    val sb = StringBuilder()
    var char = string[0]
    var count = 1
    for (i in 1 until string.length) {
        if (string[i] == char) count++
        else {
            sb.append(count)
            sb.append(char)
            char = string[i]
            count = 1
        }
    }
    sb.append(count)
    sb.append(char)
    return sb.toString()
}
