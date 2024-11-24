package SkiilsPw.LinkedList;

public class MiddleNode {
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.println(head.val + " ");
        displayNode(head.next);
    }
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        // FOR RIGHT ELEMENT (fast.next) & FOR LEFT ELEMENT (fast.next.next)
        while (fast!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
        System.out.println("The middle Node is : " + middleNode(a).val);
    }
}
