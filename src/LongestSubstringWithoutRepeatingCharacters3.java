import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s){
        if(s.length()==0){
            return 0;
        }
        char[] array = s.toCharArray();
        Map<Character,Integer> chars = new HashMap<Character,Integer>();
        int max = 0;
        int counter = 1;
        for (int i = 0 ; i < array.length-1; i++){
            chars.put(array[i],i);
            if(!chars.containsKey(array[i+1])){
                counter++;
            }
            else{
                if(counter>max){
                    max = counter;
                }
                i = chars.get(array[i+1]);
                chars.clear();
                counter = 1;
            }
        }
        if(counter>max){
            return counter;
        }
        return max;
    }
}
