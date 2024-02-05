import java.util.ArrayList;
import java.util.HashMap;
import  java.util.List;

public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> frequency = new HashMap<>(nums.length);
        for (int i : nums){
            frequency.put(i, frequency.getOrDefault(i, 0)+1);
        }
        for(int i: frequency.keySet()){
            int value = frequency.get(i);
            if (bucket[value] == null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(i);
        }
        int[] result = new int[k];
        int count = 0;
        for (int i=bucket.length; i>=0 && count <k; i--){
            if (bucket[i] != null){
                for(int val: bucket[i]){
                    result[count] = val;
                    count++;
                }
            }
        }
        return result;
    }
}
