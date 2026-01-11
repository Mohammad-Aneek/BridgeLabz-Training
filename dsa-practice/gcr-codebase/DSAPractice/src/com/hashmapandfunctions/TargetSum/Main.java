package com.hashmapandfunctions.TargetSum;

public class Main {

	public static void main(String[] args) {
		TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        
        if(solver.check(nums, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("No pair found.");
        }
	}

}
