package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 17-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class LongestCommonPrefix {
    @Test
    fun longestCommonPrefixHorizontalScanningTest() {
        assertEquals("fl", longestCommonPrefixHorizontalScanning(arrayOf("flower", "flow", "flight")))
        assertEquals("", longestCommonPrefixHorizontalScanning(arrayOf("dog", "racecar", "car")))
    }

    @Test
    fun longestCommonPrefixVerticalScanning() {
        assertEquals("fl", longestCommonPrefixVerticalScanning(arrayOf("flower", "flow", "flight")))
        assertEquals("", longestCommonPrefixVerticalScanning(arrayOf("dog", "racecar", "car")))
    }

    @Test
    fun longestCommonPrefixDivideAndConquer() {
        assertEquals("fl", longestCommonPrefixDivideAndConquer(arrayOf("flower", "flow", "flight")))
        assertEquals("", longestCommonPrefixDivideAndConquer(arrayOf("dog", "racecar", "car")))
    }

    @Test
    fun longestCommonPrefixBinarySearch() {
        assertEquals("fl", algorithms.easy.longestCommonPrefixBinarySearch(arrayOf("flower", "flow", "flight")))
        assertEquals("", algorithms.easy.longestCommonPrefixBinarySearch(arrayOf("dog", "racecar", "car")))
    }
}
