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

    while (array[negativeOffset + 1] < 0) negativeOffset++
    var positiveOffset = negativeOffset + 1

    while (negativeOffset >= 0 && positiveOffset < array.size) {
        val negativeCandidate = array[negativeOffset] * array[negativeOffset]
        val positiveCandidate = array[positiveOffset] * array[positiveOffset]

        if (negativeCandidate < positiveCandidate) {
            squares[sortedPointer++] = negativeCandidate
            negativeOffset--
        } else {
            squares[sortedPointer++] = positiveCandidate
            positiveOffset++
        }
    }

    while (negativeOffset >= 0) squares[sortedPointer++] = array[negativeOffset] * array[negativeOffset--]
    while (positiveOffset < array.size) squares[sortedPointer++] = array[positiveOffset] * array[positiveOffset++]

    return squares
}
