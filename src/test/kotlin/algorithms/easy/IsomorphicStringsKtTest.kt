package algorithms.easy

import org.junit.Test

import org.junit.Assert.*

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 15/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class IsomorphicStringsKtTest {

    @Test
    fun isIsomorphic() {
        assertEquals(true, isIsomorphic("egg", "add"))
        assertEquals(false, isIsomorphic("foo", "bar"))
        assertEquals(true, isIsomorphic("paper", "title"))
        assertEquals(false, isIsomorphic("papee", "title"))
        assertEquals(true, isIsomorphic("", ""))
        assertEquals(false, isIsomorphic("ff", "fa"))
        assertEquals(false, isIsomorphic("ab", "aa"))
    }

    @Test
    fun isIsomorphicArrays() {
        assertEquals(true, isIsomorphicArrays("egg", "add"))
        assertEquals(false, isIsomorphicArrays("foo", "bar"))
        assertEquals(true, isIsomorphicArrays("paper", "title"))
        assertEquals(false, isIsomorphicArrays("papee", "title"))
        assertEquals(true, isIsomorphicArrays("", ""))
        assertEquals(false, isIsomorphicArrays("ff", "fa"))
        assertEquals(false, isIsomorphicArrays("ab", "aa"))
    }
}
