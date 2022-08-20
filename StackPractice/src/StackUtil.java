
import java.util.HashMap;
import java.util.Map;

public class StackUtil {

    public Map<Character, Character> brackets;

    {
        brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('<', '>');
    }


    public static void bracketChecker(String input) {
    }
}
