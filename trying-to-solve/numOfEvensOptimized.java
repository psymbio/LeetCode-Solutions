class numOfEvensOptimized {
	public static void main(String args[]) {
		int[] nums = {232, 234, 345, 453, 235, 245};
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if((nums[i] > 9 && nums[i]<100) || (nums[i] > 999 && nums[i] < 10000))
				count++;
		}
		System.out.println(count);
	}
}
