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

    // function to display the LL
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
