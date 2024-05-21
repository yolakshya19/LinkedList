public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(8);
        list.addFirst(15);
        list.addLast(58);
        list.addFirst(2);
        list.addIndex(71,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println("size is " + list.getSize());
        System.out.println("new list");
        LL list2 = new LL();
        list2.addFirst(4);
        list2.display();
        System.out.println(list2.deleteFirst());
        list2.display();
        System.out.println("size is " + list2.getSize());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(3));
        list.display();
    }
}