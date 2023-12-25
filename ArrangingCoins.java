public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n)); // 3
    }

    public static int arrangeCoins(int no_of_coins) {
        int row = 1;
        while(no_of_coins > 0) {
            row++;
            no_of_coins = no_of_coins - row;
        }
        return row - 1;
    }
}
