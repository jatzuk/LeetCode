package problems.easy

import org.junit.Test

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

class PascalsTriangleKtTest {
    @Test
    fun pascalsTriangle() {
        pascalsTriangle(5).forEach(::println)
    }

    @Test
    fun pascalsTriangleFunctional() {
        pascalsTriangleFunctional(5).forEach(::println)
    }
}
