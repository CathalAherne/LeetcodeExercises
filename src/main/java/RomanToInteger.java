import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int convertsToInteger(String s){

        int nextCompareChar = 1;
        int total = 0;
        Map<Character,Integer> integerRepresention = new HashMap<Character, Integer>(){{
            put('I' , 1);
            put('V' , 5);
            put('X' , 10);
            put('L' , 50);
            put('C' , 100);
            put('D' , 500);
            put('M' , 1000);
        }};

        for (int i = 0; i < s.length(); i += nextCompareChar){
            char charAtPosition = s.charAt(i);
            char charAtPositionPlusOne = i + 1 < s.length() ? s.charAt(i + 1) : 'A';
            if (charAtPosition == 'I'){
                if (charAtPositionPlusOne == 'V' || charAtPositionPlusOne == 'X'){
                    total += integerRepresention.get(charAtPositionPlusOne) - integerRepresention.get(charAtPosition);
                    nextCompareChar = 2;
                }
                else{
                    total += integerRepresention.get(charAtPosition);
                    nextCompareChar = 1;
                }
            }
            else if (charAtPosition == 'X'){
                if (charAtPositionPlusOne == 'L' || charAtPositionPlusOne == 'C'){
                    total += integerRepresention.get(charAtPositionPlusOne) - integerRepresention.get(charAtPosition);
                    nextCompareChar = 2;
                }
                else{
                    total += integerRepresention.get(charAtPosition);
                    nextCompareChar = 1;
                }
            }
            else if (charAtPosition == 'C'){
                if (charAtPositionPlusOne == 'D' || charAtPositionPlusOne == 'M'){
                    total += integerRepresention.get(charAtPositionPlusOne) - integerRepresention.get(charAtPosition);
                    nextCompareChar = 2;
                }
                else{
                    total += integerRepresention.get(charAtPosition);
                    nextCompareChar = 1;
                }
            }
            else{
                total += integerRepresention.get(charAtPosition);
                nextCompareChar = 1;
            }
        }

        return total;
    }

    public static void main(String[] args){
            System.out.println("Answer: " + RomanToInteger.convertsToInteger("IV"));


    }
}
