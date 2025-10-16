package utilities;

import java.util.Comparator;
import shapes.Shape;


public final class Sorting {

    private Sorting() {}

    public static void bubbleSort(Shape[] arr, Comparator<Shape> comp) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                Shape a = arr[j];
                Shape b = arr[j + 1];

                int result;

                if (comp == null) {
                    result = a.compareTo(b);
                } else {
                    result = comp.compare(a, b);
                }

                if (result < 0) {
                    arr[j] = b;
                    arr[j + 1] = a;
                }
            }
        }
    }
}
