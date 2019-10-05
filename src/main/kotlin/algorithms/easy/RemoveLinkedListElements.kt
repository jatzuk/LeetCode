package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.10.2019
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
@Suppress("NAME_SHADOWING")
fun removeElements(head: ListNode?, value: Int): ListNode? {
    val helper = ListNode().apply { next = head }
    var current:ListNode? = helper
    while (current?.next != null) {
        if (current.next?.value == value) current.next = current.next?.next
        else current = current.next
    }
    return helper.next
}
