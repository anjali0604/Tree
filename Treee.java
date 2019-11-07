class Treee { 

    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
   
    Node root; 

    Treee() {  
        root = null;  
    }

    void insert(int key) { 
       root = insertRec(root, key); 
    }

    Node insertRec(Node root, int key) { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
        return root; 
    } 
  
    void inorder()  { 
       inorderRec(root); 
    } 
  
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    void printPreorder()
	{
		preorder(root);
	}
    void preorder(Node root) 
    { 
        if (root == null) 
            return; 
        System.out.println(root.key + " "); 
        preorder(root.left); 
        preorder(root.right); 
    }
	void printPostorder()
	{
		postorder(root);
	}
        void postorder(Node root) 
    { 
        if (root == null) 
            return;  
        postorder(root.left); 
        postorder(root.right); 
        System.out.println(root.key + " "); 
    }
    
    public static void main(String[] args) { 
        Treee tree = new Treee(); 
        tree.insert(15); 
        tree.insert(10); 
        tree.insert(30); 
        tree.insert(5); 
        tree.insert(12); 
	tree.insert(20);
	tree.insert(40);
	System.out.println("Inorder");  
        tree.inorder(); 
tree.printPostorder();
tree.printPreorder();
    } 
} 