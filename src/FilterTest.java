import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//test class for the filters
public class FilterTest {
    public static void main(String[] args) {
        FilterStrings str = new FilterStrings();
        String[] arr = new String[4];
        arr[0] = "123456789";
        arr[1] = "Test";
        arr[2] = "12345678910";
        arr[3] = "Hello";
        System.out.println("String Array Before: " + Arrays.toString(arr));
        String[] tempArr = str.filter(arr, str);
        System.out.println("String Array after: " + Arrays.toString(tempArr));
        FilteringInts num = new FilteringInts();
        int[] arr2 = new int[4];
        arr2[0] = 1;
        arr2[1] = -1;
        arr2[2] = -2;
        arr2[3] = 2;
        System.out.println("int Array Before: " + Arrays.toString(arr2));
        int[] tempArr2 = num.filter(arr2, num);
        System.out.println("int Array after: " + Arrays.toString(tempArr2));
    }
}

