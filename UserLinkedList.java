package SkiilsPw.LinkedList;
import java.util.Scanner;
public class UserLinkedList {
    static Node head;
    static  Node tail;
    public static void displayNode(Node head){
        if (head == null) return;
        System.out.print(head.val + " ");
        displayNode(head.next);
    }
    public static void insertElement(int idx,int val,int size){
        Node temp = new Node(val);
        Node x = head;
        if (head == null) {
            insertAtStart(val);
        }
        if (idx == size ) {
            insertAtLast(val);
        }
        if (idx < 0 || idx > size) {
            System.err.println("INVALID INDEX");
        }
        for(int i = 1;i<=(idx-1);i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }
    public static void insertAtStart(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
        else{
        temp.next = head;
        head = temp;
        }
    }
    public static void insertAtLast(int val){
        Node temp = new Node(val);
        if (tail == null) {
            tail = head = temp;
        }
        else{
        tail.next = temp;
        tail = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Linked List : ");
        int size = sc.nextInt();
        for(int i = 1;i<=size;i++){
            insertElement(sc.nextInt(),sc.nextInt(),size);
        }
        Node a = head;
        displayNode(a);
    }
}
