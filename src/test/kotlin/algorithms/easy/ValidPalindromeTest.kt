package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ValidPalindromeTest {
    private val case1 = true to "A man, a plan, a canal: Panama"
    private val case2 = false to "race a car"
    private val case3 = true to "afa"
    private val case4 = true to ""
    private val case5 = true to ".,"

    @Test
    fun palindrome() {
        assertEquals(case1.first, isPalindrome(case1.second))
        assertEquals(case2.first, isPalindrome(case2.second))
        assertEquals(case3.first, isPalindrome(case3.second))
        assertEquals(case4.first, isPalindrome(case4.second))
        assertEquals(case5.first, isPalindrome(case5.second))
    }

    @Test
    fun naivePalindrome() {
        assertEquals(case1.first, isPalindromeNaive(case1.second))
        assertEquals(case2.first, isPalindromeNaive(case2.second))
        assertEquals(case3.first, isPalindromeNaive(case3.second))
        assertEquals(case4.first, isPalindromeNaive(case4.second))
        assertEquals(case5.first, isPalindromeNaive(case5.second))
    }

    @Test
    fun palindromeFunctional() {
        assertEquals(case1.first, isPalindromeFunctional(case1.second))
        assertEquals(case2.first, isPalindromeFunctional(case2.second))
        assertEquals(case3.first, isPalindromeFunctional(case3.second))
        assertEquals(case4.first, isPalindromeFunctional(case4.second))
        assertEquals(case5.first, isPalindromeFunctional(case5.second))
    }

    @Test
    fun recursivePalindrome() {
        assertEquals(case1.first, isPalindromeRecursive(case1.second))
        assertEquals(case2.first, isPalindromeRecursive(case2.second))
        assertEquals(case3.first, isPalindromeRecursive(case3.second))
        assertEquals(case4.first, isPalindromeRecursive(case4.second))
        assertEquals(case5.first, isPalindromeRecursive(case5.second))
    }
}
