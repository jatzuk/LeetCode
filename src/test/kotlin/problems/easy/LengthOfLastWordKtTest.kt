package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 31.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class LengthOfLastWordKtTest {
    @Test
    fun lengthOfLastWordTest() {
        assertEquals(5, lengthOfLastWord("Hello World"))
        assertEquals(10, lengthOfLastWord("HelloWorld"))
        assertEquals(1, lengthOfLastWord("a "))
        assertEquals(1, lengthOfLastWord(" a "))
        assertEquals(1, lengthOfLastWord(" a"))
        assertEquals(0, lengthOfLastWord(" "))
        assertEquals(0, lengthOfLastWord(""))
    }

    @Test
    fun lengthOfLastWordRegexTest() {
        assertEquals(5, lengthOfLastWordRegex("Hello world"))
        assertEquals(10, lengthOfLastWordRegex("Helloworld"))
        assertEquals(1, lengthOfLastWordRegex("a "))
        assertEquals(1, lengthOfLastWordRegex(" a "))
        assertEquals(1, lengthOfLastWordRegex(" a"))
        assertEquals(0, lengthOfLastWordRegex(" "))
        assertEquals(0, lengthOfLastWordRegex(""))
    }

    @Test
    fun lengthOfLastWordRegexTrimWithLastIndexTest() {
        assertEquals(5, lengthOfLastWordRegexTrimWithLastIndex("Hello world"))
        assertEquals(10, lengthOfLastWordRegexTrimWithLastIndex("Helloworld"))
        assertEquals(1, lengthOfLastWordRegexTrimWithLastIndex("a "))
        assertEquals(1, lengthOfLastWordRegexTrimWithLastIndex(" a "))
        assertEquals(1, lengthOfLastWordRegexTrimWithLastIndex(" a"))
        assertEquals(0, lengthOfLastWordRegexTrimWithLastIndex(" "))
        assertEquals(0, lengthOfLastWordRegexTrimWithLastIndex(""))
    }
}
