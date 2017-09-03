class GfG
{
    Node head;
    Node prev=null;
    Node BToDLL(Node root)
    {
	if(root==null)
	return null;
	
	BToDLL(root.left);
	if(prev==null)
	{
	    head=root;
	}
	else
	{
	    root.left=prev;
	    prev.right=root;
	}
	prev=root;
	BToDLL(root.right);
	
	return head;
    }
}