class maxOneSubmitted {
	public static void main (String args[]) {
		int[] nums = {0, 1, 0, 0, 1, 0};
		int count = 0;
		int max = 0;
		
        /*if (nums.length == 1) {
            if (nums[0] == 0)
                System.out.println("0");
            else
                System.out.println("1");
        }
        else*/ {
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
                System.out.println(max);
        }
	}
}

