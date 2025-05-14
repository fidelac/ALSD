package jobsheet11;

public class Queue {
    int[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: " + data[front]);
        } else {
            System.out.println("Queue is Empty!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i]+"");
                i = (i+1) % max;
            }
            System.out.println(data[i]+" ");
            System.out.println("Number of element: "+size);
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!!");
        }
    }

    public void enqueue(int data) {
        if ((rear + 1) % max == front) {
            System.out.println("Queue is full! Overflow condition.");
            System.exit(1); 
        }
        rear = (rear + 1) % max;
        queue[rear] = data;
        size++;
    }
    
    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty! Underflow condition.");
            System.exit(1); 
        }
        front = (front + 1) % max;
        int data = queue[front];
        size--;
        return data;
    }
    

}
