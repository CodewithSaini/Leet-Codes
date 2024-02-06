public class CanJump {
    public boolean canJump(int[] nums) {
        int l = nums.length -1;
        for (int i = nums.length -2; i>-1; i--){
            if (i + nums[i] >= l){
                l = i;
            }
        }
        return l ==0;
    }
}
