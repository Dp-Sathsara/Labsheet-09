package LinkedUserinput;

import java.util.Scanner;

public class Main {
    
    public static void loadData(List list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number Of Customers You want to insert: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < number; i++) {
            System.out.println("----------Customer " + (i + 1) + " -------");
            System.out.print("Account Number: ");
            String accountNo = scanner.next();
            System.out.print("\tFirst Name: ");
            String firstName = scanner.next();
            System.out.print("\tLast Name: ");
            String lastName = scanner.next();
            String cuName = firstName + " " + lastName;
            System.out.print("\tAccount Type: ");
            String accType = scanner.next();
            System.out.print("\tAccount Balance: ");
            double accBalance = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            Customer c = new Customer(accountNo, cuName, accType, accBalance);
            list.insertLast(c);
        }          
    }

    public static void main(String[] args) {
        List list = new List(); 
        loadData(list);

        System.out.println("\n*****************************Part(a)****************************************************");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Account Number\t"+"Customer Name\t\t"+"Account Type\t"+"Account Balance(as of 2024.01.01)");
        System.out.println("------------------------------------------------------------------------------------------");
        list.traverseList();
        System.out.println("------------------------------------------------------------------------------------------");

        list.serching(); 
        System.out.println("--------------------------------");

        System.out.println("------------------------");
        list.printinterestAmount(); 

        System.out.println("===================");
        list.totalAccountBalance(); 
    }
}
