package problems.easy

import java.util.*

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 27/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(1)
fun isPalindrome2Pointers(head: ListNode?): Boolean {
    var tail = head?.next
    var middle = head
    while (tail?.next != null) {
        tail = tail.next?.next
        middle = middle?.next
    }

    fun reverse(node: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = node
        while (current != null) {
            val next = current?.next
            current?.next = prev
            prev = current
            current = next
        }
        return prev
    }

    middle = reverse(middle)
    var current = head
    while (current != null && middle != null) {
        if (current?.value != middle.value) return false
        current = current?.next
        middle = middle.next
    }
    return true
}

// T = O(n); S = O(n)
fun isPalindromeArrayList(head: ListNode?): Boolean {
    if (head?.next == null) return true
    val list = ArrayList<Int>()
    var current = head
    while (current != null) {
        list.add(current.value)
        current = current.next
    }
    repeat(list.size / 2) { i -> if (list[i] != list[list.size - 1 - i]) return false }
    return true
}
