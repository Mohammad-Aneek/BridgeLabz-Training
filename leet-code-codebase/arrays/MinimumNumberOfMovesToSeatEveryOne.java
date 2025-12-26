// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/submissions/1865689771
// problem  number 2037: Minimum Number of Moves To SeatEveryOne
class MinimumNumberOfMovesToSeatEveryOne {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i = 0 ; i<seats.length ; i++)
        {
            ans+= Math.abs(seats[i]-students[i]);
        }

        return ans;
    }
}
