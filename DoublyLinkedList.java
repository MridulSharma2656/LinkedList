package SkiilsPw.LinkedList;
class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}
public class DoublyLinkedList {
    public static void display1(DNode head){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void display2(DNode tail){
        DNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display3(DNode node){
        DNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        display1(temp);
    }
    public static void main(String[] args) {
        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(30);
        DNode d = new DNode(50);
        DNode e = new DNode(60);
        DNode f = new DNode(70);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        display1(a);
        display2(f);
        display3(c);
    }
}
