package com.eazybytes.message;

public class TestMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        solution.canCompleteCircuit(gas, cost);
    }

}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int costGas = 0;
        int currentGas = 0;
        int currentCost = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            currentGas = currentGas + gas[i];
            currentCost = cost[i];
            sumGas += gas[i];
            costGas += cost[i];
            if(currentGas < currentCost) {
                start = i + 1;
                currentGas = 0;
                currentCost = 0;
            }
            currentGas = currentGas - currentCost;
        }
        return (sumGas >= costGas) ? start : -1;
    }
}