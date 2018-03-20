public class AddTwoNumbers2 {
    //https://leetcode.com/problems/add-two-numbers/description/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode ptr = dummyNode;
        int sum = 0, overflow = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + overflow;
            overflow = 0;
            if (sum >= 10) {
                overflow = 1;
                sum = sum - 10;
            }
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            sum = 0;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + overflow;
            overflow = 0;
            if (sum >= 10) {
                overflow = 1;
                sum = sum - 10;
            }
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            sum = 0;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + overflow;
            overflow = 0;
            if (sum >= 10) {
                overflow = 1;
                sum = sum - 10;
            }
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            sum = 0;
            l2 = l2.next;
        }

        if (overflow > 0) {
            ptr.next = new ListNode(1);
            ptr = ptr.next;
        }
        return dummyNode.next;
    }
}
