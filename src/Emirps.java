import java.util.Arrays;

/**
 * Created by borisgrunwald on 02/11/2016.
 */
public class Emirps {


    public static void main(String[] args) {

        System.out.println("LOL");

    }

    public static long[] findEmirp(long n){

        long numOfEmirps = 0;
        long largestEmirp = 0;
        long sumOfEmirps = 0;

        for (int i = 0; i < n; i++) {
            if(isPrime1(i) && !isPalindrome(i)) {
                numOfEmirps++;
                largestEmirp = i;
                sumOfEmirps += i;
            }
        }

        return new long[]{numOfEmirps,largestEmirp,sumOfEmirps};

    }

    public static boolean isPrime1(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(long n) {

        StringBuilder s = new StringBuilder(String.valueOf(n)).reverse();
        StringBuilder s2 = new StringBuilder(String.valueOf(n));

        return s.toString().equals(s2.toString());

    }
}
