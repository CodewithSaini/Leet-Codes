public class CombinationSum {
    public int combinationSum4(int[] nums, int target) {
        int[] result = new int[target+1];
        result[0] = 1;
        for( int i =1; i<result.length; i++){
            for (int j=0; j<nums.length; i++){
                if (i - nums[j] > 0){
                    result[i] += result[i-nums[j]];
                }
            }
        }
        return result[target];
    }
}
