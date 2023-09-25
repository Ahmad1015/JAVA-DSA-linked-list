public class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addAtStart(5);
        ll.addAtStart(4);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.addAtStart(1);
        ll.print();
        ll.reverseLinkedList();
        ll.print();
    }
}

abstract class List {
    public void print(){};                                                   
    public void addAtStart(int element){};                                
    public void addAtEnd(int element){};                                  
    public boolean addAtLocation(int location,int element){return false;};                
    public Node delAtEnd(){return null;};
    public Node delAtStart(){return null;};
    public Node delAtLocation(int location){return null;};
    abstract public Node search(int element);                                                                 
    public boolean sorting(int order){return false;};                                     
    public void updateArray(int element,int location){};
    public Node removeDuplicatesFromSortedList(){return null;};
    public void reverseLinkedList(){};
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
    int size;

    public LinkedList() {
        this.head = null;
    }

    public void addAtStart(int element){            
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
        System.out.println("null");
    }

    public boolean addAtLocation(int location,int element){
        // Fill in the rest
        return false;
    }

    public Node delAtEnd() {
        // Fill in the rest
        return null;
    }

    public Node delAtStart(){                               
        if (head==null){
                System.out.println("List is empty");
                return null;
        }
        Node currNode = head;
        head = currNode.next;
        size--;
        return currNode;
    }

    public Node delAtLocation(int location){
     // Fill in the rest
        return null;
    }
    public Node search(int element){
            if (head==null){
                System.out.println("List is empty");
                return null;
            }
            Node currNode = head;
            while(currNode!=null){
                if (currNode.data == element)
                    return currNode;
                currNode = currNode.next;
            }
            return null;
    } 

    public boolean sorting(int order){
     // Fill in the rest
        return false;
    }                                 
    public void updateArray(int element,int location){
        // Fill in the rest
    };
    public Node removeDuplicatesFromSortedList(){
        if (head==null)
            return head;
        Node curr = head;
        while(curr.next!=null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
        return head;
    }

    public void reverseLinkedList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            Node curr = head;
            Node nextcurr = curr.next;
            Node temp;
            while(nextcurr!=null){
                temp = nextcurr.next;
                nextcurr.next = curr;
                curr.next = null;
                curr = nextcurr;
                nextcurr = temp;
            }
            head = curr;

        }
    }


}