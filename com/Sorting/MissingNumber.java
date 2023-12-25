package com.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 3, 1};
        System.out.println(missingNumber(nums)); // 2
    }

    public static int missingNumber(int[] nums) {
        // sorting the array
        int i=0;
        while(i<nums.length) {
            int correct = nums[i];
            // we have an extra condition to avoid
            // IndexOutOfBoundsError
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }


        // checking
        for(int index=0; index<nums.length; index++) {
            if(nums[index] != index) {
                // because if we returned nums[index]
                // then we will be getting the wrong element
                // as the right element should be present at that
                // index, but instead some other element is present.
                // So, returning the index means that we are returning
                // the missing element
                return index;
            }
        }

        // as elements are present in the range 0 to n
        // where n is the length of the array
        // for cases like - [0, 1]
        // 0 to n means 0, 1, 2
        // But we can't return 2 from the above for loop.
        // So, we return n -> as 2 is n.
        return nums.length;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
