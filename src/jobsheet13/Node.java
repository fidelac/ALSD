package jobsheet13;

public class Node {
    Student data;
    Node prev;
    Node next;

    public Node(){

    }

    public Node(Student data){
        this.data = data;
        prev = null;
        next = null;

    }

    public Node (Student data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
