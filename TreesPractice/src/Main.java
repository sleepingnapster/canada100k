public class Main {
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(5);
        bst.insert(2);
        bst.insert(4);
        bst.insert(2);
        bst.insert(8);
        bst.insert(100);

        System.out.println("inOrderTraversal");
        bst.inOrderTraversal();
        System.out.println( bst.search(6));
        bst.deleteData(100);
        bst.insert(2);
        bst.deleteData(4);
        bst.deleteData(2);
        bst.deleteData(8);
        bst.deleteData(2);
        bst.deleteData(5);
        bst.deleteData(2);
        System.out.println("preOrderTraversal");
        bst.preOrderTraversal();
//        System.out.println("postOrderTraversal");
//        bst.postOrderTraversal();

        System.out.println(bst.search(6));


    }
}