package Algoritham;

import recursion.partyPeople;

public class lList{
    node head;
    private int size;
    class node{
        int n;
        node next;
        node(int n){
            this.n = n;
            this.next = null;
        }
    }
    public void addF(int n){
        node nnode = new node(n);
        if(head == null){
            head = nnode;
            return;
        }
        nnode.next = head;
        head = nnode;
    }
    public void addL(int n){
        node nnode = new node(n);
        if(head == null){
            head = nnode;
            return;
        }
        node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = nnode;
    }
    public void print(){
        node nnode = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(nnode != null){
            System.out.print(nnode.n + " ");
            nnode = nnode.next;
        }
    }
    public void add(int n){
        node nnode = new node(n);
        if(head == null){
            head = nnode;
            return;
        }
        node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = nnode;
    }
    public void removeFirst (){
        if(head == null ){
            System.out.println("Empty List");
            return;
        }
        if(head.next == null){
            return;
        }
        head = head.next;
    }
    public void removeL(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.next == null){
            head.next = null;
            return;
        }
        node sl = head;
        node last = head.next;
        while(last.next!=null){
            last = last.next;
            sl = sl.next;
        }
        sl.next = null;
    }
    public node delete(int n){
        if(head == null){
            System.out.println("Empty");
            return head = null;
        }
        if(n == 0){
            return head.next;
        }
        node curr = head;
        int i = 1;
        while(i<n){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
    public node rD(node curr, int n){
        if(n == 0){
            return head.next;
        }
        if(n == 1){
            curr.next = curr.next.next;
            return head;
        }
        return rD(curr.next, n - 1);
    }
    public void R(){
        if(head == null || head.next == null){
            return;
        }
        node pre = head;
        node curr = head.next;
        while(curr!=null){
            node nexter = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nexter;
        }
        head.next = null;
        head = pre;
    }
    public node rR(node head){
        if(head == null || head.next == null){
            return head;
        }
        node newn = rR(head.next);
        head.next.next = head;
        head.next = null;
        return newn;
    }
    public node findMiddle(node head){
        node hare = head;
        node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean palindram(node head){
        if(head == null || head.next == null){
            return true;
        }
        // fisrt half end next node well be the second half start
        node middle = findMiddle(head);
        node secondStart = rR(middle.next);
        node firstHalf1st = head;
        while(secondStart != null){
            if(firstHalf1st.n != secondStart.n){
                return false;
            }
            firstHalf1st = firstHalf1st.next;
            secondStart = secondStart.next;
        }
        return true;
    }
    public boolean cycle(node head){
        if(head == null){
            return true;
        }
        node hare = head;
        node turtle = head;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        lList l = new lList();
        l.addF(2);
        l.addF(1);
        l.print();
        l.addL(4);
        l.addL(56);
        System.out.println();
        l.print();
        System.out.println();
        l.add(500);
        l.print();
        System.out.println();
        l.removeFirst();
        l.print();
        System.out.println();
        l.removeL();
        l.print();
        System.out.println();
        l.head = l.delete(1);
        l.print();
        System.out.println();
        l.head = l.rD(l.head, 1);
        l.print();
        l.add(5);
        l.add(3);
        System.out.println();
        l.print();
        System.out.println();
        l.R();
        l.print();
        System.out.println();
        l.head = l.rR(l.head);
        l.print();
        System.out.println();
        l.delete(2);
        l.add(5);
        l.add(2);
        boolean why = l.palindram(l.head);
        System.out.println(why);
        l.add(5);
        l.add(8);
        l.print();
        boolean what = l.palindram(l.head);
        System.out.println();
        System.out.println(what);
        l.add(3);
        l.print();
        System.out.println();
        System.out.println(l.cycle(l.head));
    }
}