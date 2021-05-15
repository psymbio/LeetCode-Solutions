import java.util.Arrays;

class sortedSquares {
        public static void main(String args[]) {
                int[] A = {2, 4, -5, -3, 1, 0};
                int count = 0;
		int[] squared = new int[A.length];
                for (int i = 0; i < A.length; i++) {
                	squared[i] = A[i] * A[i];	
                }
		Arrays.sort(squared);
		for (int i = 0; i < squared.length; i++) {
			System.out.println(squared[i]);
		}
        }
}

