package jobsheet12;

    public class NodeStudent {
    StudentAssignment data;
    NodeStudent next;

    public NodeStudent(StudentAssignment data) {
        this.data = data;
        this.next = null;
    }
}