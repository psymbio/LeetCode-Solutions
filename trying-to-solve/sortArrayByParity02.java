class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        
        while (left < right)
        {
            // Right is even, check left
            if (A[right] % 2 == 0)
            {
                // Left is odd, swap both and move both ptrs
                if (A[left] % 2 != 0)
                {
                    int temp = A[left];
                    A[left] = A[right];
                    A[right] = temp;
                    
                    left++;
                    right--;
                }
                else    // Left is also even, swap right with ele next to left
                {
                    int temp = A[left + 1];
                    A[left + 1] = A[right];
                    A[right] = temp;
                    
                    // Only increment left ptr but move ahead by 1 more since we know the next ele is already even
                    left += 2;
                }
                
                
            }
            else    // Right is odd
            {
                // If left also odd, swap left with the ele next to right
                if (A[left] % 2 != 0)
                {
                    int temp = A[left];
                    A[left] = A[right - 1];
                    A[right - 1] = temp;
                    
                    // Only decremt right ptr but move down by 1 more since we know the next right ele is already odd
                    right -= 2;
                }
                else
                {
                    // Right is odd, left is even, they are in their proper positions
                    left++;
                    right--;
                }
            }
        }
        
        return A;
    }
}
