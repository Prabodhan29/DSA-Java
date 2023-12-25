import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int num = 234;
        int product = 1;
        while(num > 0) {
            product = product * (num % 10);
            num = num / 10;
        }
        System.out.println(product);
    }
}
