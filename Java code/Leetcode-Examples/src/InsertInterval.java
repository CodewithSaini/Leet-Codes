import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] temp = new int[intervals.length+1][2];
        for(int i = 0; i<intervals.length; i++){
            temp[i] = intervals[i];
        }
        temp[intervals.length] = newInterval;
        Arrays.sort(temp, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] firstInterval = temp[0];
        result.add(firstInterval);
        for (int[] interval: temp){
            if (interval[0] <= firstInterval[1]){
                firstInterval[1] = Math.max(interval[1], firstInterval[1]);
            }else{
                firstInterval = interval;
                result.add(firstInterval);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
