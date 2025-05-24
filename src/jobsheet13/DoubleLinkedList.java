package jobsheet13;

public class DoubleLinkedList {
    Node head;
    Node tail;

    int size(){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    DoubleLinkedList() {
        head = null; // menginisialisasi head list kosong / nilainya null
        tail = null; // menginisialisasi tail list kosong / nilainya null
    }

    boolean isEmpty() {
        return head == null; // untuk mengecek listnya kosong 
    }

    void addFirst(Student data) { // add node bary didepan = head
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head; // Node baru menunjuk ke head lama
            head.prev = newNode; //node head lama menunjuk balik ke node baru sebagai prev
            head = newNode; // menunjukan node baru sebagai head baru
        }
    }

    void addLast(Student data) { // add node baru di belakang = tail
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode; // Node tail lama menunjuk ke node baru
            newNode.prev = tail; // Node baru menunjuk balik ke tail lama sebagai prev
            tail = newNode; // menunjukan node baru sebagai tail baru
        }
    }

    void insertAfter(String key, Student data) { //menyisipkan node baru stlh node dngn NIM tertentu
        Node newNode = new Node(data);
        Node temp = head; 
        while (temp != null) { 
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next; // node baru menunjuk ke node setelah temp
                    newNode.prev = temp; // node baru menunjuk balik ke temp sebagai prev
                    temp.next.prev = newNode; // node setelah temp menunjuk balik ke node baru sebagai prev
                    temp.next = newNode; // node temp menunjuk ke node baru sebagai next
                }
            }
            temp = temp.next; 
        }

        if (temp == null) {
            System.out.println("Insertion failed. data (" + key + ") not found!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    void removeFirst() { //menghapus node pertama/head
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null; // jika hanya ada satu node, set head dan tail menjadi null
        } else {
            head = head.next;
            head.prev = null; // mengatur prev dari head baru menjadi null
        }
    }

    void removeLast() { // menghapus node terakhir/tail
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null; // jika hanya ada satu node set head dan tail menjadi null
        } else {
            tail = tail.prev; // mengatur tail menjadi node sebelumnya
            tail.next = null; //mengatur next dari tail baru menjadi null
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }

        // count node
        int count = 0;
        Node tempCount = head;
        while (tempCount != null) {
            count++;
            tempCount = tempCount.next;
        }

        // check valid index
        if (index < 0 || index >= count) {
            System.out.println("Index out of bounds!");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // Add an add() function 
    void add(int index, Student data) { // menambahkan node baru di posisi/index tertentu
        if (index < 0 || index > size()) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size()) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next; // Node baru menunjuk ke node setelah temp
            newNode.prev = temp; // Node baru menunjuk balik ke temp sebagai prev
            temp.next.prev = newNode;  // Node setelah temp menunjuk balik ke node baru sebagai prev
            temp.next = newNode; // Node temp menunjuk ke node baru sebagai next
        }
    }

    // Add remove After
    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next != null) {
                    Node toRemove = temp.next;
                    if (toRemove == tail) {
                        removeLast();
                    } else {
                        temp.next = toRemove.next;
                        if (toRemove.next != null) {
                            toRemove.next.prev = temp;
                        }
                    }
                } else {
                    System.out.println("No node after " + key + " to remove.");
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node with key " + key + " not found.");
    }

    // Add get first
    Student getFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return head.data;
    }

    // Add get last
    Student getLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return tail.data;
    }

    // Add get at index
    Student getIndex(int index) {
        if (index < 0 || index >= getSize()) {
            System.out.println("Index out of bounds!");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Add get size
    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Add index of
       int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // not found
    }

}
