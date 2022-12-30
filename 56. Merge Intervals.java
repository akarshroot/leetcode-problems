class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new LinkedList<>();
        for(int i = 0; i<intervals.length - 1; i++) {
            if(intervals[i][1] >= intervals[i + 1][0]) {
                if(intervals[i][1] <= intervals[i + 1][1]) {
                    intervals[i + 1][0] = intervals[i][0];
                }
                else {
                    intervals[i + 1][0] = intervals[i][0];
                    intervals[i + 1][1] = intervals[i][1];
                }
            } else {
                int temp[] = {intervals[i][0], intervals[i][1]};
                list.add(temp);
            }
        }
        int last[] = {intervals[intervals.length - 1][0], intervals[intervals.length - 1][1]};
        list.add(last);
        int res[][] = new int[list.size()][2];
        for(int i = 0; i<list.size(); i++) {
            int temp[] = list.get(i);
            res[i][0] = temp[0];
            res[i][1] = temp[1];
        }
        return res;
    }
}
