package SkiilsPw.LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}
public class BasicsLinkedList {
    static int size;
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode(head.next);
    }
    public static void displayNode1(Node1 head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode1(head.next);
    }
    public static int sizeOfList(Node head){
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayNode(a);
        System.out.print("The size of list is " + sizeOfList(a));
        System.out.println();
        Node1 a1 = new Node1(15);
        Node1 b1 = new Node1(25);
        Node1 c1 = new Node1(35);
        Node1 d1 = new Node1(55);
        Node1 e1 = new Node1(65);
        Node1 f1 = new Node1(75);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
        displayNode1(a1);
    }
}
