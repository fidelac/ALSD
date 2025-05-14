package jobsheet11;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max, approved;
    
    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front =0;
        rear = -1;
        approved = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue cleared.");
    }

    public void enqueue(Student dt){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear+1)%max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is succesfully added at index %d\n", dt.name, rear);
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        int processed = Math.min(2, size);
        System.out.println("Processing KRS approval for:");
        for (int i = 0; i < processed; i++) {
            Student s = data[front];
            s.print();
            front = (front + 1) % max;
            size--;
            approved++;
        }
    }

     public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("All students in queue:");
        int idx = front;
        for (int i = 0; i < size; i++) {
            data[idx].print();
            idx = (idx + 1) % max;
        }
    }

    public void printFirstTwo() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("First two students in queue:");
        int idx = front;
        for (int i = 0; i < Math.min(2, size); i++) {
            data[idx].print();
            idx = (idx + 1) % max;
        }
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Last student in queue:");
        data[rear].print();
    }

    public void printStats(int maxStudents) {
        System.out.println("Total students in queue: " + size);
        System.out.println("Total students approved: " + approved);
        System.out.println("Students not yet approved: " + (maxStudents - approved));
    }
}
