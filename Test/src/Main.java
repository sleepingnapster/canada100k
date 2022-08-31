import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(decodeString("A0B4"));
    }

    static String decodeString(String inputStr){

        if(inputStr.length()==0)return "";

        StringBuilder sb = new StringBuilder();
        int index=0;
        int numcount =0;
        while(index<inputStr.length()){
            char temp = inputStr.charAt(index);
            numcount =index+1;
            while(numcount<inputStr.length() && isNumber(inputStr.charAt(numcount))){
                numcount++;
            }
            Long tempNum = Long.parseLong(inputStr.substring(index+1,numcount));

            for(int i=0;i<tempNum;i++){
                sb.append(temp);
            }
            index = numcount;
        }
        return sb.toString();
    }

    static boolean isNumber(char c){
        return numbers.contains(c);
    }

    static Set<Character> numbers =  new HashSet<>();
    static{
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
    }
}