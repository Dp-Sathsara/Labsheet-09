package Contigous;

public class List {
    private int maxsize;
    private int position;
    private Customer[]arryentry;

    public List(int size){
        maxsize=size;
        position=-1;
        arryentry=new Customer[maxsize];
    }
    public boolean isListFull(){
        return (position==maxsize-1);
    }
    public boolean isListEmpty(){
        return (position==-1);
    }
    public int listSize(){
        return (position+1);
    }
    public void insertLast(Customer x){
        if (isListFull()) {
            System.out.println("List is Already Full.");
        }else{
            arryentry[++position]=x;
        }
    }
    public void insertList(int p,Customer x){
        if (isListFull()) {
            System.out.println("List is Already Full.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            for (int i = listSize(); i > p; i--) {
                arryentry[i]=arryentry[i-1];
                arryentry[p]=x;
            }
        }
    }
    public void deleteList(int p){
        if (isListEmpty()) {
            System.out.println("List is Already Empty.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            for (int i = p; i < listSize()-1; i++) {
                arryentry[i]=arryentry[i+1];
                position--;
            }
        }
    }
    public void retrieveList(int p){
        if (isListEmpty()) {
            System.out.println("List is Already Empty.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
           System.out.println(arryentry[p]);
        }        
    }
    public void replaceList(int p,Customer x){
        if (isListFull()) {
            System.out.println("List is Already Empty.");
        }else if (p<0||p>listSize()) {
            System.out.println("Position is out of the List.");
        }else{
            arryentry[p]=x;
        }
    }
    public void reaverseList(){
        for (int i = 0; i < listSize(); i++) {
            System.out.println(arryentry[i]);
        }
    }
    
}
