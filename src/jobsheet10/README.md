|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020046  |
| Nama |  Fidela Clarisa |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/fidelac/ALSD.git) |

# Labs #7
## Question 2.1.3
1. Role of Stack in Assignment Management System
The stack data structure is used to manage student assignments in a Last-In-First-Out (LIFO) manner. This mimics the real-world scenario where a lecturer grades assignments starting from the most recently submitted one (top of the stack). A stack was chosen over a queue or list because:
    - LIFO behavior matches the grading workflow (most recent submissions are graded first).
    - Simplicity: Only the top assignment needs to be accessed for grading, which aligns with stack operations (push, pop, peek).
    - Efficiency: Stack operations (push, pop) are O(1) time complexity, making it efficient for this use case.

2.  - push(Student std): Adds a student assignment to the top of the stack. Used when students submit assignments, in this program, it is used to add a new Student13 object when a student submits their assignment. --> stack.push(new Student("1001", "Bima", "11"));
    - pop(): Removes and returns the top assignment from the stack. Used when the lecturer grades an assignment. In this program, it is used to retrieve and grade the most recently submitted assignment. --> Student graded = stack.pop(); graded.grading(85); 
    
3. The !isFull() check ensures the stack has space before adding a new assignment. If removed:
    - Array Index Out of Bounds: If top exceeds size-1, it will cause a runtime error when accessing stack[top].
    - Data Corruption: Unchecked pushes could overwrite existing data or crash the program.

4. - The stack's capacity is set by the size parameter in the constructor. In the demo, it is 5: --> StudentAssignmentStack stack = new StudentAssignmentStack(5); in line StudentDemo
    - The actual storage limit is defined in StudentAssignmentStack: --> stack = new Student[size]; In line StudentAssignmentStack constructor

5. - add a bottom pointer that only updates when the first element is pushed to Track the first submission. in StudentAssignmentStack Class
    - Add a new menu option (case 5) to display the first student in studentDemo class

6. add a countAssignments() method to StudentAssignmentStack that returns the current number of assignments.

    int count() {
        return top + 1; 
    }

    - If the stack is empty (top = -1), it returns 0.
    - If 3 assignments are pushed (top = 2), it returns 3.
    - Add a new menu option (case 6) to count count the number of tasks student in studentDemo class

7. From this experiment, learned that stack-based systems are ideal for managing tasks or data that need to be processed in reverse order of their arrival. A real-world application of this system could be:
    - Undo/Redo functionality in text editors: The most recent action is undone first.
    - Browser history navigation: The most recently visited page is revisited first.

## Question 2.2.3
1. The convertToBinary() method converts a decimal number into its binary representation. 
    - Initialize an Empty String: A String variable binary is initialized to store the binary representation.
    - Loop Until grade > 0:The loop continues as long as the grade is greater than 0.
    - Calculate the Remainder: The remainder of grade % 2 is calculated. This gives the least significant bit (LSB) of the binary representation (either 0 or 1).
    - Prepend the Remainder to the Binary String: The remainder is added to the front of the binary string.
    - Divide the Grade by 2: The grade is divided by 2 to move to the next bit.
    - Return the Binary String: Once the loop ends, the complete binary representation is returned.

2. 
    public String convertToBinary(int grade) {
    String binary = "";
    while (grade != 0) { // Loop until grade becomes 0
        binary = (grade % 2) + binary;
        grade = grade / 2;
    }
    return binary;
    }

    - will be the same as the original implementation. 
    The condition while (grade != 0) is logically equivalent to while (grade > 0) in this context because:
        - The grade starts as a positive integer.
        - The loop reduces grade by dividing it by 2 in each iteration.
        - When grade becomes 0, the loop terminates in both cases.

# Assignment
- Menu Option
    - Submit Excuse Letter: Allows the user to input new excuse letter data and add it to the stack using the push() method.
    - Process Excuse Letter: Removes and displays the latest excuse letter from the stack using the pop() method.
    - View Latest Excuse Letter: Displays the top excuse letter in the stack without removing it using the peek() method.
    - Search for Letter: Searches for an excuse letter by the student's name using the searchByName() method.
    - Exit: Exits the program.

- Output 
Menu:
1. Submit Excuse Letter
2. Process Excuse Letter
3. View Latest Excuse Letter
4. Search for Letter
5. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: Fidel
Enter Class: Ti 1i
Enter Type of Excuse (S for Sick, I for Other): S
Enter Duration (in days): 2
Excuse letter submitted successfully!

Menu:
1. Submit Excuse Letter
2. Process Excuse Letter
3. View Latest Excuse Letter
4. Search for Letter
5. Exit
Enter your choice: 2
Processing the following excuse letter:
ID: 101
Name: Fidel
Class: Ti 1i
Type of Excuse: S
Duration: 2 days



