package LinkedImlimentation;

public class MainPromt {
    public static void main(String[] args) {
        Customer c1=new Customer("1001", "Kamal Dissanayake", "savings", 500000);
        Customer c2=new Customer("1002", "Namal Perera\t", "current", 975000);
        Customer c3=new Customer("1003", "Sithumm Udovita\t", "current", 100000);
        Customer c4=new Customer("1004", "Manel Dias\t", "savings", 1250000);
        Customer c5=new Customer("1005", "Chethiya Munasinghe", "savings", 950000);
        Customer c6=new Customer("1006", "Sanju Perera\t", "current", 1500000);
        Customer c7=new Customer("1007", "Lahiru Karunarathna", "savings", 600000);
        Customer c8=new Customer("1008", "Tharanga Prasad\t", "savings", 400000);
        Customer c9=new Customer("1009", "Shashi Dayarathna", "savings", 250000);
        Customer c10=new Customer("1010", "Anju Senanayake\t", "current", 1100000);

        List list=new List();
        list.insertLast(c1);
        list.insertLast(c2);
        list.insertLast(c3);
        list.insertLast(c4);
        list.insertLast(c5);
        list.insertLast(c6);
        list.insertLast(c7);
        list.insertLast(c8);
        list.insertLast(c9);
        list.insertLast(c10);
        System.out.println("\n------Part(a)--------------------------------------------------------------------------");
        System.out.println("\nAccount Number\t"+"Customer Name\t\t"+"Account Type\t"+"Account Balance(as of 2024.01.01)");
        list.traverseList();

        /*System.out.println("\n------Part(b)--------------------------------------------------------------------------");
        System.out.println("\nAccount Number\t"+"Customer Name\t\t"+"Interest Amount");
        list.printinterestAmount();

        System.out.println("\n------Part(c)--------------------------------------------------------------------------");
        System.out.println("\nAccount Number\t"+"Customer Name\t\t"+"Account Balance");
        list.totalAccountBalance();

        System.out.println("\n------Part(d)--------------------------------------------------------------------------");
        list.quickSort(0, 9);
        System.out.println("\nAccount Number\t"+"Customer Name\t\t"+"Account Type\t"+"Account Balance(as of 2024.01.01)");
        list.traverseList();

        System.out.println("\n------Part(e)--------------------------------------------------------------------------");
        System.out.println("\nCustomers with more than 1,000,000 after one year: ");
        list.displaycustomerWithHightBalance();

        System.out.println("\n------Part(f)--------------------------------------------------------------------------");
        System.out.println("\nCustomers with Savings Accounts: ");
        System.out.println("");
        System.out.println("Total Savings Account Balance: "+list.calculateTotalSavingsBalance("savings"));

        System.out.println("\n------Part(g)--------------------------------------------------------------------------");
        System.out.println("\nPercentage of Savings in Total Balance: ");
        list.calculateSavingspercentage();
        System.out.println("-------------------------------------------------------------------------------------------");
*/
    }
    
}
