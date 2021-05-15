class Solution {
    public boolean validMountainArray(int[] A) {
        int flag = 0, count = 0;
                for (int i = 0; i < A.length; i++) {
                        if(A[i + 1] > A[i])
                                flag = 0;
                        else {
                                flag = 1;
                                break;
                        }
                        count++;
                }
                count = count + 1;
                for (int i = count; i < (A.length - 1); i++) {
                        if(A[i + 1] < A[i])  
                                flag = 0;
                        else {  
                                flag = 1;
                                break;       
                        }
                }
                if (flag == 0)
                        return true;
                else
                        return false;
    }
}
