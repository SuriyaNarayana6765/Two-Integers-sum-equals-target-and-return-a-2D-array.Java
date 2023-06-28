import java. util.scanner;

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

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 4;
        List<List<Integer>> pairs = find pairs(arr, target);
        System. out.println("First Combination For “4” : " + pairs);
        mergeArray(arr);
        int double target = 2 * target;
        List<List<Integer>> double pairs = findDoublePairs(arr, double target);
        System. out.println("Second Combination For “8” : " + double pairs);
    }
}
