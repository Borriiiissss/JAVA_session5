// Создаем узел
class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
        public Node(int item) {
        key = item;
        left = right = null;
      }
    } 
    Node root;
  
    BinarySearchTree() {
        root = null;
    }
  
    void insert(char key) {
        root = insertKey(root, key);
    }
  
    // Вставляем в дерево элемент
    Node insertKey(Node root, char key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
    
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);
    
        return root;
    }
  
    void inorder() {
        inorderRec(root);
    }

    void preorder() {
        preorderRec(root);
      }

    void postorder() {
        postorderRec(root);
    }

    void reverseInorder() {
        reverseInorderRec(root);
    }

    void reversePostorder() {
        reversePostorderRec(root);
    }

    void reversePreorder() {
        reversePreorderRec(root);
    }
  
    // обход inorder
    // Обход по порядку состоит из первого посещения левого поддерева, затем корневого узла и правого поддерева
    void inorderRec(Node root) {
      if (root != null) {
        inorderRec(root.left);
        System.out.print((char)root.key + " ");
        inorderRec(root.right);
      }
    }

    // обход preorder
    // cначала посещается корневой узел, затем левое поддерево и правое поддерево:
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print((char) root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // обход postorder
    // Обход посещает левое поддерево, правое поддерево и корневой узел в конце:
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);            
            postorderRec(root.right);
            System.out.print((char)root.key + " ");
        }
    }   
    // обход reversepostorder
    // Обход посещает правое поддерево, левое поддерево, корневой узел
    void reversePostorderRec(Node root) {
        if (root != null) {
            reversePostorderRec(root.right);
            reversePostorderRec(root.left);
            System.out.print((char)root.key + " ");            
        }
    }
        // обход reverseinorder
        // Реверсивный обход inorder состоит из первого посещения правого поддерева, корневого узла и левого поддерева
    void reverseInorderRec(Node root) {
        if (root != null) {
            reverseInorderRec(root.right);             
            System.out.print((char)root.key + " ");           
            reverseInorderRec(root.left);
        }
      }
        // обход reversepreorder
        // Реверсивный обход preorder состоит из первого посещения корневого узла, правого поддерева и левого поддерева
        void reversePreorderRec(Node root) {
            if (root != null) {
                reversePreorderRec(root.right);             
                System.out.print((char)root.key + " ");           
                reversePreorderRec(root.left);
            }
          }
  
    void deleteKey(int key) {
      root = deleteRec(root, key);
    }
  
    Node deleteRec(Node root, int key) {
      if (root == null)
        return root;
  
      if (key < root.key)
        root.left = deleteRec(root.left, key);
      else if (key > root.key)
        root.right = deleteRec(root.right, key);
      else {
        if (root.left == null)
          return root.right;
        else if (root.right == null)
          return root.left;
  
        root.key = minValue(root.right);
        root.right = deleteRec(root.right, root.key);
      }
      return root;
    }
  
    int minValue(Node root) {
      int minv = root.key;
      while (root.left != null) {
        minv = root.left.key;
        root = root.left;
      }
      return minv;
    }
}