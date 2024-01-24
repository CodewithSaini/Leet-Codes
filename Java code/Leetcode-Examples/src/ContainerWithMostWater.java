public class ContainerWithMostWater {
    public int TotalArea(int[] height){
        int totalArea = 0;
        int i = 0;
        int j = height.length-1;
        while( i < j){
            int minHeight = Math.min(height[i], height[j]);
            int width = j - i;
            totalArea = Math.max(totalArea, minHeight*width);
            System.out.println(totalArea);
            if (height[i] <= height[j]){
                i++;
            }else {
                j--;
            }
        }
        return totalArea;
    }
}
