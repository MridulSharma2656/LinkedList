package SkiilsPw.LinkedList;

public class IntersectionOfLinkedList {
    // static Node headA;
    // static Node headB;
    public static Node interSection(Node headA, Node headB){
        int lenA = 0;
        Node tA = headA;
        while(tA.next!=null){
            tA = tA.next;
            lenA++;
        }
        int lenB = 0;
        Node tB = headB;
        while(tB.next!=null){
            tB = tB.next;
            lenB++;
        }
        tA = headA;
        tB = headB;
        if(lenA > lenB){
            for(int i = 0;i<(lenA-lenB);i++){
                tA = tA.next;
            }
        }
        if(lenB > lenA){
            for(int i = 0;i<(lenB-lenA);i++){
                tB = tB.next;
            }
        }
        while(tA!=tB){
            tA = tA.next;
            tB = tB.next;
        }    
        return tA;
    }
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);
        Node g = new Node(50);
        Node h = new Node(60);
        Node i = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        displayNode(a);
        System.out.println("The Linked Lists insected at : " + interSection(a, d).val);
    }
}
