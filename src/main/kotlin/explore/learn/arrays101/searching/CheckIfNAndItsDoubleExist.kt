package explore.learn.arrays101.searching

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 28/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// O(n)
// O(n)
fun checkIfExistMap(arr: IntArray): Boolean {
    val doubles = hashMapOf<Int, Int>()
    for (i in arr.indices) {
        if (arr[i] * 2 in doubles || arr[i] in doubles.values) return true
        else doubles[arr[i]] = arr[i] * 2
    }
    return false
}

// O(n)
// O(n)
fun checkIfExistSet(arr: IntArray): Boolean {
    val set = hashSetOf<Int>()
    for (n in arr) {
        if (n * 2 in set || (n / 2 in set && n % 2 == 0)) return true
        else set += n
    }
    return false
}
