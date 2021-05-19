// https://www.geeksforgeeks.org/recursive-program-to-generate-power-set/

// https://afteracademy.com/blog/print-all-subsets-of-a-given-set

class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        int temp_result = 0, result = 0, n = nums.size();
        int subset_size = pow(2, n);
        for(int i = 0; i < subset_size; ++i) 
        {
            int subset[n];
            temp_result = 0;
            for(int j = 0; j < subset_size; ++j)
            { 
                // Check if jth bit in the index is set
                // If set then add jth element to the subset
                if(i & (1 << j)) {
                    subset[j] = nums[j];
                    temp_result ^= nums[j];
                }
            }
           result += temp_result;
        }
        
        return result;
    }
};
