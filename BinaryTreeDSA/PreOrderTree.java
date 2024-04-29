package BinaryTreeDSA;
// Tree 
// Root Parent
// Branches Child
// leaf Null
// Subtree is the small part of tree which himself is a tree
// preOrder traversal tree 
// First root
// second left subtree
// 3rd right sub tree
// they have node where we store the Data
// Solve through recursion 
// whenever we see null it will return and then to another side etc
// See code deeply and Analyzed for himself

public class PreOrderTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinaryTree{
        static int indx = -1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(node);
        System.out.println(root);
        preOrder(root);
    }
    
}
