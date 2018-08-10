public class OddEvenLinked {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode current = head.next.next, lastOdd = head, lastEven = head.next, firstEven = head.next;

    for (int i = 3; current != null; i++) {
        if (i % 2 == 0) {
            lastEven.next = current;
            lastEven = lastEven.next;
        } else {
            lastOdd.next = current;
            lastOdd = lastOdd.next;
        }

        current = current.next;
    }

    lastOdd.next = firstEven;
    lastEven.next = null;

    return head;
  }
}
