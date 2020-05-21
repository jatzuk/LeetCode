package problems.easy

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 06.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

// T = O(m + n); S = O(max(n, m))
fun getIntersectionNodeHashSet(headA: ListNode, headB: ListNode): ListNode? {
    val set = HashSet<ListNode?>()
    var a: ListNode? = headA
    while (a != null) {
        set.add(a)
        a = a.next
    }

    var b: ListNode? = headB
    while (b != null) {
        if (set.contains(b)) return b
        b = b.next
    }
    return null
}

// T = O(m + n); S = O(1)
fun getIntersectionNode(headA: ListNode, headB: ListNode): ListNode? {
    var a: ListNode? = headA
    var b: ListNode? = headB
    while (a != b) {
        a = if (a != null) a.next else headB
        b = if (b != null) b.next else headA
    }
    return a
}
