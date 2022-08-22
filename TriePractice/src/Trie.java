public class Trie {
    private static Node root = new Node();

    public static void add(String s) {
        Node current = root;
        int index;
        for (int i = 0; i < s.length(); i++) {

            index = s.charAt(i) - 'a';
            if (current.children[index] == null) {
                //create Node
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.terminating++;
    }

    public boolean search(String s) {
        Node current = root;
        int index;
        for (int i = 0; i < s.length(); i++) {

            if (current.children[s.charAt(i) - 'a'] == null) {
                return false;
            }
            current = current.children[s.charAt(i) - 'a'];
        }
        if (0 < current.terminating) {
            return true;
        }
        return false;
    }

    public void delete(String s) {
        Node current = root;
        int index;
        for (int i = 0; i < s.length(); i++) {

            index = s.charAt(i) - 'a';
            if (current.children[index] == null) {
                throw new RuntimeException("String does not exist");
            }
            current = current.children[index];
        }
        if (0 < current.terminating) {
            current.terminating--;
        } else {
            throw new RuntimeException("String does not exist");
        }
    }
}
