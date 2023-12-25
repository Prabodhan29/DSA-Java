import java.util.HashSet;

public class CheckSumZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3};
        findSum(arr); // true
    }
    public static void findSum(int[] arr) {
        HashSet<Integer> numbers = new HashSet<>();
        int sum = 0;
        boolean found = false;

        for(int element : arr) {
            numbers.add(sum);
            sum = sum + element;
            if(numbers.contains(sum)) {
                System.out.println("true");
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
