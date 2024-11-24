package SkiilsPw.LinkedList;

class Linked_List{
    Node head;
    Node tail;
    int size;
    void insert(int idx,int val){
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
        size++;
    }
    void insertAtStart(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
        else{
        temp.next = head;
        head = temp;
        }
        size++;
    }
    void insertAtLast(int val){
        Node temp = new Node(val);
        if (tail == null) {
            tail = head = temp;
        }
        else{
        tail.next = temp;
        tail = temp;
        }
        size++;
    }
    void displayNode(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size() {
        System.out.println("Size : " + size);
    }
    int getElement(int idx)throws Error {
        Node temp = head;
        if (idx == 0) {
            return head.val;
        }
        if (idx == size-1) {
            return tail.val;
        }
        if (idx<0 || idx > size) {
            throw new Error("OH BHAI DEKH ERROR!! INVALID INDEX");
        }
        for(int i = 0;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
        Node temp = head;
        if (idx == 0) {
            head.val = val;
        }
        if (idx == size) {
            tail.val = val;
        }
        if (idx < 0 || idx > size) {
            throw new Error("OH BHAI ERROR!!INVALID INDEX"); 
        }
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteElement(int idx){
        if (idx == 0) {
            head = head.next;
        }
        if (idx < 0 || idx > size-1) {
            System.out.println("INVALID INDEX");
        }
        Node temp = head;
        for(int i = 1;i<=(idx-1);i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
public class ImplementationOfLL {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertAtStart(5);
        list.insertAtStart(1);
        list.insertAtLast(10);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(60);
        list.insert(2, 07);
        System.out.println(list.getElement(4) + " ");
        list.set(0, 0);
        list.set(5, 0);
        list.deleteElement(0);
        list.displayNode();
        list.size();
    }
}
