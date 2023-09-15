public class Main{
    public static void main(String[] args){

    }
}

abstract class List {
    public void print(){};                                                   
    public boolean addAtStart(int element){return false;};                                
    public boolean addAtEnd(int element){return false;};                                  
    public boolean addAtLocation(int location,int element){return false;};                
    public int delAtEnd() throws Exception{return -1;};
    public int delAtStart() throws Exception{return -1;};
    public int delAtLocation(int location) throws Exception{return -1;};
    public int LinearSearch(int element){return -1;};                                  
    public int binarySearch(int element){return -1;};                                  
    public boolean sorting(int order){return false;};                                     
    public void updateArray(int element,int location){};                              
    
}

class Node {
    int data;
    Node next;

    public Node(){
        this.data=0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList extends List{
    
}