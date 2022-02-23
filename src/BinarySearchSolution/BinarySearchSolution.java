package BinarySearchSolution;

import java.util.Scanner;

public class BinarySearchSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(search(nums, target));

//        for (int i = 0; i<count; i++){
//            System.out.print(nums[i]+" ");
//        }

    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int midd = (low + high) / 2;
            int guess = nums[midd];
            if (target == guess) {
                return midd;
            } else if (guess > target) {
                high = midd - 1;
            } else {
                low = midd + 1;
            }

        }
        return -1;
    }
}
