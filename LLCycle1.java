package SkiilsPw.LinkedList;

public class LLCycle1 {
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
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
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
        // displayNode(a);
        if (hasCycle(a) == true) {
            System.out.println("THE LINKED LIST HAS A CYCLE");
        }
        else{
            System.out.println("NOT A CYCLE");
        }
    }
}
