import java.util.Arrays;

public class MakeArrayConsecutive2 {

    // Read for MakeArrayConsecutive2.md for more details on this code quiz
    public static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int missingStatueCount = 0;
        for (int i = statues[0]; i <= statues[statues.length-1]; i++) {
            if (Arrays.binarySearch(statues, i) < 0) {
                missingStatueCount++;
            }
        }
        return missingStatueCount;
    }

    public static void main(String[] args) {
        int[] inputArray = {6, 2, 3, 8};
        assert 3 == makeArrayConsecutive2(inputArray);
    }
}
