package BasicConcepts;

class Node{ // user define data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkedList{
    Node head; // null
    Node tail; // null
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null) {
            addAtHead(val);
            return;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;

        if(head == null) tail = null;

        size--;
    }

    void getSize(){
        System.out.println("List size is: " + size);
    }

    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int idx=0;
        while(temp != null){
          if(temp.val==val) return idx;
          temp = temp.next;
          idx++;
        }
        return -1;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Index out of range");
            return;
        }

        if (idx == 0) {
            addAtHead(val);
        } else if (idx == size) {
            addAtTail(val);
        } else {

            Node temp = head;

            // Move to the node before the insertion position
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;

            size++;
        }
    }

    public void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of range");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size - 1) tail = temp;
        size--;
    }

    int get(int idx){
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

}

public class LinkedListDataStructure {
    public static void main(String[] args) {
          LinkedList ll =  new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);

        ll.display();

        ll.addAtHead(5);
        ll.display();

        ll.deleteAtHead();
        ll.display();

        ll.getSize();

        System.out.println(ll.search(5));

        ll.insert(48,2);
        ll.display();

        ll.delete(2);
        ll.display();

        System.out.println(ll.get(2));


    }
}
