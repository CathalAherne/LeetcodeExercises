import utils.ListNode;

public class AddTwoNumbers {
    ListNode resultCurrentNode;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode p = l1; ListNode q = l2; resultCurrentNode = dummyHead;
        int overflow = 0;

        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y  = (q != null) ? q.val : 0;
            int value = (x + y + overflow) % 10;
            overflow = (x + y) / 10;
            resultCurrentNode.next = new ListNode(value % 10);
            resultCurrentNode = resultCurrentNode.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;            }

        if (overflow > 0){
            resultCurrentNode.next = new ListNode(overflow);
            resultCurrentNode = resultCurrentNode.next;
        }

        return dummyHead.next;
    }
}
