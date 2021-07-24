package LinkedList;

public class PalindromeLinkedList {
//    public boolean isPalindrome(ListNode head) {
//        ListNode currNew = createNewReverseList(head);
//        ListNode curr = head;
//        while(curr != null){
//            if(curr.val != currNew.val){
//                return false;
//            }
//            curr = curr.next;
//            currNew = currNew.next;
//        }
//        return true;
//    }
//
//    public ListNode createNewReverseList(ListNode head) {
//        if(head == null){
//            return head;
//        }
//        ListNode curr = head;
//        ListNode prevNew = null;
//        ListNode headNew;
//        while(curr != null){
//            ListNode nextNew = new ListNode(curr.val);
//            nextNew.next = prevNew;
//            prevNew = nextNew;
//            curr = curr.next;
//        }
//        return prevNew;
//    }
}
