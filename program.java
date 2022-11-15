public class program {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('F');
        tree.insert('G');
        tree.insert('X');
        tree.insert('R');
  
        System.out.print("\nобход inorder:        ");
        tree.inorder();
        
        System.out.print("\nобход reverseinorder: ");
        tree.reverseInorder();  

    //   System.out.println("\n\nПосле удаления 10");
    //   tree.deleteKey(10);
  
        System.out.print("\nобход preorder:        ");
        tree.preorder();
        
        System.out.print("\nобход reversepreorder: ");
        tree.reversePreorder();    
        
        System.out.print("\nобход postorder:        ");
        tree.postorder();

        System.out.print("\nобход reversepostorder: ");
        tree.reversePostorder();
    }
}
