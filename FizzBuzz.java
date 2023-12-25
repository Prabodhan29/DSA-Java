import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {
        // method 1
        m1();

        // method 2
        m2();
    }

    public static void m1() {
        for(int i=1; i<=100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void m2() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3, "Fizz");
        hm.put(5, "Buzz");
        hm.put(7, "Fazz");

        final int N = 100;

        for(int i=0; i<=N; i++) {
            // sb becomes empty after each iteration, otherwise we will be printing something at each iteration
            StringBuffer sb = new StringBuffer();

            // iterate over each hm row
            for(Map.Entry<Integer, String> hmElement : hm.entrySet()) {
                if(i % hmElement.getKey() == 0) {
                    sb.append(hmElement.getValue());
                }
            }
            if(sb.length() == 0) {
                System.out.println(i);
            }
            else {
                System.out.println(sb);
            }
        }
    }
}
