package explore.learn.arrays101.inplace

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 07/06/2020
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
// O(1)
fun sortArrayByParityInPlace(array: IntArray): IntArray {
    var headPointer = 0
    var i = array.lastIndex

    while (i > headPointer) {
        if (array[i] % 2 == 0) {
            if (array[headPointer] % 2 != 0) {
                val tmp = array[headPointer]
                array[headPointer++] = array[i]
                array[i] = tmp
            } else {
                headPointer++
                continue
            }
        }
        i--
    }

    return array
}

// O(n)
// O(n)
fun sortArrayByParityAdditionalArray(array: IntArray): IntArray {
    val result = IntArray(array.size)
    var even = 0
    var odd = result.lastIndex

    for (n in array) {
        if (n % 2 == 0) result[even++] = n
        else result[odd--] = n
    }

    return result
}

// O(n log n)
// O(n)
fun sortArrayByParitySortComparing(array: IntArray): IntArray = array.sortedBy { it % 2 }.toIntArray()
