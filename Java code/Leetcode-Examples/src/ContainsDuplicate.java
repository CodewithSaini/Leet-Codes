import java.util.HashSet;

public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> n = new HashSet<Integer>();
            for (int i=0; i<nums.length; i++){
                if (n.contains(nums[i])){
                    return true;
                }

                else{
                    if (i > 0 && (nums[i] == nums[i-1])){
                        return true;
                    }
                    if (i < nums.length-1 && (nums[i] == nums[i+1])){
                        return true;
                    }
                    n.add(nums[i]);
                }
            }
            return false;
        }

}
