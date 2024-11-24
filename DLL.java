package SkiilsPw.LinkedList;
class DoublyLL{
    int size;
    DNode head;
    DNode tail;
    void insertAtHead(int val){
        DNode temp = new DNode(val);
        if(size == 0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAt(int idx,int val){
        DNode temp = new DNode(val);
        if (idx == 0) {
            insertAtHead(val);
        }
        if (idx == size) {
            insertAtTail(val);
        }
        DNode x = head;
        for(int i = 1;i<=(idx-1);i++){
            x = x.next;
        }
        DNode y = x.next;
        x.next = temp; temp.prev = x;
        temp.next = y; y.prev = temp;
        size++;
    }
    void deleteAtHead(){
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteElement(int idx){
        if (idx == 0) {
            deleteAtHead();
        }
        if (idx == size) {
            deleteAtTail();
        }
        DNode x = head;
        for(int i = 1;i<=(idx-1);i++){
            x = x.next;
        }
        DNode y = x.next.next;
        x.next = y; y.prev = x;
        size--;
    }
    void setElement(int idx, int val){
        if (idx == 0) {
            deleteAtHead();
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            deleteAtTail();
            insertAtTail(val);
            return;
        }
        DNode temp = new DNode(val);
        DNode x = head;
        for(int i = 1;i<=(idx-1);i++){
            x = x.next;
        }
        DNode y = x.next.next;
        x.next = temp; temp.prev = x;
        temp.next = y; y.prev = temp;
    }
    int getElement(int idx) throws Error{
        DNode temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
            if (temp.next == null) break;
        }
        return temp.val;
    }
    void display(){
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.print(size + " ");
        System.out.println();
    }
}
public class DLL {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertAtHead(5);
        dll.insertAtHead(15);
        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        dll.insertAtTail(50);
        dll.display();
        dll.insertAt(3,15);
        dll.insertAt(5, 28);
        dll.display();
        dll.deleteAtHead();
        dll.deleteAtTail();
        dll.display();
        dll.deleteElement(4);
        dll.display();
        dll.setElement(4, 25);
        dll.display();
        int ans = dll.getElement(6);
        System.out.println(ans + " ");
    }
}
