public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int leftP = 1;
        int rightP = 1;
        while (left < nums.length && right > -1){
            if (left != 0){
                leftP *= nums[left-1];
            }
            if(right != nums.length-1){
                rightP *= nums[right+1];
            }

            leftArray[left] = leftP;
            rightArray[right] = rightP;

            left++;
            right--;
        }
        for (int i=0; i<nums.length; i++){
            leftArray[i] = leftArray[i]*rightArray[i];
        }
        return leftArray;

    }
}
