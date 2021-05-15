class validMountainArray {
        public static void main (String args[]) {
                int[] nums = {1, 3, 2};
                int flag = 0, count = 0;
            	for (int i = 0; i < nums.length; i++) {
			if(nums[i + 1] > nums[i])
				flag = 0;
			else {
				flag = 1;
				break;
			}
			count++;
        	}
		count = count + 1;
		for (int i = count; i < (nums.length - 1); i++) {
			if(nums[i + 1] < nums[i])  
                                flag = 0;
                        else {  
                                flag = 1;
                                break;       
                        }
                }
		if (flag == 0)
			System.out.println("Success");
		else
			System.out.println("Failure");
        }
}

