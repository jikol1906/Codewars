import java.util.*;

/**
 * Created by borisgrunwald on 29/10/2016.
 * Could not solve
 */
public class GapInPrimes {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(gap(4,2,10)));

    }


    /*public static long[] gap(int g, long m, long n) {

        List<Long> primes = new LinkedList<>();
        List<Long> numbers = new LinkedList<>();

        for (long i = 2; i <= n; i++) {
            numbers.add(i);
        }

        while (!numbers.isEmpty()) {

            long front = numbers.remove(0);
            //front number will always be prime since all multiples of previous numbers are removed.
            primes.add(front);
            Iterator<Long> it = numbers.iterator();

            //Remove all multiples of the front of primes.
            while (it.hasNext()) {
                long current = it.next();
                if (current % front == 0) {
                    it.remove();
                }
            }

            if(numbers.size() != 0 && front > m && front + g == numbers.get(0)) {
                return new long[]{front,numbers.get(0)};
            }

        }


        return null;


    }*/

    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }

        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }







}
