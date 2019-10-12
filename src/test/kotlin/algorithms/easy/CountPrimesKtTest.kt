package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class CountPrimesKtTest {
    @Test
    fun countPrimesNaive() {
        assertEquals(4, countPrimesNaive(10))
        assertEquals(0, countPrimesNaive(2))
        assertEquals(1, countPrimesNaive(3))
        assertEquals(2, countPrimesNaive(5))
        assertEquals(3, countPrimesNaive(7))
        assertEquals(3, countPrimesNaive(6))
    }

    @Test
    fun countPrimesFunctional() {
        assertEquals(4, countPrimesFunctional(10))
        assertEquals(0, countPrimesFunctional(2))
        assertEquals(1, countPrimesFunctional(3))
        assertEquals(2, countPrimesFunctional(5))
        assertEquals(3, countPrimesFunctional(7))
        assertEquals(3, countPrimesFunctional(6))
    }

    @Test
    fun sieveOfEratosthenes() {
        assertEquals(4, sieveOfEratosthenes(10))
        assertEquals(0, sieveOfEratosthenes(2))
        assertEquals(1, sieveOfEratosthenes(3))
        assertEquals(2, sieveOfEratosthenes(5))
        assertEquals(3, sieveOfEratosthenes(7))
        assertEquals(3, sieveOfEratosthenes(6))
    }
}
