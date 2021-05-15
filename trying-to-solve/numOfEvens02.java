class numOfEvens2 {
        public static void main (String arg[]) {
                int[] nums = {437,315,322,431,686,264,442};
                int evens = 0, count = 0;
                        for (int i =0; i < nums.length; i++) {
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

