package max;

public class MaximumElement {
	    public static int findMaximum(int[] arr) {
	        
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty");
	        }

	        
	        int max = arr[0];

	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {12, 45, 2, 89, 34, 67, 10};
	        
	        int result = findMaximum(numbers);
	        System.out.println("The maximum element is: " + result);
	    }
	}
