public class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addAtStart(0);
        ll.addAtStart(65);
        ll.print();
    }
}

abstract class List {
    public void print(){};                                                   
    public void addAtStart(int element){};                                
    public void addAtEnd(int element){};                                  
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
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addAtStart(int element){            // void as return type , so even if there is no element in our linked list , we add it
        Node newNode = new Node(element);
        if (head == null){
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
    }

    public void addAtEnd(int element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public boolean addAtLocation(int location,int element){
        // Fill in the rest
        return false;
    }

    public int delAtEnd() throws Exception{
        // Fill in the rest
        return -1;
    }

    public int delAtStart() throws Exception{
        // Fill in the rest
        return -1;
    }
    public int delAtLocation(int location) throws Exception{
     // Fill in the rest
        return -1;
    }
    public int LinearSearch(int element){
        // Fill in the rest
        return -1;
    }                                  
    public int binarySearch(int element){
        // Fill in the rest
        return -1;
    }                                  
    public boolean sorting(int order){
     // Fill in the rest
        return false;
    }                                 
    public void updateArray(int element,int location){
        // Fill in the rest
    };


}