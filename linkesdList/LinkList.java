package linkesdList;
import java.util.*;

import org.junit.platform.engine.support.hierarchical.Node;

// its like a array list but it point different memory and combined them
// use when things insert in the middle
// the insert time complexity less then array list big of O(1) but search complexity greater then array list
// big of o(n)(array list insert time complexity is big of o(n) and search as big of o(1))
// if insertion operation as high use linked list
// if search operation as high use array list
// Linked node which called node of linked list last one called null list
// Node stored data
// every node have next which point the another node
// every node stored the address of next node also
// Linked list Head mean first node and tail last node
// types of linked list singular , double, circular
// Singular linkedlist Head -> next node -> next node -> untile tail only move one direction forword direction
// Double linkedList Head <-> next node <-> next node <-> untile Tail move backword and forward direction both
// every node store both next and previous address
// Circular Head -> node -> Tail -> Head circular flow
public class LinkList {
//     Node head;
//     private int size;
//     LinkList(){
//         this.size = 0;
//     }
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }
//     // add
//     // add first, last
//     // add first add in first 1,2,3,4 and add 5 so 5 node replace the 1 and become the head now 5,1,2,3,4
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;

//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;

//     }
//     // Print List
//     public void printList(){
//         if(head == null){
//             System.out.println("List as empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("The list is empty");
         
//             return;
//         }
//         size--;
//         head = head.next;
//     }
//     public void deleteLast(){
//         if(head == null){
//             System.out.println("The lis as empty");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null; 
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }
//     public int getSize(){
//         return size;
//     }
    public static void main(String args[]){
        // LinkList list = new LinkList();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();
        // //Operation applied: add, delete, remove, insert;
        // list.addLast("is");
        // list.addLast("a");
        // list.addFirst("Maaz");
        // list.addLast("Khan");
        // list.printList();
        // // delete
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // // size
        // System.out.println(list.getSize());
        // list.addFirst("Maaz Khan");
        // System.out.println(list.getSize());
        // Upper one as a Data Structure Know use the Collection Fram work'
        // COLLECTION FRAM WORK
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Maaz");
        list.addFirst("Khan");
        System.out.println(list);
        list.addLast("From");
        System.out.println(list);
        list.addFirst("Programmer");
        list.addLast("Dogai");
        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++ ){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println("Null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
    
}