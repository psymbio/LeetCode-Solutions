// this is a rapid prototype of the solution from exmaple 3
// hopefully in 6 more iterations I find the solution
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int numRefuels = 0, i = 0, j = 0, lastPosition = 0, currentPosition = 0, currentGas = 0, lastGas = 0;
        if (startFuel == target)
            return 0;
        if (startFuel != 0) {
                currentPosition = startFuel;
                if (currentPostion < station[0][0])
                    return -1; // because then the car can't even go to the first postion
                startFuel = 0;
            }
        while (i <= stations.length) { // that gives you the number of rows
            currentPosition = lastPosition;
            while (i < stations.length && j  < stations[i].length && 20 - 10 <= currentGas) {
                currentPostion = 60;
                currentGas = 40;
            }
            if (currentPosition == lastPostion)
                return -1;
            if (i <= stations.length)
                numRefuels += 1;
            i++;
        }
        return numRefuels;
    }
}
