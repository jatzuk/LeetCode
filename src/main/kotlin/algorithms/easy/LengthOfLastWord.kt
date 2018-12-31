package algorithms.easy

import java.util.regex.Pattern

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 31.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun lengthOfLastWord(s: String): Int {
    if (s.isEmpty()) return 0
    val string = s.trim().reversed()
    var counter = 0
    for (char in string) {
        if (char == ' ') break
        counter++
    }
    return counter
}

fun lengthOfLastWordRegex(s: String): Int {
    val matcher = Pattern.compile("\\w+\$").matcher(s.trim())
    return if (matcher.find()) matcher.group().length else 0
}

fun lengthOfLastWordRegexTrimWithLastIndex(s: String) = s.trim().length - s.trim().lastIndexOf(" ") - 1
