public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        int[] result = new int[n+1];
        result[n] = 1;
         for (int i = n-1; i>-1; i--){
             if (s.charAt(i) == '0'){
                 result[i] = 0;
             }
             else {
                 result[i] = result[i+1];
             }
             if (i+1 < n){
                 if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i+1) <= '6')){
                     result[i] += result[i+2];
                 }
             }

         }
         return result[0];
    }
}
