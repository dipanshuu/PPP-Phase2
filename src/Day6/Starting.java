package Day6;

public class Starting {
     public ListNode detectCycle(ListNode head) {
        if((head==null)||(head.next==null)){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode entry=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                while(slow!=entry){
                    entry=entry.next;
                    slow=slow.next;
                    
                }
                return slow;
            }
        }
        return null;
    }
}
