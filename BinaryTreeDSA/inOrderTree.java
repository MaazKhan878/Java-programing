package BinaryTreeDSA;

import BinaryTreeDSA.PreOrderTree.BinaryTree;

public class inOrderTree {
    static class nodde{
        int data;
        nodde left;
        nodde right;
        nodde(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static class inorder{
        static int indx = -1;
        public static nodde root(int node[]){
            indx++;
            if(node[indx] == -1){
                return null;
            }
            nodde newNode = new nodde(node[indx]);
            newNode.left = root(node);
            newNode.right = root(node);
            return newNode;
        }
        public static void inOrder(nodde root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        inorder in = new inorder();
        nodde root = in.root(node);
        in.inOrder(root);
    }
}
