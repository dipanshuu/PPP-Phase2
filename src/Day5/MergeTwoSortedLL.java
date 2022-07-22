package Day5;

class MergedTwoSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val>list2.val){
ListNode temp1=list1;
            list1=list2;
            list2=temp1;
}
        ListNode res=list1;
        while(list1!=null && list2!=null){
ListNode temp2=null;
            while(list1!=null && list1.val<=list2.val){
                temp2=list1;
                list1=list1.next;
            }
            temp2.next=list2;
            ListNode temp3=list1;
            list1=list2;
            list2=temp3;
            
        }
        return res;
    }
}
