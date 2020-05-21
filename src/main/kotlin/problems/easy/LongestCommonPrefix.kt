package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 17-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

//  T = O(s); s = sum of all chars
//  S = O(1)
fun longestCommonPrefixHorizontalScanning(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            if (prefix.length == 1) return ""
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }
    return prefix
}

// T = O(s); s = sum of all chars
// S = O(1)
fun longestCommonPrefixVerticalScanning(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    for (i in 0 until strs[0].length) {
        val c = strs[0][i]
        for (j in 1 until strs.size) {
            if (i == strs[j].length || strs[j][i] != c) return strs[0].substring(0, i)
        }
    }
    return strs[0]
}

// T = O(s); s = sum of all chars
// S = O(m * log(n)) ; m space for log(n) recursive calls
fun longestCommonPrefixDivideAndConquer(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    return longestCommonPrefixRecursive(strs, 0, strs.size - 1)
}

private fun longestCommonPrefixRecursive(strs: Array<String>, l: Int, r: Int): String {
    if (l == r) return strs[l]
    val mid = (l + r) / 2
    val lcpL = longestCommonPrefixRecursive(strs, l, mid)
    val lcpR = longestCommonPrefixRecursive(strs, mid + 1, r)
    return commonPrefix(lcpL, lcpR)
}

private fun commonPrefix(left: String, right: String): String {
    val min = Math.min(left.length, right.length)
    for (i in 0 until min) {
        if (left[i] != right[i]) return left.substring(0, i)
    }
    return left.substring(0, min)
}

//  T = O(s * log(n)); s = sum of all chars
//  S = O(1)
fun longestCommonPrefixBinarySearch(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var min = Int.MAX_VALUE
    for (str in strs) if (str.length < min) min = str.length

    var low = 1
    var hight = min
    while (low <= hight) {
        val mid = (low + hight) / 2
        if (isCommonPrefix(strs, mid)) low = mid + 1
        else hight = mid - 1
    }
    return strs[0].substring(0, (low + hight) / 2)
}

private fun isCommonPrefix(strs: Array<String>, len: Int): Boolean {
    val str = strs[0].substring(0, len)
    for (i in 1 until strs.size) if (!strs[i].startsWith(str)) return false
    return true
}
