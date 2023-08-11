public class MainForLinkedList {
    public static void main(String[] args) {


        LinkedListImplementation linkedList = new LinkedListImplementation();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);

        System.out.println(linkedList.head);
        System.out.println(linkedList.head.right);
        System.out.println(linkedList.head.right.right);



    }
}
