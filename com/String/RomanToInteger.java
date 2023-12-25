public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXXX";
        System.out.println(romanToInt(s)); // 1930
    }
    public static int romanToInt(String s) {
        int sum = 0;

        s=s.replace("IV", "IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD", "CCCC");
        s=s.replace("CM", "DCCCC");

        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++) {
            switch(c[i]) {
                case 'I':
                    sum = sum + 1;
                    break;
                case 'V':
                    sum = sum + 5;
                    break;
                case 'X':
                    sum = sum + 10;
                    break;
                case 'L':
                    sum = sum + 50;
                    break;
                case 'C':
                    sum = sum + 100;
                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;
            }
        }

        return sum;
    }
}
