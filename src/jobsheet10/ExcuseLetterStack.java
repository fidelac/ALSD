package jobsheet10;

public class ExcuseLetterStack {
    ExcuseLetter13[] stack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        stack = new ExcuseLetter13[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(ExcuseLetter13 letter) {
        if (!isFull()) {
            stack[++top] = letter;
        } else {
            System.out.println("Stack is full! Cannot add more letters.");
        }
    }

    public ExcuseLetter13 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty! Cannot remove any letters.");
            return null;
        }
    }

    public ExcuseLetter13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty! No letters to view.");
            return null;
        }
    }

    public ExcuseLetter13 searchByName(String name) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null; 
    }



}
