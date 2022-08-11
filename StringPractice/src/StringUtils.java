public class StringUtils {
    public String myReverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; 0 <= i; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public String myReverseWords(String input) {
        if(input== null || input.isEmpty()){
            return input;
        }

        StringBuilder sbSentence = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            sbSentence.append(myReverse(words[i]));
            sbSentence.append(" ");
        }
        ;
        return sbSentence.substring(0, input.length() );
    }
}
