public class MergeLinkedList {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0), head = dummyHead;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
                continue;
            } else if (l2 == null) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
                continue;
            }

            head.next = l1.val > l2.val ? l2 : l1;
            if (l1.val > l2.val) {
                l2 = l2.next;
            } else {
                l1 = l1.next;
            }
            head = head.next;
        }

        return dummyHead.next;
    }
}
