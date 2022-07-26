package staticModel;

public class PreSum {
    public int[] PreSumInit(int[] nums){
        int[] preSum = new int[nums.length+1];
        for (int i =0;i<nums.length;i++){
            preSum[i+1]=preSum[i]+ nums[i];
        }
        return preSum;
    }
}
