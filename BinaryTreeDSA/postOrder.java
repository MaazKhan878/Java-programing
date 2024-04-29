package BinaryTreeDSA;

import BinaryTreeDSA.inOrderTree.inorder;
import BinaryTreeDSA.inOrderTree.nodde;

public class postOrder {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Porder{
        static int indx = -1;
        public static node root(int node[]){
            indx++;
            if(node[indx] == -1){
                return null;
            }
            node newNode = new node(node[indx]);
            newNode.left = root(node);
            newNode.right = root(node);
            return newNode;
        }
        public static void Postodr(node root){
            if(root == null){
                return;
            }
            Postodr(root.left);
            Postodr(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Porder p = new Porder();
        node root = p.root(node);
        p.Postodr(root);
    }    
}
