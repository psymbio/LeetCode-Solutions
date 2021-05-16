class Solution {
public:
    bool isNumber(string s) {
        int y = 0;
        int z = 0;
        for (int i=0; i<s.length(); ++i)
        {
            if (isalpha(s[i]))
                y = 1;
            else{
                y = 0;
                break;
            }
        }
        
        if(y == 1)
            return false;
        
        else{
            
            for (int i=0; i<s.length(); ++i)
            {
                if (isalpha(s[i])) {
                    if (s[i] != 'e' || s[i] != 'E') {
                        z = 1;
                        break;   
                    }
                }
            }
            if (z == 0) {
                return true;
            }
            return false;   
        }
    }
};
