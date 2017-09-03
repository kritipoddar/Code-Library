Node Reverse(Node head) {
    Node h=head;
    Node r=head.next;
         Node q=head;
if(head==null ) 
    return head;
  else
      if(head.next==null)
      return head;
    else
        {
        while(r!=null)
        {
        head=r;
            r=r.next;
        head.next=q;
            q=head;
         
        }
        h.next=null;
        return head;
    }
}