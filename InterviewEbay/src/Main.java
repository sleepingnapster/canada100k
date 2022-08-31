import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Map<Integer,Integer> m = new HashMap<>();
        m.
        /*
 * Write a method to replace all spaces in a char array with %20


Input : Have a nice day
Output : Have%20a%20nice%20day

 */

//
//
//        replaceSpace (char[] inputArray, int stringLength)
//        {
//            int spaceCount = 0;
//            for(int i=0;i<stringLength;i++)
//            {
//                if(inputArray[i]){
//                    spaceCount++;
//                }
//                spaceCount*=2;
//
//                if(inputArray.length>=stringLength+spaceCount)
//                {
//                    //enough space
//                    int backpointer = stringLength+spaceCount;
//                    for(int i = stringLength; 0<=i; i--){
//                        if(inputArray[i]!=' '){
//                            inputArray[backpointer] = inputArray[i];
//                        }else{
//                            inputArray[backpointer--] = '0';
//                            inputArray[backpointer--] = '2';
//                            inputArray[backpointer] = '%';
//                        }
//                        backpointer--;
//                    }
//
//                }else{
//                    char[] newCharArray = new char[stringLength+spaceCount];
//                    int icount=0;
//                    int icount2=0;
//                    while(icount<stringLength+spaceCount)
//                    {
//                        if(newCharArray[icount]!=' '){
//                            newCharArray[icount] = inputArray[icount2];
//                        }else{
//                            newCharArray[icount++] = '%';
//                            newCharArray[icount++] = '2';
//                            newCharArray[icount] = '0';
//                        }
//                        icount++;
//                        icount2++;
//                    }
//                    return newCharArray;
//                }
//
//
//
//
//            }
    }
}