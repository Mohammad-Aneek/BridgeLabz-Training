// https://leetcode.com/problems/partition-array-according-to-given-pivot/submissions/1867822376
// 2161. Partition Array According to Given Pivot

class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans  = new int[nums.length];
        int ind = 0;
        int similar = 0;
        for(int i:nums)
            if(i < pivot)
                ans[ind++] = i;
            else if (i==pivot) similar++;
            
        while(similar-- > 0)
            ans[ind++] = pivot;

        for(int i:nums)
            if(i>pivot)
                ans[ind++]=i;

        return ans;
    }
}
