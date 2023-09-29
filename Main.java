public class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addAtStart(5);
        ll.addAtStart(4);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.addAtStart(1);
        




        // LinkedList l2 = new LinkedList();
        // l2.addAtStart(50);
        // l2.addAtStart(40);
        // l2.addAtStart(30);
        // l2.addAtStart(20);
        // l2.addAtStart(10);
        
        // ll.print();
        // LinkedList l3 = mergeLinkedList(ll, l2);
        // System.out.println("The new List");
        // l3.print();
        // System.out.println("List 1");
        // ll.print();
        // System.out.println("List 2");
        // l2.print();
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
    public static LinkedList mergeLinkedList(LinkedList object_1,LinkedList object_2){
        LinkedList temp = clone(object_1);
        temp.tail.next = object_2.head;
        temp.tail = object_2.tail;
        return temp;
    }
    public static LinkedList clone(LinkedList object_1){
        LinkedList temp = new LinkedList();
        if(object_1.head == null){
            return temp;
        }
        Node currNode = object_1.head;
        while(currNode != null){
            temp.addAtEnd(currNode.data);
            currNode = currNode.next;
        }
        return temp;
    }
}

abstract class List {
    abstract public void print();                                                   
    abstract public void addAtStart(int element);                                
    abstract public void addAtEnd(int element);                                  
    public boolean addAtLocation(int location,int element){return false;};                
    public Node delAtEnd(){return null;};
    public Node delAtStart(){return null;};
    public Node delAtLocation(int location){return null;};
    abstract public Node search(int element);                                                                 
    public boolean sorting(int order){return false;};                                     
    abstract public void UpdatedLinkedList(int element,int elementToFind);
    public Node removeDuplicatesFromSortedList(){return null;};
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
            newNode.next = head;
            head = newNode;
            if (tail == null)
                tail=head ;
            size++;
    }

    public void addAtEnd(int element){
        Node newNode = new Node(element);
        size++;
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

    public boolean addAtLocation(int location,int element){
        if(location>=0 &&location<=size){                       // Validation if location is valid or not
            if(location == 0)
                addAtStart(element);
            else if (location == size)
                addAtEnd(element);
            else{
                int counter = 0;
                Node curr = head;
                Node temp = new Node(element);
                while(curr.next!=null){
                    if (counter==location-1){
                        temp.next = curr.next;
                        curr.next = temp;
                    }
                    counter++;
                    curr = curr.next;
                }
            }
            return true;
        }
        else{
            System.out.println("Location is not Valid");
        }                        
        return false;
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

    public Node delAtLocation(int elementToFind){
        Node toRemove = search(elementToFind);
        // Complete Later
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
    public void UpdatedLinkedList(int updatedValue,int elementToFind){
        Node result = search(elementToFind);
        if (result == null){
            System.out.println("List is empty");
            return;
        }
        else{
            Node currNode = head;
            while(currNode!=null){
                if (currNode == result)
                    currNode.data = updatedValue;
                currNode = currNode.next;
            }
        }

        }
    
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