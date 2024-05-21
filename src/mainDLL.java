public class mainDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
//        list.display();
        list.insertFirst(7);
//        list.display();
        list.insertFirst(5);
//        list.display();
        list.insertFirst(74);
//        list.display();
        list.displayRev();
        list.insertLast(47);
//        list.displayRev();
        DLL list2 = new DLL();
        list2.insertLast(4);
        list2.display();
    }
}
