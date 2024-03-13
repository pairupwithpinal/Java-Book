public class ReverseNo {




    public int getReverse_num(int reverse_num) {
        int rev = 0;
        while (reverse_num > 0) {
            rev = (rev * 10) + reverse_num % 10;
            reverse_num = reverse_num / 10;
        }
        return rev;


    }


}