package jobsheet10;

import java.util.Scanner;

    public class ExcuseLetterDemo {
        public static void main(String[] args) {
            ExcuseLetterStack stack = new ExcuseLetterStack(10); 
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Submit Excuse Letter");
                System.out.println("2. Process Excuse Letter");
                System.out.println("3. View Latest Excuse Letter");
                System.out.println("4. Search for Letter");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1: 
                        System.out.print("Enter ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Class: ");
                        String className = sc.nextLine();
                        System.out.print("Enter Type of Excuse (S for Sick, I for Other): ");
                        char typeOfExcuse = sc.nextLine().charAt(0);
                        System.out.print("Enter Duration (in days): ");
                        int duration = sc.nextInt();
                        sc.nextLine(); 

                        ExcuseLetter13 letter = new ExcuseLetter13(id, name, className, typeOfExcuse, duration);
                        stack.push(letter);
                        System.out.println("Excuse letter submitted successfully!");
                        break;
                    case 2: 
                        ExcuseLetter13 processedLetter = stack.pop();
                        if (processedLetter != null) {
                            System.out.println("Processing the following excuse letter:");
                            processedLetter.display();
                        }
                        break;

                    case 3: 
                        ExcuseLetter13 latestLetter = stack.peek();
                        if (latestLetter != null) {
                            System.out.println("Latest excuse letter:");
                            latestLetter.display();
                        }
                        break;

                    case 4:
                        System.out.print("Enter the name to search: ");
                        String searchName = sc.nextLine();
                        ExcuseLetter13 foundLetter = stack.searchByName(searchName);
                        if (foundLetter != null) {
                            System.out.println("Excuse letter found:");
                            foundLetter.display();
                        } else {
                            System.out.println("No excuse letter found for the given name.");
                        }
                        break;

                    case 5: 
                        System.out.println("Exiting the program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 5);

            sc.close();
        }
    }

