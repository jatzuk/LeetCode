package algorithms.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(n); S = O(n)
fun hasCycle(head: ListNode?): Boolean {
    val set = HashSet<ListNode>()
    var item = head
    while (item != null) {
        if (set.contains(item)) return true
        set.add(item)
        item = item.next
    }
    return false
}

// T = O(n); S = O(1)
fun hasCycle2Variables(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return true
    }
    return false
}
