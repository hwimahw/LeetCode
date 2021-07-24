package LinkedList;

public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode nodeNext = null;
//        ListNode nodePrev = null;
//        ListNode headNew = null;
//        int flag = 1;
//        if(l1 == null && l2 == null){
//            return null;
//        }
//        if(l1 == null && l2 != null){
//            return l2;
//        }
//        if(l1 != null && l2 == null){
//            return l1;
//        }
//        while(l1 != null && l2 != null){
//            if(l1.val < l2.val){
//                nodeNext = new ListNode(l1.val);
//                if(flag == 1){
//                    nodePrev = nodeNext;
//                }
//                l1 = l1.next;
//            }else{
//                nodeNext = new ListNode(l2.val);
//                if(flag == 1){
//                    nodePrev = nodeNext;
//                }
//                l2 = l2.next;
//            }
//            if(flag == 1){
//                headNew = nodeNext;
//                flag = 0;
//            }else{
//                nodePrev.next = nodeNext;
//                nodePrev = nodeNext;
//            }
//        }
//        if(l1 == null){
//            while(l2 != null){
//                nodeNext = new ListNode(l2.val);
//                nodePrev.next = nodeNext;
//                nodePrev = nodeNext;
//                l2 = l2.next;
//            }
//        } else if(l2 == null){
//            while(l1 != null){
//                nodeNext = new ListNode(l1.val);
//                nodePrev.next = nodeNext;
//                nodePrev = nodeNext;
//                l1 = l1.next;
//            }
//        }
//        nodeNext.next = null;
//        return headNew;
//    }
}
