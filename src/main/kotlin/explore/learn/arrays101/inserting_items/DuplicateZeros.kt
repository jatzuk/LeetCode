package explore.learn.arrays101.inserting_items

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 22/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// O(2^n)
// O(1)
fun duplicateZeros(arr: IntArray): IntArray {
    var i = 0
    while (i < arr.size) {
        if (arr[i] == 0) {
            for (j in arr.lastIndex downTo i + 1) arr[j] = arr[j - 1]
            i++
        }
        i++
    }
    return arr
}

// O(n)
// O(1)
fun duplicateZeroesOffset(arr: IntArray): IntArray {
    var duplicateOffset = arr.count { it == 0 } + arr.size
    for (i in arr.lastIndex downTo 0) {
        if (--duplicateOffset < arr.size) arr[duplicateOffset] = arr[i]
        if (arr[i] == 0 && --duplicateOffset < arr.size) arr[duplicateOffset] = 0
    }
    return arr
}

fun main() {

}
