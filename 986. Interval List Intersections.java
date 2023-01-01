class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> superList = new LinkedList<>();
        List<int[]> resList = new LinkedList<>();
        for(int i = 0; i<firstList.length; i++) {
            int interval[] = {firstList[i][0], firstList[i][1]};
            superList.add(interval);
        }
        for(int i = 0; i<secondList.length; i++) {
            int interval[] = {secondList[i][0], secondList[i][1]};
            superList.add(interval);
        }
        Collections.sort(superList, (o1, o2) -> o1[0] - o2[0]);
        for(int i = 0; i<superList.size() - 1; i++) {
            int interval1[] = superList.get(i);
            int interval2[] = superList.get(i + 1);
            if(interval1[0] == interval2[0]) {
                if(interval1[1] <= interval2[1]) {
                    int interval[] = {interval1[0], interval1[1]};
                    resList.add(interval);
                }
                else {
                    int intervalOverlap[] = {interval2[0], interval1[1]};
                    superList.remove(i + 1);
                    superList.add(i + 1, intervalOverlap);
                    int interval[] = {interval2[0], interval2[1]};
                    resList.add(interval);
                }
            }
            else if(interval1[0] < interval2[0]) {
                if(interval1[1] < interval2[0]) continue;
                else if(interval1[1] == interval2[0]) {
                    int interval[] = {interval1[1], interval2[0]};
                    resList.add(interval);
                }
                else {
                    if(interval1[1] <= interval2[1]) {
                        int interval[] = {interval2[0], interval1[1]};
                        resList.add(interval);
                    }
                    else {
                        int intervalOverlap[] = {interval2[0], interval1[1]};
                        superList.remove(i + 1);
                        superList.add(i + 1, intervalOverlap);
                        int interval[] = {interval2[0], interval2[1]};
                        resList.add(interval);
                    }
                }
            }
        }
        return resList.toArray(new int[resList.size()][]);
    }
}
