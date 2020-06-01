package explore.learn.arrays101.inplace

import kotlin.math.max

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 01/06/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// O(n^2)
// O(1)
fun replaceElementsNaive(arr: IntArray): IntArray {
    for (i in arr.indices) {
        var maxElement = arr[arr.lastIndex]
        for (j in i + 1 until arr.size) maxElement = max(maxElement, arr[j])
        arr[i] = maxElement
    }
    arr[arr.lastIndex] = -1
    return arr
}

// O(n)
// O(1)
fun replaceElements(arr: IntArray): IntArray {
    var max = -1
    for (i in arr.lastIndex downTo 0) {
        val current = arr[i]
        arr[i] = max
        max = max(max, current)
    }
    return arr
}
