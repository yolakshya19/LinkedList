public class DLL {

    Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    // function to insert at start
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    // function to insert at last
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    // function to display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // function to display in reverse
    public void displayRev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            last = temp;    // this will go till last node
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        while(last != null){
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.print("start");
        System.out.println();
    }
}
