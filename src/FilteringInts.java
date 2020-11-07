import java.util.Arrays;

public class FilteringInts implements Filter<Integer> {
    @Override
    //accepts ints only equal to or greater than 0
    public boolean accept(Integer x) {
        if (x >= 0)
            return true;
        else
            return false;

    }
    //goes through the entire array and adds the unfiltered int in a new array
    public static int[] filter(int[] a, Filter<Integer> f) {
        int temp = 0;
        int[] tempArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (f.accept(a[i])) {
                tempArr[temp] = a[i];
                temp++;
            }
        }
        int[] positiveNumbers = Arrays.copyOf(tempArr, temp);
        return positiveNumbers;
    }
}