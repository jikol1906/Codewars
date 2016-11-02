import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by borisgrunwald on 24/10/2016.
 */
public class WeightForWeight {

    public static void main(String[] args) {

        String numbers = "2000 10003 1234000 44444444 9999 11 11 22 123";

        System.out.println(orderWeight(numbers));



    }

    public static String orderWeight(String strng) {

        String[] arr = strng.split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(calcWeight(o1) == calcWeight(o2)) {
                    return o1.compareTo(o2);
                } else return calcWeight(o1) - calcWeight(o2);

            }
        });

        return Arrays.toString(arr).replace("[","").replace("]","").replace(",","");

    }

    public static int calcWeight(String num) {

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }

        return sum;

    }

}
