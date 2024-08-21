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
}
