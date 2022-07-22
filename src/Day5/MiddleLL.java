package Day5;

class MiddleLL {
    public ListNode middleNode(ListNode head) {
        ListNode newHead=head;int d=0;ListNode newHead1=head;
        while(newHead!=null){
            ++d;
            newHead=newHead.next;
        }
        int e=(d/2)+1;int f=0;
        while(f!=e-1){
            ++f;
            newHead1=newHead1.next;
        }
        return newHead1;
    }
}
