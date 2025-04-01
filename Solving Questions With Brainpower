class Solution {
  long[] dp;
  public long mostPoints(int[][] questions) {
    dp = new long[questions.length];
    Arrays.fill(dp, -1);
    return helper(questions,0);
  }
  private long helper(int[][] q, int idx) {
    if(idx >= q.length){
      return 0;
    }

    if(dp[idx] != -1){
      return dp[idx];
    }

    int points=q[idx][0];
    long skip=helper(q,idx+1);
    long solve = helper(q, idx + q[idx][1]+1) + points;
    return dp[idx]=Math.max(skip, solve);

  }
}
