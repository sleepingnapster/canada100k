import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> sotOfStrings = new HashSet<>();
        sotOfStrings.add("asdfg");
        sotOfStrings.add("asdrt");
        sotOfStrings.add("asdcvbnm");
        sotOfStrings.add("asdfghjkl");
        sotOfStrings.add("asdrtyuio");
        sotOfStrings.add("asdrtyhjk");

        Trie trie = new Trie();
        sotOfStrings.forEach(Trie::add);
        trie.add("test");
        trie.add("test");
        System.out.println(trie.search("test"));
        System.out.println(trie.search("test"));
        trie.delete("test");
        System.out.println(trie.search("asdrtyhjk"));
    }
}