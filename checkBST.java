class GfG
{
    int isBST(Node root)  
    {
        boolean bb=recursiveCheck(root, -1, 1001);
        if(bb== true)
        return 1;
        
        return 0;
    }
    boolean recursiveCheck(Node root, int min, int max)
    {
        if(root==null)
        return true;
        
        if(root.data<=min || root.data>=max)
        return false;
        else
        return (recursiveCheck(root.left, min, root.data) && recursiveCheck(root.right, root.data, max));
    }
}