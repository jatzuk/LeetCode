package algorithms.easy

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

// T = O(n); S = O(n)
fun getIntersectionNode(headA: ListNode, headB: ListNode): ListNode? {
    var a: ListNode? = headA
    var b: ListNode? = headB
    while (a != b) {
        a = if (a != null) a.next else headB
        b = if (b != null) b.next else headA
    }
    return a
}
