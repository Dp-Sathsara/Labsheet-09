package LinkedImlimentation;

public class List {
    private Node head;
    private int count;
    public List(){
        head=null;
        count=0;
    }
    public boolean isEmpty(){
        return(head==null);
    }
    public int listSize(){
        return(count);
    }
    public void insertLast(Customer x){
        Node node=new Node();
        node.data=x;
        node.next=null;
        if (head==null) {
            head=node;
        }else{
            Node n=head;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
        count++;
    }
    public void insertList(int p,Customer x){
        Node node=new Node();
        node.data=x;
        node.next=null;
        if (p<0||p>listSize()) {
            System.out.println("Position is Out of the List.");
        }else{
            Node n=head;
            for (int i = 0; i < p-1; i++) {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
            count++;
        }
    }
    public void deleteList(int p){
        if (isEmpty()) {
            System.out.println("List is Already Empty.");
        }else{
            if (p<0||p>listSize()) {
                System.out.println("Position is Out of the List.");
            }else if (p==0) {
                head=head.next;
            }else{
                Node n=head;
                Node tempN=null;
                for (int i = 0; i < p-1; i++) {
                    n=n.next;
                }
                tempN=n.next;
                n.next=tempN.next;
                tempN=null;
            }
            count--;
        }
    }
    public void traverseList(){
        Node n=head;
        while (n.next!=null) {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
    public  Customer retrieveList(int p){
        if (isEmpty()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            Node n=new Node();
            n.next=head;
            for (int i = 0; i < p-1; i++) {
                n=n.next;
            }
            n=n.next;
            return n.data;
        }
        return null;
    }
    public void replaceList(int p,Customer x){
        if (isEmpty()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            Node n=new Node();
            n.next=head;
            for (int i = 0; i < p-1; i++) {
                n=n.next;
            }
            n=n.next;
            n.data=x;
        }
    }
    public void quickSort(){
        
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void serching(){
        System.out.println(retrieveList(3));
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
        Node n=new Node();
        n.next=head;
        for (int i = 0; i < listSize(); i++) {
            n=n.next;
            System.out.println(n.data.accountNumber+"\t\t"+n.data.customerName+"\t"+interestAmount(n.data.accountBalance));
        }
    }
    public void totalAccountBalance(){
        double total;
        Node n=new Node();
        n.next=head;
        for (int i = 0; i <listSize() ; i++) {
            n=n.next;
            total=n.data.accountBalance+interestAmount(n.data.accountBalance);
            System.out.println(n.data.accountNumber+"\t"+n.data.customerName+"\t"+total);
        }
    }
}