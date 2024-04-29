package linkesdList;

public class linkstackp {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stackk {
        public static node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            node newNode = new node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void print() {
            node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public static void pushBottom(int data, node head) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushBottom(data, head);
            push(top);
        }

        public static void reverse(node head) {
            if (isEmpty()) {
                return;
            }
            int top = pop();
            reverse(head);
            pushBottom(top, head);

        }
    }

    public static void main(String args[]) {
        stackk st = new stackk();
        st.push(3);
        st.push(4);
        st.push(12);
        st.pushBottom(4, st.head);
        st.print();
        st.reverse(st.head);
        System.out.println("------------------------");
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
