class Solution {
public:
    int reverse(int x) {
        int neg = 0;
        if (x < 0)
            neg = 1;
        int absolute_x = abs(x);
        if (x == 0)
            return 0;
        if (absolute_x < 10 && neg == 0)
            return absolute_x;
        if (absolute_x < 10 && neg == 1)
            return absolute_x * -1;
        if (x<INT_MIN|| x>INT_MAX)
            return 0;
        int remainder = 0;
        long long result = 0;
        while (absolute_x) {
            remainder = absolute_x % 10;
            result = result * 10 + remainder;
            absolute_x = absolute_x / 10;
        }
        
        if (neg == 1)
            return result * -1;
        return result;
    }
};
