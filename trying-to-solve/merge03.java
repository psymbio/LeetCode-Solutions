import java.util.Arrays;

class merge3 {
        public static void main (String args[]) {
                int[] nums1 = {1, 2, 3, 0, 0, 0};
                int[] nums2 = {2, 5, 6};
                int m = 3;
                int n = 2;
                int f = m;
                int i = 0, j = 0;

                for(i = m-1, j = 0; i < m+n; i++, j++) {
			nums1[i] = nums2[j];
		}
		Arrays.sort(nums1);
                for(i = 0; i < m+n; i++)
                        System.out.println(nums1[i]);
        }
}

