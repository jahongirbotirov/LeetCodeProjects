package RotateSolution;

import java.util.Scanner;

public class RotateSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        int key = scanner.nextInt();
        for (int i = 0; i< count; i++){
            nums[i] = scanner.nextInt();
        }


        rotate(nums,key);
    }

    public static void rotate(int[] nums, int k){
        while (k!=0){
            int[]secArr = new int[nums.length];
            secArr[0] = nums[nums.length-1];
            for (int i=0; i< nums.length-1; i++){
                secArr[i+1] = nums[i];
            }
            nums = secArr;
            k--;
        }

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i< nums.length; i ++){
            s.append(nums[i]);
            if (i== nums.length-1)
                System.out.println(s.append("]"));
            s.append(",");
        }

    }
}
