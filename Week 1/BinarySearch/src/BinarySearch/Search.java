package BinarySearch; 

public class Search {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        int target = 7;
        int result = binarySearch(data, target);
        System.out.println("Found at index: " + result);
    }
}