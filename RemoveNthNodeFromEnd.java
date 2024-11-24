package SkiilsPw.LinkedList;

public class RemoveNthNodeFromEnd {
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode(head.next);
    }
    public static void removeNthNodeFromEnd(int n,Node head){
        Node fast = head;
        Node slow = head;
        for(int i = 1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null) return ;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return;
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
        System.out.println();
        removeNthNodeFromEnd(2,c);
        displayNode(a);
    }
}
