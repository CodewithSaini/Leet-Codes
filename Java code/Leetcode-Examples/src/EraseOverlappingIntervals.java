import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlappingIntervals {
    public int removeOverlappingIntervals(int[][] intervals) {
        int result = 0;
        int prevEnd = intervals[0][1];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        for (int i=1; i<intervals.length; i++) {
            int first = intervals[i][0];
            int second = intervals[i][1];
            if (first >= prevEnd){
                prevEnd = second;
            }
            else{
                result++;
                prevEnd = Math.min(prevEnd, second);
            }
        }

        return result;
    }
}
