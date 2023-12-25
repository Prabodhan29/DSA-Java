import java.util.Arrays;
import java.util.HashSet;

public class IsSubsetOrNot {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 32, 7};
        int[] arr2 =  {11, 3, 7, 1}; // No
        isSubset(arr1, arr2);
    }
    public static void isSubset(int[] a1, int[] a2) {
        String ans = "yes";

        HashSet<Integer> nums = new HashSet<>();
        for(int x1 : a1) {
            nums.add(x1);
        }

        for (int j : a2) {
            if (!nums.contains(j)) {
                System.out.println("No");
            }
        }
    }
}
