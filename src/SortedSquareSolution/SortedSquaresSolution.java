package SortedSquareSolution;

import java.util.Scanner;

public class SortedSquaresSolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i= 0; i< count; i++){
            nums[i] = scanner.nextInt();
        }

        int[] ints = sortedSquares(nums);
        for (int i =  0; i< ints.length; i++){
            System.out.print(ints[i]+" ");
        }
    }

    public static int[] sortedSquares(int[] nums){
        for (int i = 0; i< nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }

        for (int i = 0; i< nums.length; i++){
            for (int j = 0; j< nums.length-1; j++){
                if (nums[j+1]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
