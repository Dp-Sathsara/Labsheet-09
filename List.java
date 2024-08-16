public class List {

    public int maxSize;
    public int position;
    public Customer[]entry;

    public List(int x){
        maxSize=x;
        position=-1;
        entry=new Customer[maxSize];
    }
    public boolean isEmpty(){
        return(position==-1);
    }
    public boolean isFull(){
        return(position==maxSize-1);
    }
    public int listSize(){
        return(position+1);
    }
    public void insertLast(Customer x){
        if (isFull()) {
            System.out.println("List is Already Full.");
        }else{
            entry[++position]=x;
        }
    }
    public void insertList(int p,Customer x){
        if (isFull()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            for (int i = listSize(); i > p; i--) {
                entry[i]=entry[i-1];
                entry[p]=x;
                position++;
            }
        }
    }
    public Customer deleteList(int p){
        if (isEmpty()) {
            System.out.println("List is Already Empty.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            Customer y=entry[p];
            for (int i = p; i < listSize()-1; i++) {
                entry[i]=entry[i+1];
                position--;
                return y;
            }
        }
        return null;

        
    }
    public Customer retrieveList(int p){
        if (isEmpty()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            return entry[p];
        }
        return null;
    }
    public void replaceList(int p,Customer x){
        if (isEmpty()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            entry[p]=x;
        }
    }
    public void traverseList(){
        for (int i = 0; i < listSize(); i++) {
            System.out.println(entry[i]);
        }
    }

    public double interestAmount(double x){
        double amount;
        for (int i = 0; i < listSize(); i++) {
            if (retrieveList(i).accountBalance<250000) {
                amount=x*2.5/100;
                return amount;
            }else if (retrieveList(i).accountBalance>250000 && retrieveList(i).accountBalance<500000) {
                amount=x*5.0/100;
                return amount;
            }else if (retrieveList(i).accountBalance>500000 && retrieveList(i).accountBalance<750000) {
                amount=x*7.5/100;
                return amount;
            }else if (retrieveList(i).accountBalance>750000 && retrieveList(i).accountBalance<1000000) {
                amount=x*8.0/100;
                return amount;
            }else if (retrieveList(i).accountBalance>1000000 && retrieveList(i).accountBalance<1500000) {
                amount=x*9.5/100;
                return amount; 
            }  
            
        }
        return 0;
    }
    public void printinterestAmount(){
        for (int i = 0; i < listSize(); i++) {
            System.out.println(entry[i].accountNumber+"\t\t"+entry[i].customerName+"\t"+interestAmount(entry[i].accountBalance));
        }
    }
    public void totalAccountBalance(){
        double total;
        for (int i = 0; i < listSize(); i++) {
            total=entry[i].accountBalance+interestAmount(entry[i].accountBalance);
            System.out.println(entry[i].accountNumber+"\t\t"+entry[i].customerName+"\t"+total);
        }
    }
    public void quickSort(int low,int hight){
        if (low<hight) {
            int x=partition(low,hight);
            quickSort(low, x-1);
            quickSort(x+1, hight);
        }
    }
    private int partition(int low, int hight) {
        double pivot = entry[hight].accountBalance + interestAmount(entry[hight].accountBalance);
        int i = low - 1;
        for (int j = low; j < hight; j++) {
            if (entry[j].accountBalance + interestAmount(entry[j].accountBalance) <= pivot) {
                i++;
                Customer temp = entry[i];
                entry[i] = entry[j];
                entry[j] = temp;
            }
        }
        Customer temp = entry[i + 1];
        entry[i + 1] = entry[hight];
        entry[hight] = temp;
        return i + 1;
    }
    public void displaycustomerWithHightBalance(){
        for (int i = 0; i < listSize(); i++) {
            double totalBalance=entry[i].accountBalance+interestAmount(entry[i].accountBalance);
            if (totalBalance>1000000) {
                System.out.println(entry[i]);
            }
        }
    }
    public double calculateTotalSavingsBalance(String x) {
        double totalSavings = 0;
        for (int i = 0; i < listSize(); i++) {
            if (x.equalsIgnoreCase(entry[i].accountType)) {
                double totalBalance = entry[i].accountBalance + interestAmount(entry[i].accountBalance);
                totalSavings += totalBalance;
                System.out.println(entry[i]);
            }
        }
        return totalSavings;
    }
    public void calculateSavingspercentage(){
        double totalsavings=calculateTotalSavingsBalance("savings");
        double totalBalance=0;

        for (int i = 0; i < listSize(); i++) {
            totalBalance+=entry[i].accountBalance+interestAmount(entry[i].accountBalance);
        }
        System.out.println("\nTotal savings Balance: "+totalsavings);
        System.out.println("Total Balance: "+totalBalance);
        System.out.println("\nPercentage of Savings in Total Balance: "+(totalsavings/totalBalance)*100+" %");
    }

}