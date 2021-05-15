class numOfEvens {
	public static void main (String arg[]) {
		int[] nums = {12, 345, 2, 6, 7896, 0};
		int evens = 0, count = 0;
			for (int i : nums) {
			while(nums[i] != 0) {
				nums[i] /= 10;
				++count;
			}
			if(count % 2 == 0)
				++evens;
		}
		System.out.println(evens);
	}
}
