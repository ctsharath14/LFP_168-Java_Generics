import java.util.List;

public class Maximum <T extends Comparable<T>> {
    //generic method to find maximum for list of elements
    public <T extends Comparable<T>> T findMaxList(List<T> arr) {
        T max = arr.get(0);
        for (T key : arr) {
            if (key.compareTo(max) > 0) {
                max = key;
            }
        }
        return max;
    }

    //generic method to find maximum for 3 elements
    public <T extends Comparable<T>> T findMax(T a, T b, T c) {
        System.out.println("\nThe Numbers/Strings are : " + a + ","+ b + "," + c);
        T max = a;
        if (max.compareTo(b) < 0) {
            max = b;
        }
        if (max.compareTo(c) < 0) {
            max = c;
        }
        return max;
    }
}