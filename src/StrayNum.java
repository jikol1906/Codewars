import java.util.Arrays;

/**
 * Created by borisgrunwald on 24/10/2016.
 */
public class StrayNum {


    public static void main(String[] args) {

        int[] numbers = new int[]{1,1,2};
        int[] numbers2 = new int[]{17,17,3,17,17,17,17};

        System.out.println(stray(numbers2));

    }

    public static int stray(int[] numbers) {

        Arrays.sort(numbers);
        if(numbers[0] != numbers[1] && numbers[numbers.length-2] == numbers[numbers.length-1]) {
            return numbers[0];
        } else return numbers[numbers.length-1];

    }



}
