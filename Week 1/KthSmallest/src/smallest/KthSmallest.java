package smallest;
import java.util.*;

public class KthSmallest {
	    public static int findKthSmallest(int[] arr, int k) {
	        if (arr == null || k <= 0 || k > arr.length) {
	            throw new IllegalArgumentException("Invalid value of K");
	        }

	        Arrays.sort(arr);

	        return arr[k - 1];
	    }

	    public static void main(String[] args) {
	        int[] numbers = {7, 10, 4, 3, 20, 15};
	        int k = 4;

	        int result = findKthSmallest(numbers, k);
	        System.out.println("The " + k + "th smallest element is: " + result);
	    }
	}
