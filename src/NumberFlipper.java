public class NumberFlipper {
    public int reverse(int input) {
        int rev = 0;
        while (0 != input) {
            rev = (rev * 10) + input % 10;
            input = input / 10;
        }
        return rev;
    }
}
