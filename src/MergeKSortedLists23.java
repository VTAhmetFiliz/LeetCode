import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedLists23 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List arrayList = new ArrayList<ListNode>(Arrays.asList(lists));
        int minVal = Integer.MAX_VALUE, minIndex = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode n = dummyHead;
        while (!allNull(arrayList)) {
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) != null) && ((ListNode) arrayList.get(i)).val < minVal) {
                    minVal = ((ListNode) arrayList.get(i)).val;
                    minIndex = i;
                }
            }

            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) != null) && ((ListNode) arrayList.get(i)).val == minVal) {
                    n.next = new ListNode(minVal);
                    n = n.next;
                    if (((ListNode) arrayList.get(i)).next == null) arrayList.remove(i);
                    else arrayList.set(i, ((ListNode) arrayList.get(i)).next);
                }
            }


            minVal = Integer.MAX_VALUE;

        }
        return dummyHead.next;
    }

    public boolean allNull(List arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                return false;
            }
        }
        return true;
    }
}
