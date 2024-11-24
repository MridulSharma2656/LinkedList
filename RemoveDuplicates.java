package SkiilsPw.LinkedList;

public class RemoveDuplicates {
    static int l = 0;
    public static void displayNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
            l++;
        }
        System.out.println();
    }
    public static Node deleteDuplicates(Node head) {
        Node a = head;
        Node b = head;
        if(head == null) return null;
        while(b != null){
            if(a.val == b.val){
                b = b.next;
            }
            else{
                a.next = b;
                a = b;
            }
        }
        a.next = b;
        return head; 
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node b1 = new Node(20);
        Node b2 = new Node(20);
        Node b3 = new Node(20);
        Node c = new Node(30);
        Node d = new Node(50);
        Node d1 = new Node(50);
        Node d2 = new Node(50);
        Node e = new Node(60);
        Node e1 = new Node(60);
        Node e2 = new Node(60);
        Node f = new Node(70);
        a.next = b;
        b.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c;
        c.next = d;
        d.next = d1;
        d1.next = d2;
        d2.next = e;
        e.next = e1;
        e1.next = e2;
        e2.next = f;
        displayNode(a);
        Node ans = deleteDuplicates(a);
        displayNode(ans);
    }
}
