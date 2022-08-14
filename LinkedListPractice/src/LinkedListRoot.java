import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

public class LinkedListRoot {
    Node head;

    public void insert(int data) {
        Node endNode = new Node(data);
        if (this.head == null) {
            this.head = endNode;
        } else {
            Node node = this.head;
            while (node.nextNode != null) {
                node = node.nextNode;
            }
            node.nextNode = endNode;
        }
    }

    public void deleteNotLastNode(Node node) {
        if (node == null) {
            System.out.println("Node is null");
            return;
        }

        if (node.nextNode == null) {
            System.out.println("Will not work for last Node");
            return;
        }
        node.data = node.nextNode.data;
        node.nextNode = node.nextNode.nextNode;
    }


    public void delete(int data) {
        Node currentNode = this.head;
        //for head
        if (this.head.data == data) {
            this.head = currentNode.nextNode;
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
        Node currentNode = this.head;
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

    public void deleteSecondHalf() {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.nextNode != null) {
            fast = fast.nextNode.nextNode;
            prev = slow;
            slow = slow.nextNode;
        }
        prev.nextNode = null;
    }

    public int sizeOfList() {
        Node fast = head;
        int fastIndex = 0;
        Node slow = head;
        while (fast != null && fast.nextNode != null) {

            if (fast.nextNode.nextNode != null) {
                fastIndex += 2;
            } else fastIndex += 1;
            fast = fast.nextNode.nextNode;
            slow = slow.nextNode;
        }
        return fastIndex + 1;
    }

    public int deleteKthNode(int k) {
        Node fast = head;
        int fastIndex = 0;
        Node slow = head;
        while (fast != null && fast.nextNode != null) {

            if (fast.nextNode.nextNode != null) {
                fastIndex += 2;
            } else fastIndex += 1;

            fast = fast.nextNode.nextNode;
            slow = slow.nextNode;
        }

        //edge case where k is out of bounds
        if (fastIndex < k) {
            return -404;
        }

        //move up slow pointer to the diff
        int diff = fastIndex / 2 - k;

        System.out.println("diff is " + diff);
        //diff-1 since diff is the index that we want tp delete
        for (int i = 0; i < diff - 1; i++) {
            slow = slow.nextNode;
        }


        if (slow.nextNode != null && slow.nextNode.nextNode != null) {
            slow.nextNode = slow.nextNode.nextNode;
        } else {
            //in case k is the last node
            System.out.println("k is last node");
            slow.nextNode = null;
        }
        return 1;
    }
}
