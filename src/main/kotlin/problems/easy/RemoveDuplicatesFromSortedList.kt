package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 09.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current?.next != null) {
        if (current.value == current.next?.value) current.next = current.next?.next
        else current = current.next
    }
    return head
}
