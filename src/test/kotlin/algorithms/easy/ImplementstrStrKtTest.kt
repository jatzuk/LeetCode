package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 23.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class ImplementstrStrKtTest {
    @Test
    fun strStrTest() {
        assertEquals(2, strStr("hello", "ll"))
        assertEquals(-1, strStr("aaaaa", "bba"))
        assertEquals(0, strStr("a", ""))
        assertEquals(-1, strStr("aaa", "aaaa"))
        assertEquals(-1, strStr("mississippi","issipi"))
        assertEquals(0, strStr("",""))
        assertEquals(0, strStr("a","a"))
    }
}
