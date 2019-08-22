package algorithms.easy

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 22.08.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

fun pascalsTriangle(numRows: Int): List<List<Int>> {
    val triangle = arrayListOf<List<Int>>()
    for (i in 0 until numRows) {
        var n = 1
        val row = arrayListOf<Int>()
        for (j in 0..i) {
            row.add(n)
            n = n * (i - j) / (j + 1)
        }
        triangle.add(row)
    }
    return triangle
}

fun pascalsTriangleFunctional(numRows: Int): List<List<Int>> {
    return generateSequence(listOf(1)) { prev ->
        listOf(1) + prev.windowed(2).map { it.sum() } + listOf(1)
    }.take(numRows).toList()
}
