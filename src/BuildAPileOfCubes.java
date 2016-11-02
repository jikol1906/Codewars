/**
 * Created by borisgrunwald on 25/10/2016.
 */
public class BuildAPileOfCubes {

    public static void main(String[] args) {


        System.out.println(findNb(1071225L));

    }

    public static long findNb(long m) {

        long n = 0L;

        while(m > 0) {
            n++;
            long nCubed = (long) Math.pow(n,3);
            m = m - nCubed;

        }

        return m == 0 ? n : -1;

    }
}
