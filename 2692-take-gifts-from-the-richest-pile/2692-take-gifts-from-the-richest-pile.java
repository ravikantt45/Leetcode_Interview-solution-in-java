class Solution {
    public long pickGifts(int[] gifts, int k) {

    long ans = 0;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
    for(int g: gifts) maxHeap.add(g);
    while(k-- > 0) maxHeap.add((int)Math.sqrt(maxHeap.poll()));
    while(!maxHeap.isEmpty()) ans+= maxHeap.poll();
    return ans;
}
        
    }
