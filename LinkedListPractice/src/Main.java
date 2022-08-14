import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListRoot linkedListRoot = new LinkedListRoot();
        linkedListRoot.insert(1);
        linkedListRoot.insert(2);
        linkedListRoot.insert(3);
        linkedListRoot.insert(4);
        linkedListRoot.insert(5);
        linkedListRoot.display();
        // linkedListRoot.deleteKthNode(2);

        linkedListRoot.deleteNotLastNode(linkedListRoot.head);
        linkedListRoot.display();
        //create a circular LinkedList
        //linkedListRoot.root.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = linkedListRoot.root.nextNode.nextNode.nextNode;


    }
}