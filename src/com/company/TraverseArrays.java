package com.company;

public class TraverseArrays {
    public static int countEven(int [] nums){
        int even = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2 == 0){
                even++;
            }
        }
        return even;
    }
    public static int[] buildArray (int length){
        int[] output = new int[length];
        for (int i = 0; i < length; i++){
            output[i] = i;
        }
        return output;
    }
    public static boolean sum28(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==2){
                sum += nums[i];
            }
        }
        if (sum == 8){
            return true;
        }
        else {
            return false;
        }
    }
    public static int[] zeroMax(int[] original){
        int[] output = new int[original.length];

        for (int i = 0; i < original.length; i++){
            if (original[i]==0){
                for (int ii = i; ii < original.length; ii++){
                    if (original[ii]>output[i]){
                        output[i] = original[ii];
                    }
                }
            }
            else {
                output[i] = original[i];
            }
        }
        return output;
    }


    public static void main(String[] args){
//        int[] nums = {2, 2, 0};
//        System.out.print(countEven(nums));
//        System.out.print(buildArray(2));
//        int[] nums = {2, 3, 2, 2, 4, 2, 2};
//        System.out.print(sum28(nums));
    }
}
