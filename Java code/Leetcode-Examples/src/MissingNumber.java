public class MissingNumber {
    public int missingNumber(int[] nums){
        int num = 0;
        for (int i=0; i<= nums.length; i++){
            num = num^i;
        }
        for (int i=0; i< nums.length; i++){
            num = num^nums[i];
        }
        return num;
    }
}
