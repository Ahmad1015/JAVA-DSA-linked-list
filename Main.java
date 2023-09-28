public class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addAtStart(5);
        ll.addAtStart(4);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.addAtStart(1);
        ll.print();
        ll=LinkedListReverse(ll);
        ll.print();
    }
    public static LinkedList LinkedListReverse(LinkedList lObject){
        if(lObject.head == null){
            System.out.println("List is empty");
            return lObject;
        }
        else{
            Node curr = lObject.head;
            Node nextcurr = curr.next;
            Node temp;
            while(nextcurr!=null){
                temp = nextcurr.next;
                nextcurr.next = curr;
                curr = nextcurr;
                nextcurr = temp;
            }
            lObject.head.next = null;
            lObject.head = curr;
        }
        return lObject;
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
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
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
            tail = newNode;
            return;
        }
        else{
            tail.next = newNode;
            tail= newNode;
        }
        
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
        if (head == null){
            System.out.println("List is Empty\nCannot Perform this Action");
            return null;
        }
        else if (head == tail){
            head = null;
            tail = null;
            size--;
        }
        else{
            Node curr = head;
            while(curr.next!=tail){
                curr=curr.next;
                Node Temp = tail;
                curr.next = null;
                tail = curr;
                size--;
                return Temp;
            }
        }
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

}