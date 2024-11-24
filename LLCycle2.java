package SkiilsPw.LinkedList;

public class LLCycle2 {
    public static Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        if(head == null || head.next == null) return null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ) break;
        }
        if(fast != slow ) return null;
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
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
        d.next = b;
        e.next = f;
        Node ans = detectCycle(a);
        System.out.println(ans.val + " ");
    }
}
