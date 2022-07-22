package Day5;
class ReverseALL {
    public ListNode reverseList(ListNode head) {
        ListNode d=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=d;
            d=head;
            head=next;
        }
        return d;
    }
}