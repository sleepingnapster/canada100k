public class LinkedListRoot {
    Node root;

    public void insert(int data) {
        Node endNode = new Node(data);
        if (this.root == null) {
            this.root = endNode;
        } else {
            Node node = this.root;
            while (node.nextNode != null) {
                node = node.nextNode;
            }
            node.nextNode = endNode;
        }
    }


    public void delete(int data) {
        Node currentNode = this.root;
        //for head
        if (this.root.data == data) {
            this.root = currentNode.nextNode;
        }

        //for rest
        while (currentNode.nextNode != null && currentNode.nextNode.data != data) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode.nextNode != null && currentNode.nextNode.data == data) {
            currentNode.nextNode = currentNode.nextNode.nextNode;
        }
    }

    public void display() {
        Node currentNode = this.root;
        if (currentNode != null) {
            System.out.print(currentNode.data);
            while (currentNode.nextNode != null) {
                System.out.print(" -> ");
                currentNode = currentNode.nextNode;
                System.out.print(currentNode.data);
            }
            System.out.println();
        }


    }

}
