import java.util.Scanner;
class Duplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for (int j = 1; j < n; j++) {   
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
class Demo{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
Duplicates ss=new Duplicates();
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }
        int newLength = ss.removeDuplicates(nums);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}