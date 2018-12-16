package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 16.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class RomanToInteger {
    @Test
    fun romanToIntTestBasics() {
        assertEquals(1, romanToInt("I"))
        assertEquals(5, romanToInt("V"))
        assertEquals(10, romanToInt("X"))
        assertEquals(50, romanToInt("L"))
        assertEquals(100, romanToInt("C"))
        assertEquals(500, romanToInt("D"))
        assertEquals(1000, romanToInt("M"))
    }

    @Test
    fun romanToIntTestRepeats() {
        assertEquals(1, romanToInt("I"))
        assertEquals(2, romanToInt("II"))
        assertEquals(3, romanToInt("III"))
    }

    @Test
    fun romanToIntTestCombinations() {
        assertEquals(4, romanToInt("IV"))
        assertEquals(6, romanToInt("VI"))
        assertEquals(7, romanToInt("VII"))
        assertEquals(8, romanToInt("VIII"))
        assertEquals(9, romanToInt("IX"))
        assertEquals(11, romanToInt("XI"))
    }

    @Test
    fun romanToIntTestComplex() {
        assertEquals(55, romanToInt("LV"))
        assertEquals(58, romanToInt("LVIII"))
        assertEquals(2000, romanToInt("MM"))
        assertEquals(1994, romanToInt("MCMXCIV"))
    }
}