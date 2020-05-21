package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 23.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

// O(n)
// O(1)
fun strStr(haystack: String, needle: String): Int {
    if (haystack.isEmpty() && needle.isNotEmpty()) return -1
    if (needle.isEmpty()) return 0
    label@ for (i in 0 until haystack.length) {
        if (haystack.length - i >= needle.length && haystack[i] == needle[0]) {
            var j = 0
            var k = i
            while (j < needle.length) if (needle[j++] != haystack[k++]) continue@label
            return i
        }
    }
    return -1
}

//fun strStr(haystack: String, needle: String) = haystack.indexOf(needle)
