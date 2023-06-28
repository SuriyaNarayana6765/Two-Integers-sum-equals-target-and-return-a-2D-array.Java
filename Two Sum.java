import java.util.*;

public class TwoSum {

    public static List<List<Integer>> findPairs(int[] arr, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pairs.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return pairs;
    }

    public static void mergeArray(int[] arr) {
        Arrays.sort(arr);
        int[] mergedArray = new int[arr.length];
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] <= arr[j]) {
                mergedArray[i] = arr[i];
                i++;
            } else {
                mergedArray[i] = arr[j];
                j++;
            }
        }
        while (i < arr.length) {
            mergedArray[i] = arr[i];
            i++;
        }
        arr = mergedArray;
    }

    public static List<List<Integer>> findDoublePairs(int[] arr, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        pairs.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 4;
        List<List<Integer>> pairs = findPairs(arr, target);
        System.out.println("First Combination For “4” : " + pairs);
        mergeArray(arr);
        int doubleTarget = 2 * target;
        List<List<Integer>> doublePairs = findDoublePairs(arr, doubleTarget);
        System.out.println("Second Combination For “8” : " + doublePairs);
    }
}
