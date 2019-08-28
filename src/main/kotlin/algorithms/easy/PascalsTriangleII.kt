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

fun getRow(rowIndex: Int): List<Int> {
    val row = arrayListOf<Int>()
    for (i in 0..rowIndex) {
        row.add(1)
        for (j in i - 1 downTo 1) row[j] += row[j - 1]
    }
    return row
}
