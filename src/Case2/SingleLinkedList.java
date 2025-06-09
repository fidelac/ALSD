package Case2;

public class SingleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    boolean isEmpty(){
        return (head == null);
    }

    void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("LinkedList Data: ");
            while(tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty!!");
        }
    }

    void addLast(Kendaraan kendaraan){
        Node newNode = new Node(kendaraan, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
        } else if(head == tail){
            head = tail = null;
            size --;
        } else {
            head = head.next;
            size--;
        }
    }

    void peek(){
        if(!isEmpty()){
            System.out.println("Front data: ");
            head.data.print();
        } else {
            System.out.println("LinkedList is empty!!");
        }
    }
}
