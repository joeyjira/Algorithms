public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode dummyHead = new ListNode(0), current = dummyHead, p = l1, q = l2;

    while (p != null || q != null) {
        int x = p != null ? p.val : 0;
        int y = q != null ? q.val : 0;
        current.next = new ListNode((x + y + carry) % 10);
        current = current.next;
        carry = x + y + carry > 9 ? 1 : 0;
        p = p != null ? p.next : null;
        q = q != null ? q.next : null;
    }

    if (carry > 0) current.next = new ListNode(carry);
    return dummyHead.next;
  }
}
