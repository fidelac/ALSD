package jobsheet11;

public class StudentQueue {
    Student[] data;
    int front, rear, size, max;

    public StudentQueue(int n){
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
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

    void enqueue(Student dt){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear+1)%max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is succesfully added at index %d\n", dt.name, rear);
    }

    Student dequeue(){
        if(isEmpty()){ 
            System.out.println("Queue is empty!!!"); 
            return null; 
        } 
        Student dt = data[front]; 
        front = (front+1)%max; 
        size--; 
        return dt; 
    }

    void peek(){
        if(!isEmpty()){ 
            System.out.println("Front data: "); 
            data[front].print(); 
        }else{ 
            System.out.println("Queue is empty!!!"); 
        }
    }

    void print(){ 
        if(isEmpty()){ 
            System.out.println("Queue is empty!!!"); 
            return; 
        } 
        int i = front; 
        while(i != rear){ 
            data[i].print(); 
            i = (i+1)%max; 
        } 
        data[i].print(); 
        System.out.println("Number of element: "+size); 
    }

    public void viewRear(){
        if (size == 0){
            System.out.println("Queue is empty!!!");
        } else {
            System.out.println("Rear data: ");
            data[rear].print();
        }
    }
}
