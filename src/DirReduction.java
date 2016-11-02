import java.util.*;

/**
 * Created by borisgrunwald on 26/10/2016.
 */
public class DirReduction {

    public static void main(String[] args) {

        String[] directions = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};


        System.out.println(Arrays.toString(dirReduc(directions)));

    }

    public static String[] dirReduc(String[] arr) {

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size()-1; i++) {
            if(isOpposite(list.get(i),list.get(i+1))) {
                list.remove(i);
                list.remove(i);
                i = -1;
            }
        }

        String[] toReturn = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            toReturn[i] = list.get(i);
        }

        return toReturn;

    }

    public static boolean isOpposite(String s, String s2) {

        if(s.equals("SOUTH") && s2.equals("NORTH") || s.equals("NORTH") && s2.equals("SOUTH")) return true;
        if(s.equals("EAST") && s2.equals("WEST") || s.equals("WEST") && s2.equals("EAST")) return true;
        return false;

    }
}
