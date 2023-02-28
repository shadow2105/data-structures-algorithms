public class Tree {
    
    private TreeNode root;

    public void insert(int value) {
        if(root==null) { root = new TreeNode(value); }
        
        else { root.insert(value); }
    }

    public TreeNode get(int value) {
        if(root!=null) { return root.get(value); }

        return null;
    }

    public int min() {
        if(root==null) { return Integer.MIN_VALUE; }

        else { return root.min(); }
    }

    public int max() {
        if(root==null) { return Integer.MAX_VALUE; }

        else { return root.max(); }
    }

    public void delete(int value) { 
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot==null) { return null; }

        if(value<subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if(value>subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            // Case 1 and 2: The node to be deleted is a leaf node or has a single child
            if(subtreeRoot.getLeftChild()==null) { return subtreeRoot.getRightChild(); }

            else if(subtreeRoot.getRightChild()==null) { return subtreeRoot.getLeftChild(); }

            //Case 3: The node to be deleted has two children
            else {
                subtreeRoot.setData(subtreeRoot.getRightChild().min());
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
            }
        }

        return subtreeRoot;
    }

    public void traverseInOrder() {
        System.out.print("In-Order:   ");
        if(root!=null) { root.traverseInOrder(); }
        System.out.println("\n");
    }

    public void traversePreOrder() {
        System.out.print("Pre-Order:  ");
        if(root!=null) { root.traversePreOrder(); }
        System.out.println("\n");
    }

    public void traversePostOrder() {
        System.out.print("Post-Order: ");
        if(root!=null) { root.traversePostOrder(); }
        System.out.println("\n");
    }
}
