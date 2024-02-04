public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        else if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i=2; i<nums.length; i++){
            result[i] = Math.max(result[i-2] + nums[i], result[i-1]);
        }
        return result[nums.length-1];
    }

    public int rob2(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        else if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] resultLeavingLast = new int[nums.length-1];
        int[] resultLeavingFirst = new int[nums.length -1];
        for (int i=0; i<nums.length-1; i++){
            resultLeavingFirst[i] = nums[i+1];
            resultLeavingLast[i] = nums[i];
        }
        int firstLeft = rob(resultLeavingFirst);
        int lastLeft = rob(resultLeavingLast);

        return Math.max(firstLeft, lastLeft);
    }
}
