package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 15/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(n)
fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()

    for (i in s.indices) {
        if (s[i] in map) {
            if (map[s[i]] != t[i]) return false
        } else {
            if (t[i] !in map.values) {
                map[s[i]] = t[i]
            } else return false
        }
    }

    return true
}

// T = O(n); S = O(1)
fun isIsomorphicArrays(s: String, t: String): Boolean {
    val arrayS = IntArray(256)
    val arrayT = IntArray(256)
    for (i in s.indices) {
        if (arrayS[s[i].toInt()] != arrayT[t[i].toInt()]) return false
        arrayS[s[i].toInt()] = i + 1
        arrayT[t[i].toInt()] = i + 1
    }
    return true
}
