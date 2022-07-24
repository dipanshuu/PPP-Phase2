package Day6;

public class Flattening {
     Node mergeTwoLists(Node a,Node b){
        Node temp=new Node(0);
        Node res=b;
        while((a!=NULL) && (b!=NULL)){
            if(a.data<b.data){
                temp.bottom=a;
                temp=temp.next;
                a=a.bottom;
            }
            else{
                temp.bottom=b;
                temp=temp.next;
                b=b.bottom;
            }
            if(a!=NULL){
                temp.bottom=a;
            }
            else{
                temp.bottom=b;
            }
            return res.bottom;
        }
        
        
        
        
        
        
        
    }
Node *flatten(Node *root)
{
   // Your code here
   if(root==null || root.next==null){
       return root;
   }
   root.next=flatten(root.next);
   root=mergeTwoLists(root,root.next);
   return root;
}


}
