package exercises;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
      int[] source = {1, 3, 5, 7, 9, 11, 13, 15, 2, 4, 6, 8, 10, 12, 14};
//        int[] source = {5,6,7};
        final int numberToMake = 15;
        int[] result = doTwoNumbersInAnArrayAddUpTo(source, numberToMake);
        printResults(numberToMake, result, source);
//        result = doTwoNumbersInAnArrayAddUpToRefactoredForSpeed(source, numberToMake);
//        printResults(numberToMake, result, source);
    }

    private static void printResults(int numberToMake, int[] result, int[] source) {
        if (result[0] + result[1] == numberToMake){
            System.out.println("True: " + result[0] + " + " + result[1] + " == " + numberToMake);
        } else {
            System.out.println("FALSE :( no pairs in ");
            for (int element:source){
                System.out.println(element);
            }
            System.out.println(" add up to " + numberToMake);
        }
    }

    public static int[] doTwoNumbersInAnArrayAddUpTo(int[] source, int numberToMake) {
        int[] result = {0,0};
        for(int i = 0; i < source.length; i++){
            for(int h = 0; h < source.length - 1; h++){
                if (source[i] + source[h] == numberToMake){
                    result[0] = source[i];
                    result[1] = source[h];
                    break;
                }
            }

        }
        return result;
    }

    public static int[] doTwoNumbersInAnArrayAddUpToRefactoredForSpeed(int[] source, int numberToMake) {
        int[] result = {0, 0};
        Map<Integer, Integer> numberToFind = new HashMap<Integer, Integer>();

        for (int i = 0; i < source.length; i++ ){
            final int key = numberToMake - source[i];
            if(numberToFind.containsKey(key)){
                result[0] = source[i];
                result[1] = numberToFind.get(key);
                break;
            } else {
                numberToFind.put(source[i], source[i]);
            }

        }
        return result;
    }
}
