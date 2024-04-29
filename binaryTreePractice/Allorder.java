package binaryTreePractice;
import java.util.*;
public class Allorder {
    static class node{
        int data;
        node left = null;
        node right = null;
        node(int data){
            this.data = data;
        }
    }
    static class allodr{
        static int indx = -1;
        public static node root(int arr[]){
            indx++;
            if(arr[indx] == -1){
                return null;
            }
            node newNode = new node(arr[indx]);
            newNode.left = root(arr);
            newNode.right = root(arr);
            return newNode;
        }
        public static void preOrder(node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(node root){
            if(root == null){
                return;
            }
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
        public static void postOrder(node root){
            if(root == null){
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void level(node root){
            Queue<node> qa = new LinkedList<>();
            qa.add(root);
            qa.add(null);
            while(!qa.isEmpty()){
                node current = qa.remove();
                if(current == null){
                    System.out.println();
                    if(qa.isEmpty()){
                        return;
                    }
                    else{
                        qa.add(null);
                    }
                }
                else{
                    System.out.print(current.data + " ");
                    if(current.left!=null){
                        qa.add(current.left);
                    }
                    if(current.right != null){
                        qa.add(current.right);
                    }
                }
            }
        }

    }
    public static int count(node root){
        if(root == null){
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        return left + right + 1;
    }
    public static int sume(node root){
        if(root == null){
            return 0;
        }
        int left = sume(root.left);
        int right = sume(root.right);
        return left + right + root.data;

    }
    static int i = 0;
    public static int height(node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(left > right){
            return left + 1;
        }
        else{
            return right + 1;
        }
    }
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left)+height(root.right) + 1;
        return Math.max(diameter3, Math.max(diameter1, diameter1));
    }
    static class TreeInfo{
        int hit;
        int dia;
        TreeInfo(int hit, int dia){
            this.hit = hit;
            this.dia = dia;
        }
    }
    public static TreeInfo treeInfo(node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = treeInfo(root.left);
        TreeInfo right = treeInfo(root.right);
        int myHeight = Math.max(left.hit, right.hit) + 1;
        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.hit + right.hit + 1;
        int mydiameter = Math.max(Math.max(dia1, dia2), dia3);
        TreeInfo myInfo = new TreeInfo(myHeight, mydiameter);
        return myInfo;
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        allodr al = new allodr();
        node root = al.root(node);
        System.out.println(root.data);
        System.out.println();
        al.preOrder(root);
        System.out.println();
        al.inOrder(root);
        System.out.println();
        al.postOrder(root);
        System.out.println();
        al.level(root);
        System.out.println("Number of nodes as "+ count(root));
        System.out.println("Sum as "+ sume(root));
        System.out.println("Height as "+ height(root));
        System.out.println("Diameter "+diameter(root));
        TreeInfo inf = treeInfo(root);
        System.out.println("Diameter "+inf.dia);
    }
    
}
