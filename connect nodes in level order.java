class GfG
{
    void connect(Node root)
    {
        root.nextRight=null;
        connectrec(root);
    }
    
    void connectrec(Node p)
    {
        if(p==null)
        return;
        
        if(p.left!=null)
        {
            p.left.nextRight=p.right;
        }
        
        if(p.right!=null)
        {
            p.right.nextRight=(p.nextRight!=null?p.nextRight.left:null);
        }
        connectrec(p.left);
        connectrec(p.right);
    }
}