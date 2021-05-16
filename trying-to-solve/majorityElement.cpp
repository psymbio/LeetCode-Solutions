/*https://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html*/

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int max_count = 0;
        int max_int = nums[0];
        int temp_int = nums[0];
        int temp_count = 0;
        for(int i = 0; i < nums.size(); ++i) {
            temp_count = 0;
            temp_int = nums[i];
            for(int j = 0; j < nums.size(); ++j) {
                if(nums[j] == temp_int)
                    temp_count++;
            }
             if (temp_count > max_count) {
                    max_count = temp_count;
                    max_int = temp_int;
            }
        }
        return max_int;
    }
};
