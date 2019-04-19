class Solution {
    // T: O(mn)
    // S: O(mn)
    public int numDistinct(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }

        int[][] dp = new int[t.length() + 1][s.length() + 1];

        for (int i = 1; i <= t.length(); i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j <= s.length(); j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}