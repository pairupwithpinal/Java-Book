import java.util.*;

public class ReverseNo {


    int n, rev = 0;

    void reverse() {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0;
        System.out.println("Enter the Number: ");
        n = sc.nextInt();

        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse of given number is :" + rev);
    }

}