public class Node {
    Node[] children;
    int terminating;


    public Node() {
        this.children = new Node[26];
        this.terminating = 0;
    }
}
