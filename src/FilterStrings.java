import java.util.Arrays;

public class FilterStrings implements Filter<String> {
    @Override
    //If the length is greater than 8, returns true
    public boolean accept(String x) {
        if (x.length() > 8)
            return true;
         else
            return false;
    }

    //goes through the entire array and adds the unfiltered string in a new array
    public static String[] filter(String[] a, Filter<String> f) {
        int temp = 0;
        String[] tempArr = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (f.accept(a[i])) {
                tempArr[temp] = a[i];
                temp++;
            }
        }
        String[] longStrings = Arrays.copyOf(tempArr, temp);
        return longStrings;
    }

}