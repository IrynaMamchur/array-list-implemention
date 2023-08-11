public class NodeGraph {

    NodeGraph left;
    NodeGraph right;
    String value;

    public NodeGraph(NodeGraph left, NodeGraph right, String value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public boolean hasNext() {
        return right != null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public void setLeft(NodeGraph left) {
        this.left = left;
    }

    public void setRight(NodeGraph right) {
        this.right = right;
    }
}

