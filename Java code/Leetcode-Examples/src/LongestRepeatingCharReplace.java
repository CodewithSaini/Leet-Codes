import java.util.HashMap;

public class LongestRepeatingCharReplace {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        int l = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            frequency.compute(s.charAt(i), (key, v) -> (v == null) ? 1 :v +1);
            int maxValue = -1;
            for (Integer v: frequency.values()){
                if (v >= maxValue) maxValue = v;
            }
            System.out.println(maxValue);
            while ( (i -l +1) - maxValue > k ){
                frequency.compute(s.charAt(l), (key, v) -> (v-1));
                l++;
            }
            result = Math.max(result, i-l+1);
        }
        return result;
    }
}
