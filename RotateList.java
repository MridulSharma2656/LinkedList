package SkiilsPw.LinkedList;

public class RotateList {
    public static void displayNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node rotateRight(Node head, int k) {
        Node temp = head;
        int n = 0;
        while(temp!= null){
            temp = temp.next;
            n++;
        }
        if(head == null || head.next == null) return head;
        k%=n;
        if(k == 0) return head;
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=k;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        k%=n;
        if(k == 0) return head;
        Node newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
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
        Node ans = rotateRight(a, 03);
        displayNode(ans);
    }
}
