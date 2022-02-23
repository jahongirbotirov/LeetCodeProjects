package SearchInsertSolution;

import java.util.Scanner;

public class SearchInsertSolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int count = scanner.nextInt();
        int[] nums  = new int[count];
        for (int i = 0; i< count; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int middle = (right+left)/2;
            int guess = nums[middle];
            if (target == guess){
                return middle;
            }else if (guess>target){
                right = middle-1;
            }else {
                left = middle+1;
            }
        }
        return left;
    }
}
