class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] duparr = new int[2 * len];
        for(int i=0;i<len;i++){
            duparr[i]=nums[i];
            duparr[i + len] = nums[i];

        }
        return duparr;
    }
}