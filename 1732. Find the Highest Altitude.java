/**
1732. Find the Highest Altitude

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

**/

class Solution {
    public int largestAltitude(int[] gain) {
        
        int highest_altitude = 0;
        
        for(int i = 0; i < gain.length; i++){
            highest_altitude = highest_altitude + gain[i];
            gain[i] = highest_altitude;
        }

        highest_altitude = 0;
        for(int i : gain){
            highest_altitude = Math.max(i, highest_altitude);
        }

        return highest_altitude;
    }
}