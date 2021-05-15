// closer to the solution but this is a variable nightmare.
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int numRefuels = 0, currentPostionIndex = 0, j = 0, lastPositionIndex = 0, currentPosition = 0, currentGas = 0;
        if (startFuel == target)
            return 0;
        if (startFuel != 0) {
                currentPosition = startFuel;
                if (currentPostion < station[0][0])
                    return -1; // because then the car can't even go to the first postion
                startFuel = 0;
            }
        while (currentPositionIndex <= stations.length) { // that gives you the number of rows
            currentPositionIndex = lastPositionIndex;
            newPositionIndex = currentPositionIndex;
            while (newPosition < stations.length && stations[newPostionIndex][0] - stations[lastPostionIndex][0] <= currentGas - the gas it took to reach there) {
                currentPostion = stations[currentPositionIndex][0];
                newPositionGas -= stations[newPostionIndex][0] - stations[lastPostionIndex][0];
                newPositionGas += stations[currentPostionIndex][1];
            }
            currentGas = newPositionGas;
            currentPostionIndex = newPositionIndex;
            if (currentPositionIndex == lastPostionIndex)
                return -1;
            if (i <= stations.length)
                numRefuels += 1;
            currentPositionIndex++;
        }
        return numRefuels;
    }
}
