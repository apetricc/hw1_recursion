package csci333hw1;
/**
 *
 * @author andrew petriccione
 */
public class Csci333HW1 {
    /**
     * @param arr --An integer array to be searched for the target integer.
     * @param target --The integer to be searched for within the array.
     * @param beginAt --The index of the lower bound of the (sub)array to search
     * within.
     * @param endAt --The index of the upper bound of the (sub)array to search
     * within.
     */
    public static int trinarySearch(int[] arr, int target, int beginAt, int endAt) {
        //base cases:
        if (endAt - beginAt < 2) {
            if (arr[beginAt] == target) {
                return beginAt;
            }
            if (arr[endAt] == target) {
                return endAt;
            }
            return -1;
        } else {
            //recursive cases
            int oneThird = ((endAt - beginAt) / 3) + beginAt;
            int twoThird = (((endAt - beginAt) * 2) / 3) + beginAt;

            if (target == arr[oneThird]) {
                return oneThird;
            } else if (target < arr[oneThird]) {
                return trinarySearch(arr, target, beginAt, oneThird - 1);
            }
            if (target == arr[twoThird]) {
                return twoThird;
            } else if (target < arr[twoThird]) {
                return trinarySearch(arr, target, oneThird + 1, twoThird - 1);
            }
            
            return trinarySearch(arr, target, twoThird + 1, endAt);
        }

    }
/**
 * 
 * @param arr The array to be printed
 * @return The array as a String
 */
    public static String arrayPrinter(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += "[" + arr[i] + "]";
        }
        return result;
    }
/**
 * 
 * @param arr  The array to run trinarySearch on and print the results of
 * @param target The target number that will be searched for in trinarySearch
 */    
    public static void arrayRunner(int[] arr, int target) {
        System.out.println("The array looks like this: " + arrayPrinter(arr));
        System.out.println("The target is.......... " + target);        
        System.out.println("The target is at index: " + trinarySearch(arr, target, 0, arr.length - 1));
    }

    public static void main(String[] args) {  
        int[] myArr1 = {1, 2, 3, 4, 5, 6};       
        int[] myArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myArr3 = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};
        int[] myArr4 = {3,99,100,107,900,1111,3200}; 
        int[] myArr5 = {-1, 9, 100, 200};
        arrayRunner(myArr1, 5);
        arrayRunner(myArr2, 99);
        arrayRunner(myArr2, 9);
        arrayRunner(myArr3, 13);
        arrayRunner(myArr3, 16);
        arrayRunner(myArr4, 14);
        arrayRunner(myArr4, 3200);
        arrayRunner(myArr5, 999);
        arrayRunner(myArr5, -1);
        
    }
}
    
