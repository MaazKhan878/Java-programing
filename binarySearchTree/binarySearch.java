package binarySearchTree;

import java.util.ArrayList;

// Its the extented form of binary tree
// its use due to time complexity
// its quicker then the other one
// left sub tree Nodes < Root
// right sub tree Nodes > Root
// left and right subtree are also BST with no duplicate  
public class binarySearch{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root, IS.data);

        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data >= y){
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i : path){
            System.out.print(i+"->");
        }
        System.out.println();
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null ){
            printPath(path);
        }
        else{
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String args[]){
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<value.length; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        if(search(root, 8)){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
        delete(root, 4);
        inorder(root);
        delete(root , 7);
        System.out.println();
        inorder(root);
        System.out.println();
        printInRange(root, 1, 3);
        System.out.println();
        int tree[] = {8,5,3,1,4,6,10,11,14};
        Node root2 = null;
        for(int i = 0; i<tree.length; i++){
            root2 = insert(root2, tree[i]);
        }
        inorder(root2);
        System.out.println();
        printRootToLeaf(root2, new ArrayList<>());
    }
}
