package jobsheet10;

public class StudentAssignmentStack13 {
    Student13[] stack;
    int top, size;

    StudentAssignmentStack13(int size) {
        this.size = size;
        stack = new Student13[size];
        top = -1;
    }
    boolean isFull() {
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if (top==-1){
            return true;
        }else{
            return false;
        }
        }

        void push(Student13 std){
            if(!isFull()){
                top++;
                stack[top] = std;
            }else{
                System.out.println("Stack is full!");
            }
        }

        Student13 peek(){
            if(!isEmpty()){
                return stack[top];
            }else{
                System.out.println("There is no data in Stack!");
                return null;
            }
        }

        void print(){
            for(int i=0; i<=top; i++){
                System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
            }
            System.out.println("");
        }
         Student13 pop(){
            if(!isEmpty()){
                Student13 std = stack[top];
                top--;
                return std;
            }else{
                System.out.println("There is no data in Stack!");
                return null;
            }
    }

    public Student13 getFirst() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("There is no data in Stack!");
            return null; 
        }
    }

    int count() {
        return top + 1; 
    }
}

