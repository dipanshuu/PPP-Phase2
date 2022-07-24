package Day7;
class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
             len++;
            curr=curr.next;
            
        }
        k=k%len;
        k=len-k;
        curr.next=head;
        while(k-->0) curr=curr.next;
        head=curr.next;
        curr.next=null;
        return head;
    }
}