class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        /*
            for (int i = 0; i < nums.length; i++ ) {
                        if(nums[i] == 1) {
                                count++;
                                max = 1;
                                continue;
                        }
                        if (count > max)
                            max = count;
                        if(nums[i] == 0) 
                            count = 0;
                }
    
            return max;
        */
        for (int i = 0; i < nums.length; i++)
        { 
              
            // Reset count when 0 is found 
            if (nums[i] == 0)
                count = 0; 
      
            // If 1 is found, increment count 
            // and update result if count becomes 
            // more. 
            else
            { 
                count++;//increase count 
                max= Math.max(max, count);
            } 
        }
        return max;
    }
}
