package SkiilsPw.LinkedList;

public class MergeTwoSortedLists {
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dum = new Node(100);
        Node temp = dum;
        Node t1 = list1;
        Node t2 = list2;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 == null){
            temp.next = t2;
        }
        else{
            temp.next = t1;
        }
        return dum.next;
    }
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode(head.next);
    }
    public static Node sortList(Node head) {
        if(head == null || head.next == null) return head;
        Node firstHalf = head;
        Node secondHalf = head;
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;  
        }
        secondHalf = slow.next;
        slow.next = null;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        Node ans = mergeTwoLists(firstHalf,secondHalf);
        return ans;
    }
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(20);
        Node c = new Node(100);
        Node d = new Node(23);
        Node e = new Node(60);
        Node f = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayNode(a);
        Node ans = sortList(a);
        System.out.println();
        displayNode(ans);
    }
}
