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
    private static getNextGap(int gap) {
    	gap = (gap*10)/13;
    	if (gap < 1) {
    		return 1;
    	}
    	return gap;
    }
    public void combSort(Shape[] inArray, Comparator<java.awt.Shape> comp) {
    	int aLength = inArray.length;
    	
    	int gap = aLength;
    	
    	boolean swapped = true;
    	
	    while (gap != 1 || swapped == true) {
	    	gap = getNextGap(gap);
	    	swapped = false;
	    		
	    	for (int i=0; i<(aLength-gap); i++) { //comparison
	    		int result;
	    		if (comp == null) { //if no comparator sorts by height (default)
	    			result = inArray[i].compareTo(inArray[i+gap]);
	    		} else { //sorts by comparators sort method
	    			result = comp.compare(inArray[i], inArray[i+gap]);
	    		}
	    		if (result > 0) {
	    			int temp = inArray[i];
	    			inArray[i] = inArray[i+gap];
	    			inArray[i+gap] = temp;
	    			swapped = true;
	    		}
	    	}
	    }
    }
}
