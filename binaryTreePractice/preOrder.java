package binaryTreePractice;

public class preOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int indx = - 1;
        public static Node rootFinder(int root[]){
            indx++;
            if(root[indx] == -1){
                return null;
            }
            Node newnode = new Node(root[indx]);
            newnode.left = rootFinder(root);
            newnode.right = rootFinder(root);
            return newnode;


        }
        public static void preOrder(Node node){
            if(node == null){
                return;
            }
            System.out.print(node.data +" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree t = new binaryTree();
        Node root = t.rootFinder(node);
        System.out.println(root.data);
        System.out.println();
        t.preOrder(root);
    }
    
}
