class Solution {
    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                swap(A,i,index++);
            }
        }
        return A;
    }
    
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
