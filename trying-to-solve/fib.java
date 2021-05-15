class Solution {
    public int fib(int N) {
	// solved this in the first go
	// possible mistakes you make while doing this 
	// is not returning f0 and f1 when N is 0 and 1
	//
	// also refer to: Algorithmic Toolbox's week2
	// https://github.com/psymbio/algorithmicToolbox/blob/master/week2/README.md
        int f0 = 0, f1 = 1, f = 0;
        if(N==0)
            return f0;
        else if(N==1)
            return f1;
        else {
            for(int i = 2; i <= N; i++) {
                f = f0 + f1;
                f0 = f1;
                f1 = f;
            }
        }
        return f;
    }
}
