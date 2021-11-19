public class evenOddSwap {
    public static int[] evenOddSwap(int[] nums) {
        int n = nums.length;
        int [] biao = new int[n+10];
        for(int i = 0; i<n; i=i+1) biao [i] = 0;
        for(int i = 0; i<n; i=i+1) {
            if(nums[i] % 2 == 1 && biao [i] == 0){
                for(int j = 0; j < n; j=j+1){
                    if(nums[j] % 2 == 0 && biao[j] ==0){
                        int huan = nums[i];
                        nums[i]= nums [j];
                        nums[j]= huan;
                        biao [i] =1;
                        biao[j] = 1;
                        break;
                    }
                }
            }
        }
        return nums;

    }
}
