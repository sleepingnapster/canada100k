public class Main {
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(5);
        bst.insert(2);
        bst.insert(4);
        bst.insert(2);
        bst.insert(8);
        bst.insert(100);
        bst.insert(3);


        System.out.println("inOrderTraversal");
        bst.inOrderTraversal();
        bst.invertBinaryTree();
        System.out.println("inOrderTraversal");
        bst.inOrderTraversal();
//        System.out.println("preOrderTraversal");
//        bst.preOrderTraversal();
//        System.out.println("postOrderTraversal");
//        bst.postOrderTraversal();



    }
}