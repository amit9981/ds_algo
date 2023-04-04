package newbranch.com.harry.list;

import java.util.Arrays;
import java.util.List;

/*WAP to check given 2nd sequence is valid or not */
public class CheckSubSequenceOfList {
    public static void main(String[] args) {
//        arr=[5, 1, 22, 25, 6, -1, 8, 10]
//        seq=[1, 6, -1, 10]
//        o/p=true

        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10)));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIndex = 0;
        int seqIndex = 0;
        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrIndex).equals(sequence.get(seqIndex))) {
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();

    }
}
