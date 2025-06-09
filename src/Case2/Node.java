package Case2;

public class Node {
    Kendaraan data;
    Node next;

    public Node(Kendaraan data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Kendaraan data) {
        this.data = data;
    }
}
