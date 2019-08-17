import org.junit.Test;
import utils.ListNode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import static junit.framework.TestCase.assertTrue;


public class TestAddTwoNumbers {

    @Test
    public void testAddTwoNumbersDifferentSizedLists(){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1,9,8));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(5));
        ListNode expectedResultHead = createLinkedNodesFromLinkedList(new LinkedList<>(Arrays.asList(6,9,8)));
        AddTwoNumbers atm = new AddTwoNumbers();
        ListNode resultHead = atm.addTwoNumbers(createLinkedNodesFromLinkedList(l1),createLinkedNodesFromLinkedList(l2));
        assertTrue(testResult(resultHead, expectedResultHead));

    }


    @Test
    public void testAddTwoNumbersSameSizedListsAndCarryAtTheEnd() {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1, 9, 8));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(5, 6, 8));
        LinkedList<Integer> expectedResultHead = new LinkedList<>(Arrays.asList(6, 5, 7, 1));
        AddTwoNumbers atm = new AddTwoNumbers();
        ListNode resultHead = atm.addTwoNumbers(createLinkedNodesFromLinkedList(l1), createLinkedNodesFromLinkedList(l2));
        assertTrue(testResult(resultHead, createLinkedNodesFromLinkedList(expectedResultHead)));
    }


    private Boolean testResult(ListNode resultHead, ListNode expectedResultHead){
        Boolean same = true;
        ListNode p = resultHead;
        ListNode q = expectedResultHead;
        while (p != null || q != null){
            if (p == null || q == null || p.val != q.val){
                same = false;
                break;
            }
            else{
                p = p.next;
                q = q.next;
            }

        }

        return same;
    }

    public ListNode createLinkedNodesFromLinkedList(LinkedList<Integer> linkedList){
        Iterator<Integer> iter = linkedList.iterator();
        ListNode head = new ListNode(iter.next());
        ListNode current = head;
        while (iter.hasNext()) {
            current.next = new ListNode(iter.next());
            current = current.next;
        }
        return head;
    }
}
