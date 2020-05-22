package explore.learn.arrays101.introduction

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

// O(n log n)
// O(n)
fun sortedSquares(array: IntArray): IntArray = array.map { n -> n * n }.sorted().toIntArray()

// O(n)
// O(n)
fun sortedSquaresPointers(array: IntArray): IntArray {
    val squares = IntArray(array.size)
    var negativeOffset = 0
    var sortedPointer = 0

    while (negativeOffset < array.size && array[negativeOffset] < 0) negativeOffset++
    var positiveOffset = --negativeOffset + 1

    while (negativeOffset >= 0 && positiveOffset < array.size) {
        val negativeCandidate = array[negativeOffset] * array[negativeOffset]
        val positiveCandidate = array[positiveOffset] * array[positiveOffset]

        squares[sortedPointer++] = if (negativeCandidate < positiveCandidate) {
            negativeOffset--
            negativeCandidate
        } else {
            positiveOffset++
            positiveCandidate
        }
    }

    while (negativeOffset >= 0) squares[sortedPointer++] = array[negativeOffset] * array[negativeOffset--]
    while (positiveOffset < array.size) squares[sortedPointer++] = array[positiveOffset] * array[positiveOffset++]

    return squares
}

// O(n)
// O(n)
fun sortedSquaresPointersBackTraverse(array: IntArray): IntArray {
    val squares = IntArray(array.size)
    var start = 0
    var end = array.lastIndex

    var backTraverseIndex = end
    while (backTraverseIndex >= 0) {
        val negativeCandidate = array[start] * array[start]
        val positiveCandidate = array[end] * array[end]

        squares[backTraverseIndex] = if (negativeCandidate > positiveCandidate) {
            start++
            negativeCandidate
        } else {
            end--
            positiveCandidate
        }
        backTraverseIndex--
    }

    return squares
}
