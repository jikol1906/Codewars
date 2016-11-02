import java.util.Arrays;

/**
 * Created by borisgrunwald on 25/10/2016.
 */
public class DataReverse {


    public static void main(String[] args) {

        int[] n = new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};

        System.out.println(Arrays.toString(DataReverse(n)));

    }



    public static int[] DataReverse(int[] data) {

        int[] toReturn = new int[data.length];
        int index = 0;

        for (int i = data.length-2; i >= 0; i--) {
            if(i % 8 == 0) {
                System.arraycopy(data, i, toReturn, index * 8, 8);
                index++;
            }

        }

        return toReturn;

    }


}
