public class LinkedListImplementation {

    Node head;
    public void add(int element) {
        if(head == null){
            head = new Node(null, null, element);
        }
        else{
            Node lastNode = findLast();
            Node node = new Node (lastNode, null, element);
            lastNode.right = node;
        }
    }

    private Node findLast(){
        Node node = head;
        while(node.hasNext()){
            node = node.right;
        }
        return node;
    }
}
