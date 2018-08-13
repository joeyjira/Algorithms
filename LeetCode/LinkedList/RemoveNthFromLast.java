public class RemoveNthFromLast {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummyHead = new ListNode(0), first = dummyHead, second = dummyHead;
    dummyHead.next = head;

    for (int i = 0; i <= n; i++) {
        first = first.next;
    }

    while (first != null) {
        first = first.next;
        second = second.next;
    }

    second.next = second.next.next;

    return dummyHead.next;
  }
}
