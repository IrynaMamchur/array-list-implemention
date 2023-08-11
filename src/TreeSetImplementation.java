public class TreeSetImplementation {
    Node root;


    public void add(int element) {
        if (root == null) {
            createRoot(element);
        }
        else {
            search(element);
        }
    }

    private void createRoot(int element) {
        Node node = new Node(null, null, element);
        root = node;
    }


    private void search(int element) {
        Node current = root;
        boolean searching = true;

        while (searching) {

            if (element < current.value && current.left != null) {

                    current = current.left;
                }
            if (element < current.value && current.left == null) {

                    current.left = new Node(null, null, element);
                    searching = false;
                }

            if (element > current.value && current.right != null) {
                    current = current.right;
                }
            if (element > current.value && current.right == null)  {
                    current.right = new Node(null, null, element);
                    searching = false;
                }

            if (element == current.value) {
                return;
            }
        }

    }

// ПЕРВЫЙ ВАРИАНТ


    //  Node root;
    //
    //    public void add(int element) {
    //        if (root == null) {
    //            Node node = new Node(null, null, element);
    //            root = node;
    //        }
    //        else {
    //            search(element);
    //        }
    //    }
//    public void add(int element) {
//        if (root == null) {
//            Node node = new Node(null, null, element);
//            root = node;
//        } else {
//            Node current = root;
//            boolean searching = true;
//
//            while (searching) {
//
//
//                if (element < current.value) {
//                    if (current.left !=null){
//                        //идем налево
//                        current = current.left;
//                    } else{
//                        current.left = new Node(null, null, element);
//                   searching = false;
//                    }
//                }
//                if (element > current.value) {
//                    // направо
//                    if (current.right !=null){
//                        //идем налево
//                        current = current.right;
//                    } else{
//                        current.right = new Node(null, null, element);
//                        searching = false;
//                    }
//
//                }
//                if (element == current.value) {
//                    return;//  в сет не может быть одинаковых значенийБ только уникальные
//                }
//
//
            }




