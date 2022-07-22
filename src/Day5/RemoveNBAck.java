package Day5;

public class RemoveNBAck {
     public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead=head;ListNode newHead1=head;
        int d=0;
        while(newHead !=null){
            ++d;
            newHead=newHead.next;
            
        }
        int e=d-n;int f=0;
        while(newHead1!=null){
            ++f;
            newHead1=newHead1.next;
            if(f==e-1){
                newHead1.next=newHead1.next.next;
            }
            if(e==0){
                return null;
            }
        }
        return head;
        
    }
}
