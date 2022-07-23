package Day6;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1=headA;
        ListNode head2=headB;
        while(head1!=null){
            head2=headB;
            while(head2!=null){
               if(head1.next==head2.next){
                   return head1.next;
               } 
                head2=head2.next;
            }
            head1=head1.next;
        }
        return null;
    }
}
