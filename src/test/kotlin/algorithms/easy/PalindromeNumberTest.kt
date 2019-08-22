package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 16-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class PalindromeNumberTest {
    @Test
    fun isPalindromeTest() {
        assertEquals(true, isPalindrome(121))
        assertEquals(true, isPalindrome(12321))
        assertEquals(false, isPalindrome(-121))
        assertEquals(false, isPalindrome(10))
    }
}
