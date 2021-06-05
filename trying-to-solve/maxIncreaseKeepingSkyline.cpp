// Online C++ compiler to run C++ program online
#include <iostream>
#include <vector>
    int maxIncreaseKeepingSkyline(std::vector<std::vector<int>>& grid) {
        std::vector<int> top_bottom;
        int temp_top = 0;
        std::vector<int> left_right;
        int temp_left = 0;
        
        int result = 0;
        for(int i = 0; i < grid.size(); ++i) {
            temp_left = grid[i][0];
            for(int j = 0; j < grid[i].size(); ++j) {
                if(grid[i][j] > temp_left)
                    temp_left = grid[i][j];
            }
            left_right.push_back(temp_left);
        }
        
        for(int i = 0; i < grid[1].size(); ++i) {
            temp_top = grid[0][i];
            for(int j = 0; j < grid.size(); ++j) {
                if(grid[j][i] > temp_top)
                    temp_left = grid[j][i];
            }
            left_right.push_back(temp_top);
        }
        
        for(int i = 0; i < grid.size(); ++i) {
            for(int j = 0; j < grid[i].size(); ++j) {
                if(std::min(left_right[i], top_bottom[i]) - grid[i][j] > 0)
                    result += std::min(left_right[i], top_bottom[i]) - grid[i][j];
            }
        }
        
        return result;
    }
int main() {
    std::vector<std::vector<int>> vect
    {
        {3,0,8,4},
        {2,4,5,7},
        {9,2,6,3},
        {0,3,1,0}
    };
    
    int a = maxIncreaseKeepingSkyline(vect);
    std::cout << a;
    return 0;
}
