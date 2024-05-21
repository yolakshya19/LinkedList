import java.util.NoSuchElementException;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // function to add a node at the beginning of the LL
    public void addFirst(int val){
        // create node
        Node node = new Node(val);

        // point node--> to head
        node.next = head;

        // make new node as the head
        head = node;


        // check if LL was empty
        if(size == 0){
            // if true then tail and head will be the same
            tail = head;
        }

        size++;
    }


    // function to add a node at last of the LL
    public void addLast(int val){

        Node node = new Node(val);
        // empty LL
        if(size == 0){
            addFirst(val);
            return;
        }


        // need of traversal if tail is not given
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = node;
//        tail = node;

        // directly access via tail
        tail.next = node;
        tail = node;

        size++;
    }

    // function to add a node at a particular index(n)
    public void addIndex(int val, int n){
        if(n==0){
            addFirst(val);
            return;
        }
        if(n==size){
            addLast(val);
            return;
        }
        Node temp = head;
        for(int i=0;i<n-1;i++){
            temp = temp.next;
        }
//        Node node = new Node(val);
//        Node temp2 = temp.next;     // instead of this we can directly create a node with next value in constructor
        Node node = new Node(val, temp.next);
        temp.next = node;
//        node.next = temp2;
        size++;
    }

    // function to delete node from start
    public int deleteFirst(){
        if (head == null) { // Case for an empty list
            throw new NoSuchElementException("List is empty");
        }
        int val = head.val;
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
        size--;
        return val;
    }

    // function to delete the node from last
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.val;
        Node secondLast = getNode(size - 2);
        tail = secondLast;
        tail.next = null;
        return val;
    }

    private Node getNode(int index) {
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    // function to display the LL
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // function to get the size of LL
    public int getSize(){
        return size;
    }

}
