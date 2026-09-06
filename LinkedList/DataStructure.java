
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

 
class LinkedList { // User defind Data Strucutre 
    Node head;
    Node tail;
    int size;

    int search(int val) { 
        if (head == null)return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val) { // Sixe of LinkedList
        Node temp = new Node(val);
        if (head == null)
            head = tail = null;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtHead(int val) { // Sixe of LinkedList
        Node temp = new Node(val);
        if (head == null)
            head = tail = null;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size)
            System.out.println("Invalid idx");
        else if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp; // we are deleting tail
        size--;
    }

}

public class LLDataStructure {
   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addAtTail(20);
    ll.addAtTail(30);
    ll.addAtTail(40);
    ll.addAtTail(50);
    ll.addAtTail(70);
    ll.addAtTail(60);
    ll.display();
    // a.deleteAtHead();
    ll.insert(45, 3);
    ll.display();
     (val, idx)
    a.insert(34, 3); // Give(val, idx)
    a.display();
    System.out.println(a.size);
    System.out.println(a.get(3));
    a.delete(3); // Give idx
   }
}
