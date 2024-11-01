
import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] arr = new int[n];    

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(minimumSwapsToBeautiful(arr));
        scanner.close();
    }

    public static int minimumSwapsToBeautiful(int[] arr) {
        // Clone the original array for ascending and descending order calculation
        int[] ascending = arr.clone();
        int[] descending = arr.clone();

        Arrays.sort(ascending);
        Arrays.sort(descending);
        reverseArray(descending);

        // Calculate the number of swaps required for both sorted states
        int swapsAscending = countSwapsToSort(arr.clone(), ascending);
        int swapsDescending = countSwapsToSort(arr.clone(), descending);

        // Return the minimum of the two swap counts
        return Math.min(swapsAscending, swapsDescending);
    }

    // Method to count minimum swaps to sort the array into a given target state
    public static int countSwapsToSort(int[] arr, int[] target) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        HashMap<Integer, Integer> positionMap = new HashMap<>();

        // Build a position map of the original array elements
        for (int i = 0; i < n; i++) {
            positionMap.put(arr[i], i);
        }

        int swapCount = 0;

        for (int i = 0; i < n; i++) {
            // If the element is already in its target position or visited, skip it
            if (visited[i] || arr[i] == target[i]) {
                continue;
            }

            // Calculate the cycle size
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = positionMap.get(target[j]);
                cycleSize++;
            }

            // If there is a cycle
            if (cycleSize > 1) {
                swapCount += (cycleSize - 1);
            }
        }
        return swapCount;
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
