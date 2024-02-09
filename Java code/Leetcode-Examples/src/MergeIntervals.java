import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MergeIntervals {
    public int[][] merge(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] firstInterval = intervals[0];
        result.add(firstInterval);
        for (int[] interval: intervals){
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
