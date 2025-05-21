package jobsheet12;

public class StudentQueue {
    NodeStudent front, rear;
    int size, maxSize;

    public StudentQueue(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    public void enqueue(StudentAssignment student) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        NodeStudent newNode = new NodeStudent(student);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
            }
        size++;
        System.out.println("Student added to queue.");
    }

    public StudentAssignment dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        StudentAssignment data = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return data;
    }

    public void displayFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front student:");
            front.data.print();
        }
    }

    public void displayRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Rear student:");
            rear.data.print();
        }
}



    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        NodeStudent temp = front;
        int idx = 1;
        while (temp != null) {
            System.out.println("Student #" + idx++);
            temp.data.print();
            System.out.println("-----------------");
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}

