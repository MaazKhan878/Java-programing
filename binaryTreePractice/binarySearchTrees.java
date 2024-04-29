package binaryTreePractice;
import java.util.*;

public class binarySearchTrees {
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
    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right , data);
        }
        return root;
    }
    static int indx = -1;
    public static Node binaryTree(int root[]){
        indx++;
        if(root[indx] == -1){
            return null;
        }
        Node newNode = new Node(root[indx]);
        newNode.left = binaryTree(root);
        newNode.right = binaryTree(root);
        return newNode;  
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean searchKey(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return searchKey(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return searchKey(root.right, key);
        }
    }
    public static Node delete(Node root, int data){
        if(root.data > data){
            root.left = delete(root.left, data);
        }
        else if(root.data < data){
            root.right = delete(root.right , data);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root, data);
        }
        return root;

    }
    public static Node inorderSuccessor(Node root){
        while(root.right!=null){
            root = root.left;
        }
        return root;
    }
    public static void range(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            range(root.left, x,y);
            System.out.print(root.data+" ");
            range(root.right, x, y);
        }
        else if(root.data>= x){
            range(root.left, x, y);
        }
        else{
            range(root.right ,x,y);
        }
    }
    public static void path(ArrayList<Integer> list){
        for(int i:list){
            System.out.print(i+"->");
        }
        System.out.println();
    }
    public static void RootToLeaf(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            path(list);
        }
        else{
            RootToLeaf(root.left, list);
            RootToLeaf(root.right, list);
        }
        list.add(list.size() - 1);

    }
    public static void main(String args []){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binaryTree(arr);
        preOrder(root);
        System.out.println();
        int arr1[] = {5,3,4,7,8,1,2,0};
        Node root2 = null;
        for(int i = 0; i<arr1.length; i++){
            root2 = insert(root2, arr1[i]);
        }
        preOrder(root2);
        System.out.println();
        inorder(root2);
        System.out.println();
        if(searchKey(root2, 10)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println();
        delete(root2, 7);
        inorder(root2);
        System.out.println();
        range(root2, 3, 5);
        System.out.println();
        RootToLeaf(root2, new ArrayList<>());
    }
    
}
