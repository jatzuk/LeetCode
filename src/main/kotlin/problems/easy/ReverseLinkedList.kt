package problems.easy

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 19/10/2019
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
fun reverseListIteratively(head: ListNode?): ListNode? {
    var current = head?.next
    var prev = head
    head?.next = null
    while (current != null) {
        val tmp = current
        current = current.next
        tmp.next = prev
        prev = tmp
    }
    return prev
}

// T = O(n); S = O(n)
fun reverseListRecursively(head: ListNode?): ListNode? {
    if (head?.next == null) return head
    val current = reverseListRecursively(head.next)
    head.next?.next = head
    head.next = null
    return current
}
