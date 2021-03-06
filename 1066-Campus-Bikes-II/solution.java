class Solution {
    public int assignBikes(int[][] workers, int[][] bikes) {
        int[][] dist = new int[workers.length][bikes.length];
        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < bikes.length; j++) {
                dist[i][j] = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
            }
        }
        boolean[] used = new boolean[bikes.length];
        return minDist(dist, 0, used);
    }

    private int minDist(int[][] dist, int worker, boolean[] used) {
        if (worker >= dist.length) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int[] d = dist[worker];
        for (int i = 0; i < d.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            min = Math.min(min, d[i] + minDist(dist, worker + 1, used));
            used[i] = false;
        }
        return min;
    }
}