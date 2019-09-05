package utils;

public class LengthOfLongestSubstring {

    // TODO: Repeat + 1 is where we continue the search from

    public static int lengthOfLongestSubstring(String s) {

        String longestSubstring = "";
        StringBuffer currentWord = new StringBuffer();

        if (s.length() == 1){
            return 1;
        }

        int position = 0;
        int previousRepeat = 0;

        while (position < s.length()){
            int repeat =  currentWord.toString().indexOf(s.charAt(position));
            if (repeat == -1){
                currentWord.append(s.charAt(position));
                position += 1;
            }
            else{
                if (currentWord.length() > longestSubstring.length()){
                    longestSubstring = new String(currentWord);
                }
                currentWord = new StringBuffer();
                position = previousRepeat + repeat + 1;
                previousRepeat = position;
            }

            if (s.length() - 1 <= position && currentWord.length() > longestSubstring.length()){
                longestSubstring = new String(currentWord);
            }
        }

        return longestSubstring.length();


    }

    public static void main(String[] args){
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
    }
}
