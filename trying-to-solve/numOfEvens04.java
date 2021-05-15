class numOfEvens4 {
        public static void main (String arg[]) {
                int[] nums = {437,315,322,431,686,264,442};
                int evens = 0, count = 0;
		nums.join().split(',')
                        for (int i =0; i < nums.length; i++) {
                        if ((int.Parse(nums[i].ToString()) % 2) == 0)
                                evens++;
                }
                System.out.println(evens);
        }
}

