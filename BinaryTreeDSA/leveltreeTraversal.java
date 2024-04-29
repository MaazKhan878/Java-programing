package BinaryTreeDSA;
// Using queue collection fram
import java.util.*;

public class leveltreeTraversal {
    static class node{
        int data;
        node left = null;
        node right = null;
        node(int data){
            this.data = data;
        }
    }
    static class levelOrder{
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
        public static void lOrder(node root){
            if(root == null){
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node current = q.remove();
                if(current == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(current.data +" ");
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if(current.right != null){
                        q.add(current.right);
                    }
                }
                
            }
        }
    }
    public static void main(String args[]){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        levelOrder lo = new levelOrder();
        node root = lo.root(node);
        
        lo.lOrder(root);

    }
}
