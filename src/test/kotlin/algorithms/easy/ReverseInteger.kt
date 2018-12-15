package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 13-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */
    
class ReverseInteger {
    @Test
    fun reverseTest() {
        assertEquals(321, reverse(123))
        assertEquals(-321, reverse(-123))
        assertEquals(21, reverse(120))
    }
}