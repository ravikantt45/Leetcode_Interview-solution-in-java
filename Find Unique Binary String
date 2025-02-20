
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> seen = new HashSet<>(Arrays.asList(nums));
        int n = nums.length;

        for (int i = 0; i < (1 << n); i++) {
            String binary = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (!seen.contains(binary)) {
                return binary;
            }
        }
        return "";
    }
}
