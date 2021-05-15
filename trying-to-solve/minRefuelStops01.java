class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int numRefuels = 0, i = 0, lastRefuels = 0, currentRefuels = 0, gas = 0;
        if (startFuel == target)
            return 0;
        while (i <= stations.length) {
            currentRefuels = lastRefuels;
            while (currentRefuels <= stations.length && stations[currentRefuels + 1][1] - stations[lastRefuels][1] >= stations[i][0])
                currentRefuels = lastRefuels;
            if (currentRefuels == lastRefuels)
                return -1;
            if (currentRefuels <= stations.length)
                numRefuels += 1;
        }
        return numRefuels;
    }
}

// this solution was inpired from week 3 of Algorithmic Toolbox on Coursera
// link: https://github.com/psymbio/algorithmic-toolbox/tree/master/week3
//
// obviously it got acceppted because the runcase was an exception
// but when it actually got to submission it failed
// failed miserably
//
// I don't even know if this solution makes sense...
// welp
// It's actually a direct copy paste from the psuedocode of Algorithmic Toolbox
//
// Even the solution video was 38 minutes long (https://youtu.be/_kgtrSxRNhM)
//
// And here I am, giddy after copy pasting some code in 5 minutes.
