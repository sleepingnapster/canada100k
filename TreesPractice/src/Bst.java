public class Bst {

    private Node root;

    public void insert(int inputData) {
        root = insert(root, inputData);
    }

    private Node insert(Node node, int inputData) {
        if (node == null) {
            node = new Node(inputData);
            return node;
        }
        if (inputData < node.data) {
            node.leftNode = insert(node.leftNode, inputData);
        } else if (node.data <= inputData) {
            node.rightNode = insert(node.rightNode, inputData);
        }
        return node;
    }

    public void delete() {

    }


    private Node search(Node node, int inputData) {

        if (node == null) return null;

        if (node.data == inputData) {
            return node;
        } else if (inputData < node.data) {
            return search(node.leftNode, inputData);
        } else if (node.data <= inputData) {
            return search(node.rightNode, inputData);
        }
        return null;
    }

    public boolean search(int inputData) {
        if (search(this.root, inputData) != null) {
            return true;
        }
        return false;
    }


    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //left
        inOrderTraversal(node.leftNode);
        //root
        System.out.print(node.data + " - ");
        //right
        inOrderTraversal(node.rightNode);
    }

    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //root
        System.out.print(node.data + " - ");
        //left
        preOrderTraversal(node.leftNode);
        //right
        preOrderTraversal(node.rightNode);
    }
    public boolean isRoot(Node x) {
        return this.root.data == x.data;
    }

    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //left
        postOrderTraversal(node.leftNode);
        //right
        postOrderTraversal(node.rightNode);
        //root
        System.out.print(node.data + " - ");
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
        System.out.println();
    }

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
        System.out.println();
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
        System.out.println();
    }


    //------------------------
    public Node getParent1(Node node) {
        if (this.root == null) return null;

        return getParent(null, node.data, this.root);
    }

    private Node getParent(Node parent, int data, Node node) {
        if (node == null) return null;
        if (node.data == data) {
            return parent;
        } else if (data < node.data) {
            return getParent(node, data, node.leftNode);
        } else if (node.data <= data) {
            return getParent(node, data, node.rightNode);
        }
        return null;
    }

    public boolean isLeaf(Node x) {
        if (x.leftNode == null && x.rightNode == null) {
            return true;
        }
        return false;
    }

    public boolean hasSingleChild(Node x) {
        if ((x.leftNode == null && x.rightNode != null) || (x.leftNode != null && x.rightNode == null)) {
            return true;
        }
        return false;
    }


    public boolean hasTwoChildren(Node x) {
        if (x.leftNode != null && x.rightNode != null) {
            return true;
        }
        return false;
    }

    public Node getInOrderFirstNode(Node x) {

        if (x == null) return null;

        return getLeftmost(x);
    }

    public Node getLeftmost(Node x) {

        if (x == null) return null;

        while (x.leftNode != null) {
            x = x.leftNode;
        }
        return x;
    }

    public Node deleteData(int data) {
        Node x = search(this.root, data);
        return delete(x);
    }


    public Node delete(Node x) {

        //not found
        if (x == null) {
            return null;
        }

        Node parent = getParent1(x);
        Boolean parentSideTrueLeftFalseRight = null;
        if (parent == null) {
            //root node
        } else if (parent.leftNode != null && parent.leftNode.data == x.data) {
            parentSideTrueLeftFalseRight = true;
        } else if (parent.rightNode != null && parent.rightNode.data == x.data) {
            parentSideTrueLeftFalseRight = false;
        }

//case 1 if leaf node
        if (isLeaf(x)) {
            if (parentSideTrueLeftFalseRight == null) {
                this.root = null;
            } else if (parentSideTrueLeftFalseRight) {
                parent.leftNode = null;
            } else {
                parent.rightNode = null;
            }
            return x;
        }


//if single child

        if (hasSingleChild(x)) {
            if (x.leftNode == null) {
                if (parentSideTrueLeftFalseRight == null) {
                    //root node to delete
                    this.root = x.rightNode;
                } else if (parentSideTrueLeftFalseRight) {
                    parent.leftNode = x.rightNode;
                    return x;
                } else if (!parentSideTrueLeftFalseRight) {
                    parent.rightNode = x.rightNode;
                    return x;
                }
            } else {
                if (parentSideTrueLeftFalseRight == null) {
                    //root node to delete
                    this.root = x.leftNode;
                } else if (parentSideTrueLeftFalseRight) {
                    parent.leftNode = x.leftNode;
                    return x;
                } else if (!parentSideTrueLeftFalseRight) {
                    parent.rightNode = x.leftNode;
                    return x;
                }
            }
        }

        //delete root node


//if 2 children
        if (hasTwoChildren(x)) {
            Node i = getInOrderFirstNode(x.rightNode);
            deleteData(i.data);
            x.data = i.data;
            return null;
        }
        //will not be called
        return null;
    }

    public Node invertBinaryTree() {
        return invertNode(this.root);
    }

    private Node invertNode(Node node) {
        if (node == null) return null;
        Node temp =  invertNode(node.leftNode);;
        node.leftNode = invertNode(node.rightNode);
        node.rightNode = temp;
        return node;
    }
}